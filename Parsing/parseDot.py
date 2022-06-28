from typing import Any, Dict, Iterable, List, Iterator, Tuple, Optional, Set
import json
import pygraphviz
import pydot

  # """
  #       Goal
  #       Arguments to GNN:
  #           node_features: float32 tensor of shape [V, D], where V is the number of nodes.
  #           adjacency_lists: lists of L int32 tensors of shape [E, 2], where L is the number
  #               of edge types and E the number of edges of that type.
  #               adjacency_lists[l][k,:] == [v, u] means that the k-th edge of type l connects node v to node u.
  #           type_to_num_incoming_edges: int32 tensor of shape [L, V], where L is the number
  #               of edge types.
  #               type_to_num_incoming_edges[l, v] = k indicates that node v has k incoming
  #               edges of type l.
  #           num_timesteps: Number of propagation steps in to run in this GNN layer.
  # PS:they are Reading Json to get an id for every node[done]
  # 
  #   tf2_gnn.data.JsonLGraphPropertyDataset implements reading a generic dataset 
  #   made up of graphs with a single property, stored in JSONLines format:
  #   Files "train.jsonl.gz", "valid.jsonl.gz" and "test.jsonl.gz" are expected to store the train/valid/test datasets.
  #   Each of the files is gzipped text file in which each line is a valid JSON dictionary with
  #   a "graph" key, which in turn points to a dictionary with keys
  #   "node_features" (list of numerical initial node labels),
  #   "adjacency_lists" (list of list of directed edge pairs),
  #   a "Property" key having a a single floating point value.
  #         """


def main():
  graphs = pydot.graph_from_dot_file("dot/NestedLoops.dot")
  output_raw_dot = graphs[0].to_string()
  # print(type(output_raw_dot))

  G = pygraphviz.AGraph()
  G.read("dot/NestedLoops.dot")
  train_graph = {"directed": True, "multigraph": False, "graph": {}, "nodes": []}
  num_nodes = 0;
  nodes = []
  for (i, node) in enumerate(G.nodes()):
    # print(node)
    # print(type(node))
    num_nodes = num_nodes + 1
    nodes.append({str(node):i})
  train_graph['nodes'] = nodes

  print(train_graph)
  out_file = open("myfile.json", "w")
  train_graph = json.dump(train_graph, out_file)

  nodes_dict = {}
  for d in nodes:
     nodes_dict.update(d)

  #Remove Self Loops




  # To find number of types of edges - L
  # Number of edges of a given edge type - E
  EdgeType = dict()
  for edge in G.edges():
    x = edge.attr['label']
    if x in EdgeType:
      EdgeType[x]+=1
    else:
      EdgeType[x]=1
  EdgeTypes = list(EdgeType.keys())
  print("Types of Edges")
  print(EdgeTypes)

  adjacency_lists = [[] for i in range(len(EdgeTypes))]
  for edge in G.edges():
    x = edge.attr['label']
    i = EdgeTypes.index(x)
    n1 = nodes_dict[str(edge[0])]
    n2 = nodes_dict[str(edge[1])]
    adjacency_lists[i].append([n1,n2])
  print(adjacency_lists)
    

  

  

  

if __name__ == "__main__":
    main()