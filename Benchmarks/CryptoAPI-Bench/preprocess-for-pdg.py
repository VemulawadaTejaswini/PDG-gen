#!/usr/bin/env python

import sys
import json
import pandas as pd
import random
import os
from pathlib import Path
import re
import glob
import tqdm
import pyparsing

random.seed(1234)

TRUE_POINTS, FALSE_POINTS = 0, 0

def copyFile(path, output_folder, file_name, row):
    global TRUE_POINTS, FALSE_POINTS
    
    input_file = open(path, "r")
    file_path = output_folder + "/" + file_name[:-5] + "_" + str(int(row["Vulnerability Exists?"])) + ".java"
    newfile = open(file_path, "w+")
    class_name = str(row["Files"]).strip().replace(".java", "").strip()
    
    # Remove all comments
    original_code = input_file.read()
    commentFilter = pyparsing.javaStyleComment.suppress()
    modified_code = commentFilter.transformString(original_code)

    for line in modified_code.split("\n"):
        line = line.replace('\u00A0', " ").replace(class_name, "Dummy")
        
        # Skip empty lines, lines like @Test
        if len(line.strip()) == 0 or line.strip().startswith("@"):
            continue
        
        # Remove import statements and packages
        if line.startswith("import") or line.startswith("package") or line.strip().replace("\n", "").strip() == "":
            continue
        
        # Add newline at the end
        if not line.endswith("\n"):
            line += "\n"
        newfile.write(line)
    
    newfile.close()
    input_file.close()
    
    if(int(row["Vulnerability Exists?"]) == 1):
        TRUE_POINTS += 1
    else:
        FALSE_POINTS += 1

dataset_details_file_path = "/home/siddharthsa/cs21mtech12001-Tamal/API-Misuse-Prediction/PDG-gen/Repository/Benchmarks/CryptoAPI-Bench/CryptoAPI-Bench_details.xlsx"
raw_dataset_folder_path = "/home/siddharthsa/cs21mtech12001-Tamal/API-Misuse-Prediction/PDG-gen/Repository/Benchmarks/CryptoAPI-Bench/Rawdata"
output_folder_path = "/home/siddharthsa/cs21mtech12001-Tamal/API-Misuse-Prediction/PDG-gen/Repository/Benchmarks/CryptoAPI-Bench/Processed-data-for-pdg"
dataframe = pd.read_excel(dataset_details_file_path)
dataset_as_list = []

for index, row in dataframe.iterrows():
    file_name = str(row["Files"]).strip()
    file_path = raw_dataset_folder_path + "/" + file_name
    if(not file_path.endswith(".java")):
        file_path += ".java"
        file_name += ".java"
    try:
        copyFile(file_path, output_folder_path, file_name, row)
    except Exception as e:
        print("\n\nERROR: " + str(e))
        print("File: " + file_name)
        print("Code Number: " + str(row["Code Number"]))

print("Total TRUE and FALSE points: {} and {}".format(TRUE_POINTS, FALSE_POINTS))