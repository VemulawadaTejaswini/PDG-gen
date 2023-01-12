import sys

""" ALGORITHM

a. Clean the raw edge info (eg. remove wrongly formatted edges)
b. Merge same code-lines into a single line/node
c. Consider only FDs between the API node and other nodes.
d. Add FD and CD from other nodes to the API node.
e. Add the rest of the edges(CD/FD) in the current subgraph.

"""

API_NAME = "readLine"
PDG_FILE = "D:\IIT Hyderabad\Research\API misuse prediction\PDG-Gen\Repository\\test-examples\\temp\\readline-example5_468_graph_dump.txt"


