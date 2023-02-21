import os
import sys
import glob
import tqdm
import shutil

CORPUS_FOLDER_LOCATION = "/raid/cs21mtech12001/API-Misuse-Research/PDG-Gen/Repository/CodeKernel_Manual_Data/EXOADOCS_Data/exoa_labels/exoa_labels"
OUTPUT_FOLDER_LOCATION = "/raid/cs21mtech12001/API-Misuse-Research/PDG-Gen/Repository/CodeKernel_Manual_Data/Final_Data"
labels_file_locations = ["/raid/cs21mtech12001/API-Misuse-Research/PDG-Gen/Repository/CodeKernel_Manual_Data/EXOADOCS_Data/exoa_labels/exoa_labels/Driver.connect.labels.txt",
                        "/raid/cs21mtech12001/API-Misuse-Research/PDG-Gen/Repository/CodeKernel_Manual_Data/EXOADOCS_Data/exoa_labels/exoa_labels/Graphics2D.fill.labels.txt",
                        "/raid/cs21mtech12001/API-Misuse-Research/PDG-Gen/Repository/CodeKernel_Manual_Data/EXOADOCS_Data/exoa_labels/exoa_labels/PrinterJob.pageDialog.labels.txt",
                        "/raid/cs21mtech12001/API-Misuse-Research/PDG-Gen/Repository/CodeKernel_Manual_Data/EXOADOCS_Data/exoa_labels/exoa_labels/Properties.loadFromXML.labels.txt",
                        "/raid/cs21mtech12001/API-Misuse-Research/PDG-Gen/Repository/CodeKernel_Manual_Data/EXOADOCS_Data/exoa_labels/exoa_labels/Servant._poa.labels.txt",
                        "/raid/cs21mtech12001/API-Misuse-Research/PDG-Gen/Repository/CodeKernel_Manual_Data/EXOADOCS_Data/exoa_labels/exoa_labels/Window.pack.labels.txt"]
API_NAMEs = ["Driver.connect", "Graphics2D.fill", "PrinterJob.pageDialog", "Properties.loadFromXML", "Servant._poa", "Window.pack"]

for labels_file_location, API_NAME in zip(labels_file_locations, API_NAMEs):

    OUTPUT_API_FOLDER_LOCATION = OUTPUT_FOLDER_LOCATION + "/" + API_NAME
    if not os.path.exists(OUTPUT_API_FOLDER_LOCATION):
        os.makedirs(OUTPUT_API_FOLDER_LOCATION)

    labels_file = open(labels_file_location, 'r')
    lines = labels_file.readlines()
    for line in lines:
        java_file_location, gt_label, exoa_label, ck_label = line.strip().split("\t")
        java_file_location, gt_label, exoa_label, ck_label = java_file_location.strip(), gt_label.strip(), exoa_label.strip(), ck_label.strip()
        java_file_location = java_file_location.replace('"', "")
    
        OUTPUT_API_SAMPLES_FOLDER_LOCATION = OUTPUT_API_FOLDER_LOCATION + "/" + "sample-" + gt_label
        if not os.path.exists(OUTPUT_API_SAMPLES_FOLDER_LOCATION):
            os.makedirs(OUTPUT_API_SAMPLES_FOLDER_LOCATION)
        
        java_file_location = CORPUS_FOLDER_LOCATION + "/" + java_file_location
        target_java_file_location = OUTPUT_API_SAMPLES_FOLDER_LOCATION + "/" + java_file_location[java_file_location.rindex("/") + 1 : java_file_location.rindex(".java")] + "_" + ck_label + ".java"
        if not os.path.isfile(java_file_location) :
            print("\nFile not found")
    
        shutil.copy2(java_file_location, target_java_file_location)

    labels_file.close()
