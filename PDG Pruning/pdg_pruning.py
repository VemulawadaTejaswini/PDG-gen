import sys

""" ALGORITHM

a. Clean the raw edge info (eg. remove wrongly formatted edges, class edges etc.)
b. Merge same code-lines into a single line/node
c. Consider only FDs between the API node and other nodes.
d. Add FD and CD from other nodes to the API node.
e. Add the rest of the edges(CD/FD) in the current subgraph.

"""

API_NAME = "readLine"
PDG_FILE_LOCATION = "D:\IIT Hyderabad\Research\API misuse prediction\PDG-Gen\Repository\\test-examples\\temp\\readline-example5_468_graph_dump.txt"
pdg_file = open(PDG_FILE_LOCATION, 'r')
all_edges = [l.replace("\n", "").replace("\r", "").strip() for l in pdg_file.readlines()]

# Remove unnecesssary edges("class" edge, wrongly formatted edges etc.)
all_edges = [edge for edge in all_edges if edge.find("-->") != -1 and edge.find("$$") != -1]
all_edges = [edge for edge in all_edges if len(edge.split("-->")) == 2 and 
                                           len(edge.split("-->")[0].split("$$")) == 2 and 
                                           len(edge.split("-->")[1].split("$$")) == 2]
all_edges = [edge for edge in all_edges if edge.split("-->")[0].find("Entry") == -1 and 
                                           edge.split("-->")[0].find("class") == -1]
print("ALL EDGES : \n")
print(all_edges, "\n")

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
                line_mapping[line_number] = line_code if len(line_code) > len(line_mapping[line_number]) else line_mapping[line_number]
        else:
            line_mapping[line_number] = line_code
    edge_mapping[tuple(line_numbers)] = edge_type

print("NODE MAPPING : \n")
print(line_mapping, "\n")
print("EDGE MAPPING : \n")
print(edge_mapping, "\n")

# Consider only FDs between the API node and other nodes
api_nodes = []
for line in line_mapping:
    if line_mapping[line].find("." + API_NAME) != -1:
        api_nodes.append(line)
print("API NODES : \n")
print(api_nodes, "\n")

sub_graph_edges = {}
for edge in edge_mapping:
    if edge[0] in api_nodes and edge_mapping[edge] == "FD":
        sub_graph_edges[edge] = edge_mapping[edge]
print("API NODES TO OTHER NODES : \n")
print(sub_graph_edges, "\n")

# Add FD and CD from other nodes to the API node.
for edge in edge_mapping:
    if edge[1] in api_nodes:
        sub_graph_edges[edge] = edge_mapping[edge]
print("OTHER NODES TO API NODES : \n")
print(sub_graph_edges, "\n")

# Add the rest of the edges(CD/FD) in the current subgraph
nodes_in_subgraph = set([])
for edge in sub_graph_edges:
    nodes_in_subgraph.add(edge[0])
    nodes_in_subgraph.add(edge[1])
nodes_in_subgraph = list(nodes_in_subgraph)
print("NODES IN FINAL SUBGRAPH : \n")
print(nodes_in_subgraph, "\n")

for edge in edge_mapping:
    if edge[0] in nodes_in_subgraph and edge[1] in nodes_in_subgraph:
        sub_graph_edges[edge] = edge_mapping[edge]
print("AFTER ADDING REST OF THE EDGES : \n")
print(sub_graph_edges, "\n")

# Remove self-loops from subgraph
sub_graph_edges_temp = {}
for edge in sub_graph_edges:
    if edge[0] != edge[1]:
        sub_graph_edges_temp[edge] = sub_graph_edges[edge]
sub_graph_edges = sub_graph_edges_temp
print("AFTER REMOVING SELF-LOOPS : \n")
print(sub_graph_edges, "\n")

