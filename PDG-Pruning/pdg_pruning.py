import os
import sys
import glob
import tqdm

""" ALGORITHM

a. Clean the raw edge info (eg. remove wrongly formatted edges, class edges etc.)
b. Merge same code-lines into a single line/node
c. Consider only FDs between the API node and other nodes.
d. Add FD and CD from other nodes to the API node.
e. Add the rest of the edges(CD/FD) in the current subgraph.

"""

PRUNING_ERROR_COUNT, GOOD_DATA_POINTS, TOTAL_DATA_POINTS = 0, 0, 0

def get_pruned_pdg(pdg_file, output_pdg_file):
    
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
        edge_mapping[tuple(line_numbers)] = edge_type

    #print("NODE MAPPING : \n")
    #print(line_mapping, "\n")
    #print("EDGE MAPPING : \n")
    #print(edge_mapping, "\n")

    # Consider only FDs between the API node and other nodes
    api_nodes = []
    for line in line_mapping:
        if line_mapping[line].find("." + API_NAME) != -1:
            api_nodes.append(line)
    #print("API NODES : \n")
    #print(api_nodes, "\n")

    sub_graph_edges = {}
    for edge in edge_mapping:
        if edge[0] in api_nodes and edge_mapping[edge] == "FD":
            sub_graph_edges[edge] = edge_mapping[edge]
    #print("API NODES TO OTHER NODES : \n")
    #print(sub_graph_edges, "\n")

    # Add FD and CD from other nodes to the API node.
    for edge in edge_mapping:
        if edge[1] in api_nodes:
            sub_graph_edges[edge] = edge_mapping[edge]
    #print("OTHER NODES TO API NODES : \n")
    #print(sub_graph_edges, "\n")

    # Add the rest of the edges(CD/FD) in the current subgraph
    nodes_in_subgraph = set([])
    for edge in sub_graph_edges:
        nodes_in_subgraph.add(edge[0])
        nodes_in_subgraph.add(edge[1])
    nodes_in_subgraph = list(nodes_in_subgraph)
    #print("NODES IN FINAL SUBGRAPH : \n")
    #print(nodes_in_subgraph, "\n")

    for edge in edge_mapping:
        if edge[0] in nodes_in_subgraph and edge[1] in nodes_in_subgraph:
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
        edge_data = edge[0].strip() + " $$ " + \
            line_mapping[edge[0]].strip() + " --> " + \
            edge[1].strip() + " $$ " + \
            line_mapping[edge[1]].strip() + "  [" + \
            sub_graph_edges[edge].strip() + "]\n"
        edge_data_list.append(edge_data)
    #print("FINAL EDGE LIST: \n")
    #print(edge_data_list, "\n")
    if len(edge_data_list) >= 3:
        GOOD_DATA_POINTS += 1
        
    output_pdg_file.writelines(edge_data_list)
    TOTAL_DATA_POINTS += 1

    return output_pdg_file


API_NAME = "openConnection"
PDG_FOLDER_LOCATION = "/raid/cs21mtech12001/API-Misuse-Research/PDG-Gen/Repository/Processed Dataset/Before pruning/new/URL.openConnection"
OUTPUT_FOLDER_LOCATION = "/raid/cs21mtech12001/API-Misuse-Research/PDG-Gen/Repository/Processed Dataset/After pruning/URL.openConnection"
pdg_files_list = glob.glob(os.path.join(PDG_FOLDER_LOCATION, '*.txt'))
print("\nNumber of total files: {}\n".format(len(pdg_files_list)))
for filename in tqdm.tqdm(pdg_files_list):
    pdg_file = open(filename, 'r')
    output_file_location = OUTPUT_FOLDER_LOCATION + \
        "/" + filename[filename.rindex("/")+1:]
    output_pdg_file = open(output_file_location, "w")
    try:
        output_pdg_file = get_pruned_pdg(pdg_file, output_pdg_file)
    except Exception as e:
        PRUNING_ERROR_COUNT += 1
        print("\nERROR WHILE PRUNING PDG\n")
        print("\nFile: {}\n".format(filename))
        print("\nERROR: {}\n".format(e))
        pdg_file.close()
        output_pdg_file.close()
        os.remove(output_file_location)
    else:
        pdg_file.close()
        output_pdg_file.close()

print("\nGOOD PDG DATA POINTS: {}\n".format(GOOD_DATA_POINTS))
print("\nTOTAL PDG DATA POINTS: {}\n".format(TOTAL_DATA_POINTS))
print("\nTOTAL PRUNING ERROR: {}\n".format(PRUNING_ERROR_COUNT))