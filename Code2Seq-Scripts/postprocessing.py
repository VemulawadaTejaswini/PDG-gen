import os
import sys
import glob
import tqdm

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

    # Remove unnecesssary edges("class" edge, wrongly formatted edges etc.)
    all_edges = all_edges[2:]
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

PDG_FOLDER_LOCATION = "/home/tomy495/CS21MTECH12001/Research/API-misuse/Code2Seq-Data/java-small/pdg-data"
OUTPUT_FOLDER_LOCATION = "/home/tomy495/CS21MTECH12001/Research/API-misuse/Code2Seq-Data/java-small/processed-pdg-data"
pdg_folders_list = glob.glob(PDG_FOLDER_LOCATION + "/*/")
print("\nNumber of total APIs: {}\n".format(len(pdg_folders_list)))
for folder in tqdm.tqdm(pdg_folders_list):
    print("\nProcessing: {}\n".format(folder))
    api_name = folder[folder.rindex("/", 0, len(folder) - 1) + 1 : -1]
    pdg_files_list = glob.glob(os.path.join(folder, '*.txt'))
    OUTPUT_API_FOLDER_LOCATION = OUTPUT_FOLDER_LOCATION + "/" + api_name
    if not os.path.exists(OUTPUT_API_FOLDER_LOCATION):
        os.makedirs(OUTPUT_API_FOLDER_LOCATION)
    for pdg_file_location in pdg_files_list:
        pdg_file = open(pdg_file_location, 'r')
        output_file_location = OUTPUT_API_FOLDER_LOCATION + "/" + pdg_file_location[pdg_file_location.rindex("/")+1:]
        output_pdg_file = open(output_file_location, "+w")
        try:
            output_pdg_file, no_of_edges = get_pruned_pdg(pdg_file, output_pdg_file)
        except Exception as e:
            PRUNING_ERROR_COUNT += 1
            print("\nERROR WHILE PRUNING PDG\n")
            print("\nFile: {}\n".format(pdg_file_location))
            print("\nERROR: {}\n".format(e))
            pdg_file.close()
            output_pdg_file.close()
            os.remove(output_file_location)
        else:
            output_pdg_file.close()
            if no_of_edges == 0:
                os.remove(output_file_location)
            pdg_file.close()

    print("\nGOOD PDG DATA POINTS: {}\n".format(GOOD_DATA_POINTS))
    print("\nTOTAL PDG DATA POINTS: {}\n".format(TOTAL_DATA_POINTS))
    print("\nTOTAL PRUNING ERROR: {}\n".format(PRUNING_ERROR_COUNT))
    print("\n=================================================================\n")
    PRUNING_ERROR_COUNT_IN_DATASET += PRUNING_ERROR_COUNT
    GOOD_DATA_POINTS_IN_DATASET += GOOD_DATA_POINTS
    TOTAL_DATA_POINTS_IN_DATASET += TOTAL_DATA_POINTS
    DATASET_STATISTICS[api_name] = [TOTAL_DATA_POINTS, GOOD_DATA_POINTS, PRUNING_ERROR_COUNT]
    PRUNING_ERROR_COUNT, GOOD_DATA_POINTS, TOTAL_DATA_POINTS = 0, 0, 0
    
print("\nTOTAL GOOD PDG DATA POINTS IN DATASET: {}\n".format(GOOD_DATA_POINTS_IN_DATASET))
print("\nTOTAL PDG DATA POINTS IN DATASET: {}\n".format(TOTAL_DATA_POINTS_IN_DATASET))
print("\nTOTAL PRUNING ERROR IN DATASET: {}\n".format(PRUNING_ERROR_COUNT_IN_DATASET))
print("\nDATASET STATISTICS: {}\n".format(DATASET_STATISTICS))