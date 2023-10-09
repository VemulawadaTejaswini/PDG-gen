#!/usr/bin/env python

import sys
import json
import pandas as pd
import random

random.seed(1234)

def process_data(java_file_content, row, index):
    datapoint = {}
    datapoint["idx"] = index
    datapoint["file"] = str(row["Files"]).strip()
    datapoint["target"] = int(row["Vulnerability Exists?"])
    datapoint["misuse-type"] = str(row["Type of Vulnerability"]).strip()
    datapoint["api-involved"] = str(row["API Involved"]).strip()
    code_lines = []
    class_name = str(row["Files"]).strip().replace(".java", "").strip()
    java_file_content = [data.replace(class_name, "Dummy") for data in java_file_content]
    for code_line in java_file_content:
        if code_line.startswith("import") or code_line.startswith("package") or code_line.strip().replace("\n", "").strip() == "":
            continue
        else:
            code_lines.append(code_line)
    datapoint["func"] = "".join(code_lines)
    return(datapoint)

dataset_details_file_path = "/raid/tamalm/API-Misuse-Research/PDG-Gen/Repository/Benchmarks/CryptoAPI-Bench/CryptoAPI-Bench_details.xlsx"
raw_dataset_folder_path = "/raid/tamalm/API-Misuse-Research/PDG-Gen/Repository/Benchmarks/CryptoAPI-Bench/Rawdata"
output_folder_path = "/raid/tamalm/API-Misuse-Research/PDG-Gen/Repository/Benchmarks/CryptoAPI-Bench/Processed-data"
dataframe = pd.read_excel(dataset_details_file_path)
dataset_as_list = []

for index, row in dataframe.iterrows():
    file_name = str(row["Files"]).strip()
    file_path = raw_dataset_folder_path + "/" + file_name
    if(not file_path.endswith(".java")):
        file_path += ".java"
    try:
        java_file = open(file_path, "r")
        java_file_content = java_file.readlines()
        dataset_as_list.append(process_data(java_file_content, row, index))
    except Exception as e:
        print("\n\nERROR: " + str(e))
        print("File: " + file_name)
        print("Code Number: " + str(row["Code Number"]))
      
true_datapoints, false_datapoints = [], []
for data in dataset_as_list:
    if data["target"] == 1:
        true_datapoints.append(data)
    else:
        false_datapoints.append(data)

random.shuffle(true_datapoints)
random.shuffle(false_datapoints)

train_true_split_size, valid_true_split_size, test_true_split_size =  int(len(true_datapoints) *0.7), \
                                                                      int(len(true_datapoints) *0.15), \
                                                                      int(len(true_datapoints) *0.15)
train_false_split_size, valid_false_split_size, test_false_split_size =  int(len(false_datapoints) *0.7), \
                                                                         int(len(false_datapoints) *0.15), \
                                                                         int(len(false_datapoints) *0.15)

training_data = true_datapoints[:train_true_split_size] + false_datapoints[:train_false_split_size]
validation_data = true_datapoints[train_true_split_size: train_true_split_size + valid_true_split_size] + false_datapoints[train_false_split_size:train_false_split_size + valid_false_split_size]
test_data = true_datapoints[train_true_split_size + valid_true_split_size:] + false_datapoints[train_false_split_size + valid_false_split_size:]
random.shuffle(training_data)
random.shuffle(validation_data)
random.shuffle(test_data)

print("\nTraining, validation and test data size: {}, {} and {}".format(len(training_data), len(validation_data), len(test_data)))
print("Total dataset size: ", len(training_data) + len(validation_data) + len(test_data))

with open(f"{output_folder_path}/train_dataset.json", 'w') as f:
    for item in training_data:
        f.write(json.dumps(item) + "\n")
with open(f"{output_folder_path}/test_dataset.json", 'w') as f:
    for item in test_data:
        f.write(json.dumps(item) + "\n")
with open(f"{output_folder_path}/valid_dataset.json", 'w') as f:
    for item in validation_data:
        f.write(json.dumps(item) + "\n")