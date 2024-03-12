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
    all_edges = [edge for edge in all_edges if edge.find(
        "-->") != -1 and edge.count("$$") == 2]
    all_edges = [edge for edge in all_edges if len(edge.split("-->")) == 2 and
                 len(edge.split("-->")[0].split("$$")) == 2 and
                 len(edge.split("-->")[1].split("$$")) == 2]
    all_edges = [edge for edge in all_edges if edge.split("-->")[0].find("Entry") == -1 and
                 edge.split("-->")[0].find("class") == -1]
    #print("ALL EDGES : \n")
    #print(all_edges, "\n")

    # Merge nodes referring to same code-line
    line_mapping, edge_mapping = {}, {}
    for edge in all_edges:
        node_1, node_2 = edge[:edge.rindex("[")].strip().split("-->")
        edge_type = edge[edge.rindex("[") + 1: -1].strip()
        line_numbers = []
        for node in [node_1, node_2]:
            line_number, line_code = node.strip().split("$$")
            line_number, line_code = line_number.strip(), line_code.strip()
            line_numbers.append(line_number)
            if line_number in line_mapping:
                if line_mapping[line_number] != line_code:
                    line_mapping[line_number] = line_code if len(line_code) > len(
                        line_mapping[line_number]) else line_mapping[line_number]
            else:
                line_mapping[line_number] = line_code
        if tuple(line_numbers) in edge_mapping:
            edge_mapping[tuple(line_numbers)] = list(set(edge_mapping[tuple(line_numbers)] + [edge_type]))
        else:
            edge_mapping[tuple(line_numbers)] = [edge_type]

    # Remove self-loops from subgraph
    edges_temp = {}
    for edge in edge_mapping:
        if edge[0] != edge[1]:
            edges_temp[edge] = edge_mapping[edge]
    edge_mapping = edges_temp
    #print("AFTER REMOVING SELF-LOOPS : \n")
    #print(sub_graph_edges, "\n")

    # Save the pruned PDG
    edge_data_list = []
    for edge in edge_mapping:
        for edge_type in edge_mapping[edge]:
            edge_data = edge[0].strip() + " $$ " + \
                        line_mapping[edge[0]].strip() + " --> " + \
                        edge[1].strip() + " $$ " + \
                        line_mapping[edge[1]].strip() + " [" + \
                        edge_type.strip() + "]\n"
            edge_data_list.append(edge_data)
    #print("FINAL EDGE LIST: \n")
    #print(edge_data_list, "\n")
    if len(edge_data_list) >= 3:
        GOOD_DATA_POINTS += 1
        
    output_pdg_file.writelines(edge_data_list)
    if len(edge_data_list) > 0:
        TOTAL_DATA_POINTS += 1

    return output_pdg_file, len(edge_data_list)

PDG_FOLDER_LOCATION = "/home/tomy495/CS21MTECH12001/Research/API-misuse/Code2Seq-Data/java-large/pdg-data"
OUTPUT_FOLDER_LOCATION = "/home/tomy495/CS21MTECH12001/Research/API-misuse/Code2Seq-Data/java-large/processed-pdg-data"
LOG_FILE_LOCATION = "/home/tomy495/CS21MTECH12001/Research/API-misuse/PDG-gen/Code2Seq-Scripts/already-processed-apis.txt"

already_processed_apis = set([])
log_file = open(LOG_FILE_LOCATION, "r")
for line in log_file:
  already_processed_apis.add(line.strip("\n").strip(" "))
log_file.close()

pdgs_too_big = ["bigGoto_NA_java.io.PrintStream.println_graph_dump.txt"]

pdg_folders_list = glob.glob(PDG_FOLDER_LOCATION + "/*/")
print("\nNumber of total APIs: {}\n".format(len(pdg_folders_list)))
for folder in tqdm.tqdm(pdg_folders_list, desc = "API Processed"):
    
    if folder in already_processed_apis:
        print("\nAlready Processed: ", folder)
        continue
    else:
        print("\nProcessing: {}\n".format(folder))
        
    api_name = folder[folder.rindex("/", 0, len(folder) - 1) + 1 : -1]
    pdg_files_list = glob.glob(os.path.join(folder, '*.txt'))
    OUTPUT_API_FOLDER_LOCATION = OUTPUT_FOLDER_LOCATION + "/" + api_name
    if not os.path.exists(OUTPUT_API_FOLDER_LOCATION):
        os.makedirs(OUTPUT_API_FOLDER_LOCATION)
    for pdg_file_location in tqdm.tqdm(pdg_files_list, desc = "PDGs/API"):
        
        #print(pdg_file_location)
        pdg_file_name = pdg_file_location[pdg_file_location.rindex("/")+1:]
        if(pdg_file_name in pdgs_too_big):
            continue
        
        pdg_file = open(pdg_file_location, 'r')
        output_file_location = OUTPUT_API_FOLDER_LOCATION + "/" + pdg_file_name
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

    already_processed_apis.add(folder)
    log_file = open(LOG_FILE_LOCATION, "a")
    log_file.write(folder + "\n")
    log_file.close()
    print("\nGOOD PDG DATA POINTS: {}\n".format(GOOD_DATA_POINTS))
    print("\nTOTAL PDG DATA POINTS: {}\n".format(TOTAL_DATA_POINTS))
    print("\nTOTAL PRUNING ERROR: {}\n".format(PRUNING_ERROR_COUNT))
    print("\n=================================================================\n")
    PRUNING_ERROR_COUNT_IN_DATASET += PRUNING_ERROR_COUNT
    GOOD_DATA_POINTS_IN_DATASET += GOOD_DATA_POINTS
    TOTAL_DATA_POINTS_IN_DATASET += TOTAL_DATA_POINTS
    DATASET_STATISTICS[api_name] = [TOTAL_DATA_POINTS, GOOD_DATA_POINTS, PRUNING_ERROR_COUNT]
    PRUNING_ERROR_COUNT, GOOD_DATA_POINTS, TOTAL_DATA_POINTS = 0, 0, 0
    
log_file.close()
print("\nTOTAL GOOD PDG DATA POINTS IN DATASET: {}\n".format(GOOD_DATA_POINTS_IN_DATASET))
print("\nTOTAL PDG DATA POINTS IN DATASET: {}\n".format(TOTAL_DATA_POINTS_IN_DATASET))
print("\nTOTAL PRUNING ERROR IN DATASET: {}\n".format(PRUNING_ERROR_COUNT_IN_DATASET))
print("\nDATASET STATISTICS: {}\n".format(DATASET_STATISTICS))