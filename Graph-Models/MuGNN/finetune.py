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

def train_binary_classification(args, model, device, loader, optimizer):
    criterion = nn.BCEWithLogitsLoss(reduction = "none")
    model.train()
    total_loss, count = 0, 0
    for step, batch in enumerate(tqdm(loader, desc="Iteration")):
        batch = batch.to(device)
        pred = model(batch.x, batch.edge_index, batch.edge_attr, batch.batch)
        y = batch.y.view(pred.shape).to(torch.float64)

        # #Whether y is non-null or not.
        # is_valid = y**2 > 0
        # #Loss matrix
        # loss_mat = criterion(pred.double(), (y+1)/2)
        # #loss matrix after removing null target
        # loss_mat = torch.where(is_valid, loss_mat, torch.zeros(loss_mat.shape).to(loss_mat.device).to(loss_mat.dtype))
        loss_mat = criterion(pred.double(), y)
            
        optimizer.zero_grad()
        # loss = torch.sum(loss_mat)/torch.sum(is_valid)
        loss = torch.sum(loss_mat)/len(loss_mat)
        total_loss += loss
        loss.backward()

        optimizer.step()
        count += 1

    print("Training Loss:", total_loss/count)
    return (total_loss/count).detach().cpu().numpy()
    
def train_multiclass_classification(args, model, device, loader, optimizer):
    criterion = nn.CrossEntropyLoss()
    model.train()
    total_loss, count = 0, 0
    for step, batch in enumerate(tqdm(loader, desc="Iteration")):
        batch = batch.to(device)
        pred = model(batch.x, batch.edge_index, batch.edge_attr, batch.batch)
        #y = batch.y.view(pred.shape).to(torch.float64)

        # #Whether y is non-null or not.
        # is_valid = y**2 > 0
        # #Loss matrix
        # loss_mat = criterion(pred.double(), (y+1)/2)
        # #loss matrix after removing null target
        # loss_mat = torch.where(is_valid, loss_mat, torch.zeros(loss_mat.shape).to(loss_mat.device).to(loss_mat.dtype))
        loss = criterion(pred.double(), batch.y)
            
        optimizer.zero_grad()
        # loss = torch.sum(loss_mat)/torch.sum(is_valid)
        # loss = torch.sum(loss_mat)/len(loss_mat)
        total_loss += loss
        loss.backward()

        optimizer.step()
        count += 1

    print("Training Loss:", total_loss/count)
    return (total_loss/count).detach().cpu().numpy()

def eval_binary_classification(args, model, device, loader):
    criterion = nn.BCEWithLogitsLoss(reduction = "none")
    model.eval()
    y_true = []
    y_scores = []
    total_loss, count = 0, 0
    for step, batch in enumerate(tqdm(loader, desc="Iteration")):
        batch = batch.to(device)

        with torch.no_grad():
            pred = model(batch.x, batch.edge_index, batch.edge_attr, batch.batch)

        y_true.append(batch.y.view(pred.shape))
        y_scores.append(pred)
        
        y = batch.y.view(pred.shape).to(torch.float64)
        loss = criterion(pred.double(), y)
        loss = torch.sum(loss)/len(loss)
        total_loss += loss
        count += 1

    y_true = torch.cat(y_true, dim = 0).cpu().numpy()
    y_scores = torch.cat(y_scores, dim = 0).cpu().numpy()
    y_pred = [1 if i > 0 else 0 for i in y_scores]
    acc, prec, rec, f1 = performance(y_true, y_pred)
    avg_loss = total_loss/count 

    # roc_list = []
    # for i in range(y_true.shape[1]):
    #     #AUC is only defined when there is at least one positive data.
    #     if np.sum(y_true[:,i] == 1) > 0 and np.sum(y_true[:,i] == -1) > 0:
    #         is_valid = y_true[:,i]**2 > 0
    #         roc_list.append(roc_auc_score((y_true[is_valid,i] + 1)/2, y_scores[is_valid,i]))

    # if len(roc_list) < y_true.shape[1]:
    #     print("Some target is missing!")
    #     print("Missing ratio: %f" %(1 - float(len(roc_list))/y_true.shape[1]))

    return (acc, prec, rec, f1), avg_loss.detach().cpu().numpy()

def eval_multiclass_classification(args, model, device, loader):
    criterion = nn.CrossEntropyLoss()
    model.eval()
    y_true = []
    y_scores = []
    total_loss, count = 0, 0
    
    for step, batch in enumerate(tqdm(loader, desc="Iteration")):
        batch = batch.to(device)

        with torch.no_grad():
            pred = model(batch.x, batch.edge_index, batch.edge_attr, batch.batch)

        # y_true.append(batch.y.view(pred.shape))
        # y_scores.append(pred)
        
        y_true.append(batch.y.cpu())
        _, predicted_label = torch.max(pred, dim=1)
        y_scores.append(predicted_label.cpu())
        
        loss = criterion(pred.double(), batch.y)
        total_loss += loss
        count += 1

    y_true = torch.cat(y_true, dim = 0).cpu().numpy()
    y_scores = torch.cat(y_scores, dim = 0).cpu().numpy()
    #y_pred = [1 if i > 0 else 0 for i in y_scores]
    acc, prec, rec, f1 = performance(y_true, y_scores)
    avg_loss = total_loss/count 
    
    return (acc, prec, rec, f1), avg_loss.detach().cpu().numpy()

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
    parser.add_argument('--dropout_ratio', type=float, default=0.5,
                        help='dropout ratio (default: 0.5)')
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
    args = parser.parse_args()
        
    os.environ["CUDA_VISIBLE_DEVICES"] = "1,2,3"
    args.device = 1
    device = torch.device("cuda:" + str(args.device)) if torch.cuda.is_available() else torch.device("cpu")

    #Bunch of classification tasks
    args.dataset = "codenet-10-class" # Possible values: "crypto-api", "codenet-5-class", "codenet-10-class", "codenet-100-class"
    if args.dataset == "crypto-api":
        num_tasks = 1
    elif args.dataset == "codenet-5-class":
        num_tasks = 5
    elif args.dataset == "codenet-10-class":
        num_tasks = 10
    elif args.dataset == "codenet-100-class":
        num_tasks = 100
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
    args.input_model_file = "/home/siddharthsa/cs21mtech12001-Tamal/API-Misuse-Prediction/PDG-gen/Repository/Graph-Models/MuGNN/output/saved_models/gcn_1_3_5_e100_model_ck_code2seq.pth"
    model = GNN_graphpred(args.num_layer, args.emb_dim, num_tasks, JK = args.JK, drop_ratio = args.dropout_ratio, graph_pooling = args.graph_pooling, gnn_type = args.gnn_type)
    if not args.input_model_file == "":
        model.from_pretrained(args.input_model_file)
        print("Loaded the model!!")
    
    model.to(device)

    #set up optimizer
    #different learning rate for different part of GNN
    model_param_group = []
    model_param_group.append({"params": model.gnn.parameters()})
    if args.graph_pooling == "attention":
        model_param_group.append({"params": model.pool.parameters(), "lr":args.lr*args.lr_scale})
    model_param_group.append({"params": model.graph_pred_linear.parameters(), "lr":args.lr*args.lr_scale})
    optimizer = optim.Adam(model_param_group, lr=args.lr, weight_decay=args.decay)
    print(optimizer)

    train_acc_list = []
    val_acc_list = []
    test_acc_list = []
    training_loss_list = []
    epochs_list = []
    validation_loss_list = []

    if not args.filename == "":
        fname = 'runs/finetune_cls_runseed' + str(args.runseed) + '/' + args.filename
        #delete the directory if there exists one
        if os.path.exists(fname):
            shutil.rmtree(fname)
            print("removed the existing file.")
        writer = SummaryWriter(fname)

    args.epochs = 10
    for epoch in range(1, args.epochs):
        print("====epoch " + str(epoch))
        
        if args.dataset in ["codenet-5-class", "codenet-10-class", "codenet-100-class"]:
            training_loss = train_multiclass_classification(args, model, device, train_loader, optimizer)
        elif args.dataset in ["crypto-api"]:
            training_loss = train_binary_classification(args, model, device, train_loader, optimizer)
        else:
            training_loss = train_binary_classification(args, model, device, train_loader, optimizer)

        print("====Evaluation")
        if args.eval_train:
            if args.dataset in ["codenet-5-class", "codenet-10-class", "codenet-100-class"]:
                train_acc, _ = eval_multiclass_classification(args, model, device, train_loader)
            elif args.dataset in ["crypto-api"]:
                train_acc, _ = eval_binary_classification(args, model, device, train_loader)
            else:
                train_acc, _ = eval_binary_classification(args, model, device, train_loader)
        else:
            print("omit the training accuracy computation")
            train_acc = 0
            
        if args.dataset in ["codenet-5-class", "codenet-10-class", "codenet-100-class"]:
            val_acc, val_loss = eval_multiclass_classification(args, model, device, val_loader)
            test_acc, test_loss = eval_multiclass_classification(args, model, device, test_loader)
        elif args.dataset in ["crypto-api"]:
            val_acc, val_loss = eval_binary_classification(args, model, device, val_loader)
            test_acc, test_loss = eval_binary_classification(args, model, device, test_loader)
        else:
            val_acc, val_loss = eval_binary_classification(args, model, device, val_loader)
            test_acc, test_loss = eval_binary_classification(args, model, device, test_loader)

        print("train(acc, prec, rec, f1): {} val(acc, prec, rec, f1): {} test(acc, prec, rec, f1): {}".format(train_acc, val_acc, test_acc))
        print("Training Loss: {}, Validation Loss: {} and Test Loss: {}".format(training_loss, val_loss, test_loss))

        val_acc_list.append(val_acc)
        test_acc_list.append(test_acc)
        train_acc_list.append(train_acc)
        epochs_list.append(epoch+1)
        training_loss_list.append(training_loss)
        validation_loss_list.append(val_loss)

        if not args.filename == "":
            writer.add_scalar('data/train auc', train_acc, epoch)
            writer.add_scalar('data/val auc', val_acc, epoch)
            writer.add_scalar('data/test auc', test_acc, epoch)

        print("")
        
    plot_training_and_validation_loss(training_loss_list, validation_loss_list, epochs_list, args.output_plots)
    plot_training_and_test_results(train_acc_list, test_acc_list, epochs_list, args.output_plots)

    if not args.filename == "":
        writer.close()
        
        
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
