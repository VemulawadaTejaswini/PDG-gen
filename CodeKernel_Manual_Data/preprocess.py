import os
from pathlib import Path
import re
import glob
import tqdm
    
def process_file(input_file_path, output_file_name, output_folder):
    output_file = open(output_folder + "/" + output_file_name, "+w")
    with open(input_file_path, "r") as input_file:
        for line in input_file:
            line = line.replace('\u00A0', " ")
            if line.strip().startswith("//") or line.strip() in ["\n", "\t"] or line.strip() == "":
                continue
            elif "//" in line and "://" not in line:
                line = line[:line.index("//")].rstrip() + "\n"
                output_file.write(line)
            else:
                output_file.write(line)
    input_file.close()
    output_file.close()

RAWDATA_PATH = "/raid/cs21mtech12001/API-Misuse-Research/PDG-Gen/Repository/CodeKernel_Manual_Data/Processed_data/before_preprocessing"
OUTPUT_PATH = "/raid/cs21mtech12001/API-Misuse-Research/PDG-Gen/Repository/CodeKernel_Manual_Data/Processed_data/after_preprocessing"

api_folders_list = glob.glob(RAWDATA_PATH + "/*/")
for folder in tqdm.tqdm(api_folders_list):
    api_name = folder[folder.rindex("/", 0, len(folder) - 1) + 1 : -1]
    OUTPUT_API_PATH = OUTPUT_PATH + "/" + api_name
    if not os.path.exists(OUTPUT_API_PATH):
        os.makedirs(OUTPUT_API_PATH)
        
    sample_folders_list = glob.glob(folder + "*/")
    for sample_folder in sample_folders_list:
        sample_name = sample_folder[sample_folder.rindex("/", 0, len(sample_folder) - 1) + 1 : -1]
        OUTPUT_API_SAMPLE_PATH = OUTPUT_API_PATH + "/" + sample_name
        if not os.path.exists(OUTPUT_API_SAMPLE_PATH):
            os.makedirs(OUTPUT_API_SAMPLE_PATH)
        sample_files_list = glob.glob(os.path.join(sample_folder, '*.java'))
        for sample_java_file in sample_files_list:
            if os.path.isfile(sample_java_file) and sample_java_file.endswith(".java"):
                sample_java_file_name = sample_java_file[sample_java_file.rindex("/") + 1 : ]
                process_file(sample_java_file, sample_java_file_name, OUTPUT_API_SAMPLE_PATH)

    