import os
from pathlib import Path
import re
import glob

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

    wptr.write("public void ")
    wptr.write(line)

    while True:
        line = fptr.readline()

        wptr.write(line)
        if line == "}\n":
            break
    wptr.write("\n")

def readfile(path):
    # here we read the num.txt file and seperate the each instance into a seperate py file
    print("yeet")
    f = open(path, "r")

    file_name = "test"
    file_name += ".java"
    newfile = open(file_name, "w+")

    while f:
        line  = f.readline()
        
        if re.search("Instance \d+",line) != None:
            #meaning the line read has the word Instance
            number = line.split()[-1]
            newfile.write("//")
            newfile.write(number)
            newfile.write("\n")
            snippetCopy(line, f, newfile)

        if line == '':
            break
    newfile.close()
    f.close()

RAWDATA_PATH = "/raid/cs21mtech12001/API-Misuse-Research/PDG-Gen/Repository/Code_kernel_data/Rawdata"
OUTPUT_PATH = "/raid/cs21mtech12001/API-Misuse-Research/PDG-Gen/Repository/Code_kernel_data/Dataset/NEW"
api_folders_list = glob.glob(RAWDATA_PATH + "/*/")
for folder in api_folders_list:
    sample_files_list = glob.glob(os.path.join(folder, '*.txt'))
    for sample in sample_files_list:
        if os.path.isfile(sample) and sample.endswith(".txt"):
            print(sample)
            readfile(sample)

    