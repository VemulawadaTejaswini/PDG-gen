import os
from pathlib import Path
import re
import glob
import tqdm
import pyparsing

def copyFile(path, output_folder, file_name):
    input_file = open(path, "r")
    file_path = output_folder + "/" + file_name + ".java"
    newfile = open(file_path, "w+")
    
    # Remove all comments
    original_code = input_file.read()
    commentFilter = pyparsing.javaStyleComment.suppress()
    modified_code = commentFilter.transformString(original_code)
    
    # Add dummy class
    newfile.write("public class func{\n")

    for line in modified_code.split("\n"):
        line = line.replace('\u00A0', " ")
        
        # Skip empty lines, lines like @Test
        if len(line.strip()) == 0 or line.strip().startswith("@"):
            continue
        
        # Add newline at the end
        if not line.endswith("\n"):
            line += "\n"
        newfile.write(line)
    newfile.write("}\n")
    
    newfile.close()
    input_file.close()

RAWDATA_PATH = "/home/tomy495/CS21MTECH12001/Research/API-misuse/Code2Seq-Data/java-small/raw-data"
OUTPUT_PATH = "/home/tomy495/CS21MTECH12001/Research/API-misuse/Code2Seq-Data/java-small/processed-data"

api_folders_list = glob.glob(RAWDATA_PATH + "/*/")
for folder in tqdm.tqdm(api_folders_list):
    api_name = folder[folder.rindex("/", 0, len(folder) - 1) + 1 : -1]
    print("\n\nProcessing: ", api_name, "\n")
    OUTPUT_API_PATH = OUTPUT_PATH + "/" + api_name
    if not os.path.exists(OUTPUT_API_PATH):
        os.makedirs(OUTPUT_API_PATH)
    sample_files_list = glob.glob(os.path.join(folder, '*.java'))
    for sample in sample_files_list:
        if os.path.isfile(sample) and sample.endswith(".java"):
            sample_name = sample[sample.rindex("/") + 1 : -5]
            #print("\nProcessing: ", sample, "\n")
            copyFile(sample, OUTPUT_API_PATH, sample_name)

    