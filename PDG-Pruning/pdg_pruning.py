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

def get_pruned_pdg(pdg_file, output_pdg_file, api_name):
    
    global PRUNING_ERROR_COUNT, GOOD_DATA_POINTS, TOTAL_DATA_POINTS
    
    all_edges = [l.replace("\n", "").replace("\r", "").strip()
                 for l in pdg_file.readlines()]

    # Remove unnecesssary edges("class" edge, wrongly formatted edges etc.)
    all_edges = [edge for edge in all_edges if edge.find(
        "-->") != -1 and edge.find("$$") != -1]
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

    #print("NODE MAPPING : \n")
    #print(line_mapping, "\n")
    #print("EDGE MAPPING : \n")
    #print(edge_mapping, "\n")

    # Add all the nodes that are reachable to or from the API-NODE
    api_nodes = []
    for line in line_mapping:
        if line_mapping[line].find("." + api_name + "(") != -1:
            api_nodes.append(line)
    #print("API NODES : \n")
    #print(api_nodes, "\n")
    
    # Get vertices that are reachable from the API-NODE
    vertices_from_api_node, previous_vertices = set(api_nodes), set(api_nodes)
    while(True):
        next_vertices = set([])
        for edge in edge_mapping:
            if edge[0] in list(previous_vertices) and edge[1] not in list(vertices_from_api_node):
                next_vertices.add(edge[1])
        if len(next_vertices) == 0:
            break
        else:
            vertices_from_api_node = vertices_from_api_node.union(next_vertices)
            previous_vertices = next_vertices
    
    # Get vertices from which the API-NODE is reachable
    vertices_to_api_node, next_vertices = set(api_nodes), set(api_nodes)
    while(True):
        previous_vertices = set([])
        for edge in edge_mapping:
            if edge[1] in list(next_vertices) and edge[0] not in list(vertices_to_api_node):
                previous_vertices.add(edge[0])
        if len(previous_vertices) == 0:
            break
        else:
            vertices_to_api_node = vertices_to_api_node.union(previous_vertices)
            next_vertices = previous_vertices
    
    # All nodes in the final sub-graph
    subgraph_vertices = list(vertices_from_api_node.union(vertices_to_api_node))

    # Add all the edges(CD/FD) between the subgraph vertices
    sub_graph_edges = {}
    for edge in edge_mapping:
        if edge[0] in subgraph_vertices and edge[1] in subgraph_vertices:
            if edge in sub_graph_edges:
                sub_graph_edges[edge] = list(set(sub_graph_edges[edge] + edge_mapping[edge]))
            else:
                sub_graph_edges[edge] = edge_mapping[edge]
    #print("AFTER ADDING REST OF THE EDGES : \n")
    #print(sub_graph_edges, "\n")

    # Remove self-loops from subgraph
    sub_graph_edges_temp = {}
    for edge in sub_graph_edges:
        if edge[0] != edge[1]:
            sub_graph_edges_temp[edge] = sub_graph_edges[edge]
    sub_graph_edges = sub_graph_edges_temp
    #print("AFTER REMOVING SELF-LOOPS : \n")
    #print(sub_graph_edges, "\n")

    # Save the pruned PDG
    edge_data_list = []
    for edge in sub_graph_edges:
        for edge_type in sub_graph_edges[edge]:
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

PDG_FOLDER_LOCATION = "/raid/cs21mtech12001/API-Misuse-Research/PDG-Gen/Repository/Processed Dataset/Before pruning/final"
OUTPUT_FOLDER_LOCATION = "/raid/cs21mtech12001/API-Misuse-Research/PDG-Gen/Repository/Processed Dataset/After pruning/new"
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
            output_pdg_file, no_of_edges = get_pruned_pdg(pdg_file, output_pdg_file, api_name[api_name.rindex(".") + 1 :].strip())
        except Exception as e:
            PRUNING_ERROR_COUNT += 1
            #print("\nERROR WHILE PRUNING PDG\n")
            #print("\nFile: {}\n".format(pdg_file_location))
            #print("\nERROR: {}\n".format(e))
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