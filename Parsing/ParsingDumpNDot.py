# import json
import jsonlines
# import gzip
# import pygraphviz
from typing import Any, Dict, Iterable, List, Iterator, Tuple, Optional, Set

import sys
inDotFile = sys.argv[1]
inTextFile = sys.argv[2]

name = inDotFile[:-4]
print(name)

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

# """ The GraphDataset object assembles batches composed of a large single graph (which may be disconnected,
#  i.e. composed of many smaller graphs). The batching assembles the largest graph possible from component 
# graphs according to the dataset parameter "max_nodes_per_batch", which can be set according to need and 
# memory limitations. To read from a numpy iterator, making a graph sample iterator that consumes your 
# data and reassembles in to the graph sample form (as seen in JsonLGraphDataset example) may be the solution.
#  The iterator would then be used by the graph batching method, and thus supplied to the get_tensorflow_dataset 
# method of the parent GraphDataset with the correct batching implemented.
# """


def main():
  # G = pydot.graph_from_dot_file("dot/NestedLoops.dot")
  # G = pygraphviz.AGraph()
  # G.read(inDotFile)

  # NodeCount = G.number_of_nodes()
  # print(NodeCount)
  # EdgeCount = G.number_of_edges()
  # print(EdgeCount)

  # train_graph = {"directed": True, "multigraph": False, "graph": {}, "nodes": []}
  nodes_dict = dict()
  EdgeType = dict()
  # i is a counter for Nodes, j is a counter for Edges
  i=0
  j=0
  with open(inTextFile) as fp:
    Lines = fp.readlines()
    for line in Lines:
        N = line.split('-->')
        t1 = N[0].split('$$')   
        node_key1 = t1[1].strip()   
        if node_key1 not in nodes_dict.keys():
          nodes_dict[node_key1] = i
          i+=1
        t2 = N[1].split('$$')
        idx = t2[1].rfind('[')
        node_key2 = t2[1][:idx].strip()
        if node_key2 not in nodes_dict.keys():
          nodes_dict[node_key2] = i
          i+=1
        x = t2[1][idx+2:-3]
        if x in EdgeType:
          EdgeType[x]+=1
        else:
          EdgeType[x]=1 

  nodes = [{x:nodes_dict[x]} for x in nodes_dict]
  # print(nodes)

  EdgeTypes = list(EdgeType.keys())
  adjacency_lists = [[] for i in range(len(EdgeTypes))]
  
  with open(inTextFile) as fp:
    Lines = fp.readlines()
    for line in Lines:
      idx= line.rfind('[')
      x = line[idx+2:-3]
      i = EdgeTypes.index(x)

      N = line.split('-->')
      t1 = N[0].split('$$')   
      node_key1 = t1[1].strip()
      t2 = N[1].split('$$')
      idx = t2[1].rfind('[')
      node_key2 = t2[1][:idx].strip()
      n1 = nodes_dict[node_key1]
      n2 = nodes_dict[node_key2]
      adjacency_lists[i].append([n1,n2])

  print(adjacency_lists)
  # json_object_adj = json.dumps(adjacency_lists, indent = 4)
  output1 = name + "adj.jsonl"
  with jsonlines.open(output1, "w") as outfile:
    outfile.write_all(adjacency_lists)

  print(nodes)
  print(type(nodes))
  # # json_object_nodes = json.dumps(nodes, indent=4)
  output2 = name + "nodes.jsonl"
  with jsonlines.open(output2, "w") as outfile:
    outfile.write_all(nodes)


# "Line_3 $$ if (labelMap.containsKey(label))-->Line_5 $$ DBIDs exist = labelMap.get(label)[ CD ]"
if __name__ == "__main__":
    main()