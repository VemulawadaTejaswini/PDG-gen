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
from model_ng import CustomGCN

from sklearn.metrics import roc_auc_score

from splitters import scaffold_split, random_scaffold_split, random_split, custom_split
import pandas as pd

import os
import sys
import shutil

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
    two_lines_plot(epochs, training_acc, epochs, testing_acc, "Training Accuracy", "Validation Accuracy", "Epoch", "Accuracy", "Training and Validation Accuracy", location + "/traing_validation_accuracy.jpg")
    two_lines_plot(epochs, training_f1, epochs, testing_f1, "Training F1", "Validation F1", "Epoch", "F1 Score", "Training and Validation F1 Scores", location + "/traing_validation_f1.jpg")

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

def create_batches(dataset, args):
    batches = [dataset[graph : min(graph + args.batch_size, len(dataset))] for graph in range(0, len(dataset), args.batch_size)]
    return batches

def train_code_clone_detection(args, model, device, train_loader_1, train_loader_2, train_loader_label, optimizer):
    criterion = nn.MSELoss()
    model.train()
    total_loss, count = 0, 0
    tp, tn, fp, fn, correct = 0, 0, 0, 0, 0
    for step, (batch_1, batch_2, label_batch) in enumerate(tqdm(zip(train_loader_1, train_loader_2, train_loader_label), total = len(train_loader_1))):
        optimizer.zero_grad()
        
        batch_1 = batch_1.to(device)
        batch_2 = batch_2.to(device)
        label_batch = label_batch.float()
        label_batch = label_batch.to(device)
        
        prediction_1 = model(batch_1.x, batch_1.edge_index, batch_1.batch)
        prediction_2 = model(batch_2.x, batch_2.edge_index, batch_2.batch)
        cosine_similarity = F.cosine_similarity(prediction_1, prediction_2)
        batchloss = criterion(cosine_similarity, label_batch)
        batchloss.backward()
        optimizer.step()
        loss = batchloss.item()
        total_loss += loss
        
        for i in range(len(cosine_similarity)):
            prediction = torch.sign(cosine_similarity[i]).item()
            if prediction > args.threshold and int(label_batch[i]) == 1:
                tp+=1
                correct += 1
            if prediction <= args.threshold and int(label_batch[i]) == -1:
                tn+=1
                correct += 1
            if prediction > args.threshold and int(label_batch[i]) == -1:
                fp+=1
            if prediction <= args.threshold and int(label_batch[i]) == 1:
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
    print("Training Loss: ", total_loss/len(train_loader_1))
    return (acc, p, r, f1), total_loss/len(train_loader_1)

def eval_code_clone_detection(args, model, device, loader_1, loader_2, loader_label):
    criterion = nn.MSELoss()
    model.eval()
    total_loss, count = 0, 0
    tp, tn, fp, fn, correct = 0, 0, 0, 0, 0
    results = []
    for step, (batch_1, batch_2, label_batch) in enumerate(tqdm(zip(loader_1, loader_2, loader_label), total = len(loader_1))):
        batch_1 = batch_1.to(device)
        batch_2 = batch_2.to(device)
        label_batch = label_batch.float()
        label_batch = label_batch.to(device)
        
        prediction_1 = model(batch_1.x, batch_1.edge_index, batch_1.batch)
        prediction_2 = model(batch_2.x, batch_2.edge_index, batch_2.batch)
        cosine_similarity = F.cosine_similarity(prediction_1, prediction_2)
        batchloss = criterion(cosine_similarity, label_batch)
        total_loss += batchloss.item()
            
        for i in range(len(cosine_similarity)):
            prediction = torch.sign(cosine_similarity[i]).item()
            if prediction > args.threshold and int(label_batch[i]) == 1:
                tp+=1
                correct += 1
            if prediction <= args.threshold and int(label_batch[i]) == -1:
                tn+=1
                correct += 1
            if prediction > args.threshold and int(label_batch[i]) == -1:
                fp+=1
            if prediction <= args.threshold and int(label_batch[i]) == 1:
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
    return (acc, p, r, f1), total_loss/len(loader_1)

def main():
    # Training settings
    parser = argparse.ArgumentParser(description='PyTorch implementation of pre-training of graph neural networks')
    parser.add_argument('--device', type=int, default=0,
                        help='which gpu to use if any (default: 0)')
    parser.add_argument('--batch_size', type=int, default=32,
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
    parser.add_argument('--eval_train', type=int, default = 0, help='evaluating training or not')
    parser.add_argument('--num_workers', type=int, default = 4, help='number of workers for dataset loading')
    parser.add_argument("--threshold", default=0)
    args = parser.parse_args()
        
    os.environ["CUDA_VISIBLE_DEVICES"] = "0,1,2,3"
    args.device = 0
    device = torch.device("cuda:0") if torch.cuda.is_available() else torch.device("cpu")

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
    print(dataset)
    
    args.split = "custom"
    if args.split == "custom":
        train_dataset, valid_dataset, test_dataset = custom_split(dataset, args.dataset)
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

    if args.dataset == "clone-detection":
        train_loader_1, train_loader_2, train_loader_label = [], [], []
        for data1, data2, label in train_dataset:
            train_loader_1.append(data1)
            train_loader_2.append(data2)
            train_loader_label.append(label)
        train_loader_1 = DataLoader(train_loader_1, batch_size=args.batch_size, shuffle=False, num_workers = args.num_workers)
        train_loader_2 = DataLoader(train_loader_2, batch_size=args.batch_size, shuffle=False, num_workers = args.num_workers)
        train_loader_label = DataLoader(train_loader_label, batch_size=args.batch_size, shuffle=False, num_workers = args.num_workers)
        if(len(train_loader_1) == len(train_loader_2) and len(train_loader_1) == len(train_loader_label)):
            print("\nTraining dataset loader size: ", len(train_loader_1))
        
        valid_loader_1, valid_loader_2, valid_loader_label = [], [], []
        for data1, data2, label in valid_dataset:
            valid_loader_1.append(data1)
            valid_loader_2.append(data2)
            valid_loader_label.append(label)
        valid_loader_1 = DataLoader(valid_loader_1, batch_size=args.batch_size, shuffle=False, num_workers = args.num_workers)
        valid_loader_2 = DataLoader(valid_loader_2, batch_size=args.batch_size, shuffle=False, num_workers = args.num_workers)
        valid_loader_label = DataLoader(valid_loader_label, batch_size=args.batch_size, shuffle=False, num_workers = args.num_workers)
        if(len(valid_loader_1) == len(valid_loader_2) and len(valid_loader_1) == len(valid_loader_label)):
            print("\nValidation dataset loader size: ", len(valid_loader_1))
        
        test_loader_1, test_loader_2, test_loader_label = [], [], []
        for data1, data2, label in test_dataset:
            test_loader_1.append(data1)
            test_loader_2.append(data2)
            test_loader_label.append(label)
        test_loader_1 = DataLoader(test_loader_1, batch_size=args.batch_size, shuffle=False, num_workers = args.num_workers)
        test_loader_2 = DataLoader(test_loader_2, batch_size=args.batch_size, shuffle=False, num_workers = args.num_workers)
        test_loader_label = DataLoader(test_loader_label, batch_size=args.batch_size, shuffle=False, num_workers = args.num_workers)
        if(len(test_loader_1) == len(test_loader_2) and len(test_loader_1) == len(test_loader_label)):
            print("\nTest dataset loader size: ", len(test_loader_1))
    else:
        train_loader = DataLoader(train_dataset, batch_size=args.batch_size, shuffle=False, num_workers = args.num_workers)
        val_loader = DataLoader(valid_dataset, batch_size=args.batch_size, shuffle=False, num_workers = args.num_workers)
        test_loader = DataLoader(test_dataset, batch_size=args.batch_size, shuffle=False, num_workers = args.num_workers)

    #set up model
    # args.num_layer = 3
    # args.emb_dim = 768
    # args.gnn_type = "gcn"
    # args.input_model_file = ""
    # model = GNN(args.num_layer, args.emb_dim, JK = args.JK, drop_ratio = args.dropout_ratio, gnn_type = args.gnn_type, device = device)
    # if not args.input_model_file == "":
    #     model.load_state_dict(torch.load(args.input_model_file))
    #     print("Loaded the model!!")
    
    
    model = CustomGCN(num_node_features= 768, device = device)
    #args.input_model_file = "/home/siddharthsa/cs21mtech12001-Tamal/API-Misuse-Prediction/PDG-gen/Repository/Graph-Models/MuGNN/output/saved_models/model.pth"
    if not args.input_model_file == "":
        model.load_state_dict(torch.load(args.input_model_file))
        print("Loaded the model!!")
    model.to(device)

    #set up optimizer
    optimizer = optim.Adam(model.parameters(), lr=args.lr, weight_decay=args.decay)
    print(optimizer)

    train_acc_list = []
    val_acc_list = []
    training_loss_list = []
    epochs_list = []
    validation_loss_list = []
    
    patience = 0
    best_f1 = 0
    args.epochs = 20
    for epoch in range(0, args.epochs):
        
        print("====epoch " + str(epoch+1))
        if args.dataset in ["clone-detection"]:
            train_acc, training_loss = train_code_clone_detection(args, model, device, train_loader_1, train_loader_2, train_loader_label, optimizer)

        print("====Evaluation")
        if args.dataset in ["clone-detection"]:
            val_acc, val_loss = eval_code_clone_detection(args, model, device, valid_loader_1, valid_loader_2, valid_loader_label)

        print("train(acc, prec, rec, f1): {} val(acc, prec, rec, f1): {}".format(train_acc, val_acc))
        print("Training Loss: {} and Validation Loss: {}".format(training_loss, val_loss))

        val_acc_list.append(val_acc)
        train_acc_list.append(train_acc)
        epochs_list.append(epoch+1)
        training_loss_list.append(training_loss)
        validation_loss_list.append(val_loss)
        
        if val_acc[3] > best_f1:
            best_f1 = val_acc[3]
            print("\n======F1 score improved, saving the model")
            if not args.output_model_file == "":
                torch.save(model.state_dict(), args.output_model_file + "/model.pth")
            patience = 0
        else:
            patience += 1
            if patience == 3:
                print("\nStopping training after {} epochs as the score didn't improve in consecutive {} epochs".format(epoch+1, patience))
                break
        
    print("========= Evaluation (Best Model) on Test Data =========")
    if not args.output_model_file == "":
        model.load_state_dict(torch.load(args.output_model_file + "/model.pth"))
    if args.dataset in ["clone-detection"]:
        test_acc, test_loss = eval_code_clone_detection(args, model, device, test_loader_1, test_loader_2, test_loader_label)
    print("Test(acc, prec, rec, f1): {}".format(test_acc))
    
    plot_training_and_validation_loss(training_loss_list, validation_loss_list, epochs_list, args.output_plots)
    plot_training_and_test_results(train_acc_list, val_acc_list, epochs_list, args.output_plots)
        
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
