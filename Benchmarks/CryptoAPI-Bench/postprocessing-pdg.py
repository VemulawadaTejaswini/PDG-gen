import os
import sys
import glob
import tqdm
import random
random.seed(1234)

""" ALGORITHM

a. Clean the raw edge info (eg. remove wrongly formatted edges, class edges etc.)
b. Merge same code-lines into a single line/node
c. Consider all nodes that are reachable from the API node
d. Consider all nodes from which API node is reachable
e. Add the all the edges(CD/FD) in the current subgraph

"""

PRUNING_ERROR_COUNT, GOOD_DATA_POINTS, TOTAL_DATA_POINTS = 0, 0, 0
PRUNING_ERROR_COUNT_IN_DATASET, GOOD_DATA_POINTS_IN_DATASET, TOTAL_DATA_POINTS_IN_DATASET = 0, 0, 0
DATASET_STATISTICS = {}

def get_pruned_pdg(pdg_file, output_pdg_file):
    
    global PRUNING_ERROR_COUNT, GOOD_DATA_POINTS, TOTAL_DATA_POINTS
    
    # all_edges = [bytes(l, 'utf-8').decode('utf-8', 'ignore').strip()
    #              for l in pdg_file.readlines()]
    all_edges = [l.replace("\n", "").replace("\r", "").strip()
                 for l in pdg_file.readlines()]

    # Remove unnecesssary edges("Entry" edge, wrongly formatted edges etc.)
    all_edges = all_edges[1:]
    all_edges = [edge for edge in all_edges if edge.find(
        "-->") != -1 and edge.count("$$") == 2]
    all_edges = [edge for edge in all_edges if len(edge.split("-->")) == 2 and
                 len(edge.split("-->")[0].split("$$")) == 2 and
                 len(edge.split("-->")[1].split("$$")) == 2]

    # Remove self-loops and duplicate edges
    all_edges = [edge for edge in all_edges if edge.split("-->")[0].split("$$")[0].strip() != edge.split("-->")[1].split("$$")[0].strip()]
    all_edges = list(set(all_edges))
        
    if len(all_edges) >= 5:
        GOOD_DATA_POINTS += 1

    all_edges = [edge + "\n" for edge in all_edges]
    output_pdg_file.writelines(all_edges)
    if len(all_edges) > 0:
        TOTAL_DATA_POINTS += 1

    return output_pdg_file, len(all_edges)

PDG_FOLDER_LOCATION = "/home/siddharthsa/cs21mtech12001-Tamal/API-Misuse-Prediction/PDG-gen/Repository/Benchmarks/CryptoAPI-Bench/pdg-data/NA"
OUTPUT_FOLDER_LOCATION = "/home/siddharthsa/cs21mtech12001-Tamal/API-Misuse-Prediction/PDG-gen/Repository/Benchmarks/CryptoAPI-Bench/processed-pdg-data"
pdg_files_list = glob.glob(PDG_FOLDER_LOCATION + "/*.txt")
print("\nNumber of total data points: {}\n".format(len(pdg_files_list)))

true_datapoints, false_datapoints = [], []
for pdg_file in pdg_files_list:
    file_name = pdg_file[pdg_file.rindex("/", 0, len(pdg_file) - 1) + 1 :]
    target = int(file_name.strip().split("_")[1])
    if(target == 1):
        true_datapoints.append(pdg_file)
    else:
        false_datapoints.append(pdg_file)
print("\nTotal true and false points: {} and {}\n".format(len(true_datapoints), len(false_datapoints)))

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
print("\nTotal dataset size: ", len(training_data) + len(validation_data) + len(test_data))

for split in [["train", training_data], ["valid", validation_data], ["test", test_data]]:
    print("\nProcessing split: ", split[0])
    OUTPUT_SPLIT_FOLDER_LOCATION = OUTPUT_FOLDER_LOCATION + "/" + split[0]
    if not os.path.exists(OUTPUT_SPLIT_FOLDER_LOCATION):
        os.makedirs(OUTPUT_SPLIT_FOLDER_LOCATION)
    for pdg_file in tqdm.tqdm(split[1]):
        original_pdg_file = open(pdg_file, 'r')
        output_file_location = OUTPUT_SPLIT_FOLDER_LOCATION + "/" + pdg_file[pdg_file.rindex("/")+1:]
        output_pdg_file = open(output_file_location, "+w")
        try:
            output_pdg_file, no_of_edges = get_pruned_pdg(original_pdg_file, output_pdg_file)
        except Exception as e:
            PRUNING_ERROR_COUNT += 1
            print("\nERROR WHILE PRUNING PDG\n")
            print("\nFile: {}\n".format(pdg_file))
            print("\nERROR: {}\n".format(e))
            original_pdg_file.close()
            output_pdg_file.close()
            os.remove(output_file_location)
        else:
            output_pdg_file.close()
            if no_of_edges == 0:
                os.remove(output_file_location)
            original_pdg_file.close()
            
    print("\nGOOD PDG DATA POINTS: {}\n".format(GOOD_DATA_POINTS))
    print("\nTOTAL PDG DATA POINTS: {}\n".format(TOTAL_DATA_POINTS))
    print("\nTOTAL PRUNING ERROR: {}\n".format(PRUNING_ERROR_COUNT))
    print("\n=================================================================\n")
    PRUNING_ERROR_COUNT_IN_DATASET += PRUNING_ERROR_COUNT
    GOOD_DATA_POINTS_IN_DATASET += GOOD_DATA_POINTS
    TOTAL_DATA_POINTS_IN_DATASET += TOTAL_DATA_POINTS
    DATASET_STATISTICS[split[0]] = [TOTAL_DATA_POINTS, GOOD_DATA_POINTS, PRUNING_ERROR_COUNT]
    PRUNING_ERROR_COUNT, GOOD_DATA_POINTS, TOTAL_DATA_POINTS = 0, 0, 0
    
print("\nTOTAL GOOD PDG DATA POINTS IN DATASET: {}\n".format(GOOD_DATA_POINTS_IN_DATASET))
print("\nTOTAL PDG DATA POINTS IN DATASET: {}\n".format(TOTAL_DATA_POINTS_IN_DATASET))
print("\nTOTAL PRUNING ERROR IN DATASET: {}\n".format(PRUNING_ERROR_COUNT_IN_DATASET))
print("\nDATASET STATISTICS: {}\n".format(DATASET_STATISTICS))