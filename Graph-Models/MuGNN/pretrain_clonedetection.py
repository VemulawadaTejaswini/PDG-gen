import argparse

from loader import MoleculeDataset
from torch_geometric.data import DataLoader

import torch
import torch.nn as nn
import torch.nn.functional as F
import torch.optim as optim

from tqdm import tqdm
import numpy as np

from model import GNN, GNN_graphpred
from sklearn.metrics import roc_auc_score

from splitters import scaffold_split, random_scaffold_split, random_split, custom_split
import pandas as pd

import os
import sys
import shutil

from tensorboardX import SummaryWriter

## NEW IMPORTS
import random
import platform
from sklearn.metrics import (
    recall_score,
    precision_score,
    f1_score,
    accuracy_score,
    matthews_corrcoef,
)

from plot_results import single_line_plot, two_lines_plot
    
def plot_training_and_validation_loss(training_loss, validation_loss, epochs, location):
    two_lines_plot(epochs, training_loss, epochs, validation_loss, "Training Loss", "Validation Loss", "Epoch", "Loss", "Training and Validation Loss", location + "/traing_valid_loss.jpg")

def plot_training_and_test_results(training_result, test_result, epochs, location):
    training_acc = [float("{:.2f}".format(res[0] * 100)) for res in training_result]
    training_f1 = [float("{:.2f}".format(res[3] * 100)) for res in training_result]
    testing_acc = [float("{:.2f}".format(res[0] * 100)) for res in test_result]
    testing_f1 = [float("{:.2f}".format(res[3] * 100)) for res in test_result]
    two_lines_plot(epochs, training_acc, epochs, testing_acc, "Training Accuracy", "Test Accuracy", "Epoch", "Accuracy", "Training and Test Accuracy", location + "/traing_test_accuracy.jpg")
    two_lines_plot(epochs, training_f1, epochs, testing_f1, "Training F1", "Test F1", "Epoch", "F1 Score", "Training and Test F1 Scores", location + "/traing_test_f1.jpg")

def accuracy(y, pred):
    return accuracy_score(y, pred)

def f1(y, pred, average=None):
    if average:
        return f1_score(y, pred, average=average, zero_division=0)
    return f1_score(y, pred, average="weighted", zero_division=0)

def recall(y, pred, average=None):
    if average:
        return recall_score(y, pred, average=average, zero_division=0)
    return recall_score(y, pred, average="weighted", zero_division=0)

def precision(y, pred, average=None):
    if average:
        return precision_score(y, pred, average=average, zero_division=0)
    return precision_score(y, pred, average="weighted", zero_division=0)

def performance(y, pred, average=None):
    acc = accuracy(y, pred)
    f = f1(y, pred, average=average)
    re =recall(y, pred, average=average)
    pre = precision(y, pred, average=average)
    return acc, pre, re, f

def train_code_clone_detection(args, model, device, loader, optimizer):
    criterion = nn.MSELoss()
    model.train()
    total_loss, count = 0, 0
    for step, batch in enumerate(tqdm(loader, desc="Iteration")):
        optimizer.zero_grad()
        batch = batch.to(device)
        batchloss= 0
        for data in batch:
            label=torch.tensor(data.y, dtype=torch.float, device=device)
            prediction_1 = model(data.x1, data.edge_index1, data.edge_attr1, True)
            prediction_2 = model(data.x2, data.edge_index2, data.edge_attr2, True)
            cosine_similarity = F.cosine_similarity(prediction_1, prediction_2)
            batchloss = batchloss + criterion(cosine_similarity, label)

        batchloss.backward(retain_graph=True)
        optimizer.step()
        loss = batchloss.item()
        total_loss+=loss
        count += 1

    print("Training Loss:", total_loss/count)
    return (total_loss/count).detach().cpu().numpy()

def eval_code_clone_detection(args, model, device, loader):
    criterion = nn.MSELoss()
    model.eval()
    total_loss, count = 0, 0
    tp, tn, fp, fn, correct = 0, 0, 0, 0, 0
    results = []
    for step, batch in enumerate(tqdm(loader, desc="Iteration")):
        batch = batch.to(device)
        batchloss= 0
        for data in batch:
            label=torch.tensor(data.y, dtype=torch.float, device=device)
            prediction_1 = model(data.x1, data.edge_index1, data.edge_attr1, True)
            prediction_2 = model(data.x2, data.edge_index2, data.edge_attr2, True)
            cosine_similarity = F.cosine_similarity(prediction_1, prediction_2)
            results.append(cosine_similarity.item())
            prediction = torch.sign(cosine_similarity).item()
            batchloss = batchloss + criterion(cosine_similarity, label)
            loss = batchloss.item()
            total_loss += loss
            
            if prediction>args.threshold and label.item()==1:
                tp+=1
                correct += 1
            if prediction <= args.threshold and label.item()==-1:
                tn+=1
                correct += 1
            if prediction>args.threshold and label.item()==-1:
                fp+=1
            if prediction<=args.threshold and label.item()==1:
                fn+=1
            count += 1

    p,r,f1,acc = 0.0, 0.0, 0.0, 0.0
    if tp+fp==0:
        print('precision is none')
        return
    p=tp/(tp+fp)
    if tp+fn==0:
        print('recall is none')
        return
    r=tp/(tp+fn)
    f1=2*p*r/(p+r)
    acc = correct / count
    return (acc, p, r, f1), (total_loss/count).detach().cpu().numpy()

def main():
    # Training settings
    parser = argparse.ArgumentParser(description='PyTorch implementation of pre-training of graph neural networks')
    parser.add_argument('--device', type=int, default=0,
                        help='which gpu to use if any (default: 0)')
    parser.add_argument('--batch_size', type=int, default=8,
                        help='input batch size for training (default: 32)')
    parser.add_argument('--epochs', type=int, default=10,
                        help='number of epochs to train (default: 100)')
    parser.add_argument('--lr', type=float, default=0.001,
                        help='learning rate (default: 0.001)')
    parser.add_argument('--lr_scale', type=float, default=1,
                        help='relative learning rate for the feature extraction layer (default: 1)')
    parser.add_argument('--decay', type=float, default=0,
                        help='weight decay (default: 0)')
    parser.add_argument('--num_layer', type=int, default=5,
                        help='number of GNN message passing layers (default: 5).')
    parser.add_argument('--emb_dim', type=int, default=300,
                        help='embedding dimensions (default: 300)')
    parser.add_argument('--dropout_ratio', type=float, default=0,
                        help='dropout ratio (default: 0)')
    parser.add_argument('--graph_pooling', type=str, default="mean",
                        help='graph level pooling (sum, mean, max, set2set, attention)')
    parser.add_argument('--JK', type=str, default="last",
                        help='how the node features across layers are combined. last, sum, max or concat')
    parser.add_argument('--gnn_type', type=str, default="gin")
    parser.add_argument('--dataset', type=str, default = 'crypto-api', help='root directory of dataset. For now, only classification.')
    parser.add_argument('--input_model_file', type=str, default = '', help='filename to read the model (if there is any)')
    parser.add_argument('--filename', type=str, default = '', help='output filename')
    parser.add_argument('--seed', type=int, default=42, help = "Seed for splitting the dataset.")
    parser.add_argument('--runseed', type=int, default=seed, help = "Seed for minibatch selection, random initialization.")
    parser.add_argument('--split', type = str, default="scaffold", help = "random or scaffold or random_scaffold")
    parser.add_argument('--eval_train', type=int, default = 1, help='evaluating training or not')
    parser.add_argument('--num_workers', type=int, default = 4, help='number of workers for dataset loading')
    parser.add_argument("--threshold", default=0)
    args = parser.parse_args()
        
    os.environ["CUDA_VISIBLE_DEVICES"] = "1,2,3"
    args.device = 1
    device = torch.device("cuda:" + str(args.device)) if torch.cuda.is_available() else torch.device("cpu")

    #Bunch of classification tasks
    args.dataset = "clone-detection" # Possible values: "clone-detection"
    if args.dataset == "clone-detection":
        num_tasks = 1
    else:
        raise ValueError("Invalid dataset name.")

    #set up dataset and transform function.
    dataset_root = "/home/siddharthsa/cs21mtech12001-Tamal/API-Misuse-Prediction/PDG-gen/Repository/Graph-Models/MuGNN/dataset"
    args.output_plots = "/home/siddharthsa/cs21mtech12001-Tamal/API-Misuse-Prediction/PDG-gen/Repository/Graph-Models/MuGNN/output/plots"
    args.output_model_file = "/home/siddharthsa/cs21mtech12001-Tamal/API-Misuse-Prediction/PDG-gen/Repository/Graph-Models/MuGNN/output/saved_models"
    
    #set up dataset
    dataset = MoleculeDataset(dataset_root, dataset=args.dataset)
    print("Dataset Loaded!!!")
    sys.exit()
    print(dataset)
    
    args.split = "custom"
    if args.split == "custom":
        train_dataset, valid_dataset, test_dataset = custom_split(dataset)
        print("custom split")
    elif args.split == "scaffold":
        smiles_list = pd.read_csv('dataset/' + args.dataset + '/processed/smiles.csv', header=None)[0].tolist()
        train_dataset, valid_dataset, test_dataset = scaffold_split(dataset, smiles_list, null_value=0, frac_train=0.8,frac_valid=0.1, frac_test=0.1)
        print("scaffold")
    elif args.split == "random":
        train_dataset, valid_dataset, test_dataset = random_split(dataset, null_value=0, frac_train=0.8,frac_valid=0.1, frac_test=0.1, seed = args.seed)
        print("random")
    elif args.split == "random_scaffold":
        smiles_list = pd.read_csv('dataset/' + args.dataset + '/processed/smiles.csv', header=None)[0].tolist()
        train_dataset, valid_dataset, test_dataset = random_scaffold_split(dataset, smiles_list, null_value=0, frac_train=0.8,frac_valid=0.1, frac_test=0.1, seed = args.seed)
        print("random scaffold")
    else:
        raise ValueError("Invalid split option.")

    print(train_dataset[0])

    train_loader = DataLoader(train_dataset, batch_size=args.batch_size, shuffle=True, num_workers = args.num_workers)
    val_loader = DataLoader(valid_dataset, batch_size=args.batch_size, shuffle=False, num_workers = args.num_workers)
    test_loader = DataLoader(test_dataset, batch_size=args.batch_size, shuffle=False, num_workers = args.num_workers)

    #set up model
    args.num_layer = 3
    args.emb_dim = 768
    args.gnn_type = "gcn"
    args.input_model_file = ""
    model = GNN(args.num_layer, args.emb_dim, JK = args.JK, drop_ratio = args.dropout_ratio, gnn_type = args.gnn_type).to(device)
    if not args.input_model_file == "":
        model.load_state_dict(torch.load(args.input_model_file))
        print("Loaded the model!!")
    
    model.to(device)

    #set up optimizer
    optimizer = optim.Adam(model.parameters(), lr=args.lr, weight_decay=args.decay)
    print(optimizer)

    train_acc_list = []
    val_acc_list = []
    test_acc_list = []
    training_loss_list = []
    epochs_list = []
    validation_loss_list = []

    args.epochs = 10
    for epoch in range(1, args.epochs):
        print("====epoch " + str(epoch))
        
        if args.dataset in ["clone-detection"]:
            training_loss = train_code_clone_detection(args, model, device, train_loader, optimizer)

        print("====Evaluation")
        if args.eval_train:
            if args.dataset in ["clone-detection"]:
                train_acc, _ = eval_code_clone_detection(args, model, device, train_loader)
        else:
            print("omit the training accuracy computation")
            train_acc = 0
            
        if args.dataset in ["clone-detection"]:
            val_acc, val_loss = eval_code_clone_detection(args, model, device, val_loader)
            test_acc, test_loss = eval_code_clone_detection(args, model, device, test_loader)

        print("train(acc, prec, rec, f1): {} val(acc, prec, rec, f1): {} test(acc, prec, rec, f1): {}".format(train_acc, val_acc, test_acc))
        print("Training Loss: {}, Validation Loss: {} and Test Loss: {}".format(training_loss, val_loss, test_loss))

        val_acc_list.append(val_acc)
        test_acc_list.append(test_acc)
        train_acc_list.append(train_acc)
        epochs_list.append(epoch+1)
        training_loss_list.append(training_loss)
        validation_loss_list.append(val_loss)
        
    plot_training_and_validation_loss(training_loss_list, validation_loss_list, epochs_list, args.output_plots)
    plot_training_and_test_results(train_acc_list, test_acc_list, epochs_list, args.output_plots)
        
# To ensure determinism
seed = 1234
def seed_everything(seed: int):
    random.seed(seed)
    np.random.seed(seed)
    torch.manual_seed(seed)
    torch.cuda.manual_seed_all(seed)
    os.environ['PYTHONHASHSEED'] = str(seed)
    torch.backends.cudnn.deterministic = True
seed_everything(seed)

# Check versions
print("Torch version: ", torch.__version__)
print("Torch cuda version: ", torch.version.cuda)
print("Python version: ", platform.python_version())

if __name__ == "__main__":
    main()
