import os
from pathlib import Path
import re
import glob
import tqdm

def snippetCopy(line, fptr,  wptr):

    """
    curr_path = path.split('/')[0]
    completeName = os.path.join(curr_path, file_name)
    print(completeName)
    newfile = open(completeName, "w+")
    """

    line = fptr.readline()  # read first line of snippet
    # removal of class\d\d and #\d
    line = re.sub('Class\d+\.', '', line)
    line = re.sub('#\d+', '', line)

    wptr.write("public class func{\n")
    wptr.write("public void ")
    wptr.write(line)

    while True:
        line = fptr.readline()

        wptr.write(line)
        if line == "}\n":
            break
    wptr.write("}\n")

def readfile(path, output_folder):
    # here we read the num.txt file and seperate the each instance into a seperate .java file
    f = open(path, "r")
    while f:
        line  = f.readline()
        if re.search("Instance \d+",line) != None:
            #meaning the line read has the word Instance
            number = line.split()[-1]
            file_name = str(number) + ".java"
            file_path = output_folder + "/" + file_name
            newfile = open(file_path, "w+")
            newfile.write("//")
            newfile.write(number)
            newfile.write("\n")
            snippetCopy(line, f, newfile)
            newfile.close()
        if line == '':
            break
    f.close()

RAWDATA_PATH = "/raid/cs21mtech12001/API-Misuse-Research/PDG-Gen/Repository/Code_kernel_data/Rawdata"
OUTPUT_PATH = "/raid/cs21mtech12001/API-Misuse-Research/PDG-Gen/Repository/Code_kernel_data/Dataset/NEW"
api_folders_list = glob.glob(RAWDATA_PATH + "/*/")
for folder in tqdm.tqdm(api_folders_list):
    api_name = folder[folder.rindex("/", 0, len(folder) - 1) + 1 : -1]
    OUTPUT_API_PATH = OUTPUT_PATH + "/" + api_name
    if not os.path.exists(OUTPUT_API_PATH):
        os.makedirs(OUTPUT_API_PATH)
    sample_files_list = glob.glob(os.path.join(folder, '*.txt'))
    for sample in sample_files_list:
        if os.path.isfile(sample) and sample.endswith(".txt"):
            sample_name = sample[sample.rindex("/") + 1 : -4]
            OUTPUT_SAMPLE_PATH = OUTPUT_API_PATH + "/" + sample_name
            if not os.path.exists(OUTPUT_SAMPLE_PATH):
                os.makedirs(OUTPUT_SAMPLE_PATH)
            print("\nProcessing: ", sample, "\n")
            readfile(sample, OUTPUT_SAMPLE_PATH)

    