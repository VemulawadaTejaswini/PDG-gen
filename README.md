# Pipeline Overview
Java files are first fed into the PDG.
(in folder SurajAutomated). The PDG generates a 'filename'_graph_dump.txt.

(in jupyter-notebook) The graph_dump.txt is parsed to compute, edge_indices, edge_types, and nodes_dict. The nodes_dict is fed into Codebert to extract node_features.

RGAT model reads edge_indices, edge_types and node_features for graph classification.



# Data
The data is in Code_kernel folder, extracted by Anisha from Code_kernel. The data is labeled by folder_names 


# PDG installation and Source
 https://github.com/hpnog/javaDependenceGraph/tree/master/COMP_project
The project is based on the above repository, for installationa refer original docs.

# PDG working

# PDG automation.
Since the code is gui based, we can either try GUI automation or we can weed out the gui elements and loop over the graph building part for different java files. I have adopted the second approach,(in folder Suraj Automated).

Previous failed approach : Looping over the graphbuilding using a bash script, removing only the main gui causes my system to crash in the loop, because it tries to create too many processes.

# Using CodeBert to extract NodeFeatures
Paper: "[CLS] is a special token in
front of the two segments, whose final hidden representation is considered as the aggregated sequence
representation for classification or ranking."

The keys from nodes_dict are marked with 'CLS' and 'SEP' tokens, padded and masked all 1 as suggested in the documentation, https://huggingface.co/docs/transformers/model_doc/roberta#transformers.RobertaForMaskedLM

We extract the 0th wt of the last layer because it corresponds to the cls. this is size 768. I have added a linear layer to reduce it to 64, just to ease computation in Colab.


# Working of Pytorch Geometric
Pytorch geometric offers 2 types of data objects - Data and HeteroData. Ideally, A 'heterodata' is a data object describing a heterogeneous graph, holding multiple node and/or edge types in disjunct storage objects.
Any homogenous model can be converted to work on heterogenous data
![alt text](https://github.com/jyothivedurada/PDG-gen/blob/main/ReadmeSupport/HeteroSupportOnHomoModels.png)

Since the RGAT model internally separates by edge types and was a precursor to 'heterodata', it uses the data object with an added 'edge types field'.

I have implemented both heteroData and Data object with edge types so we can experiment with different models and optimizations.

# RGAT Model
There are 2 layers of RGAT. Graph neural networks can support at max 3 layers so we cannot experiment with this.

I have copied the first 2 layers from the RGAT implementation in Pytorch Geometric, added a max_pool and a linear layer to reduce it to the output size needed. 
Other available pooling layers
https://pytorch-geometric.readthedocs.io/en/latest/modules/nn.html?highlight=global_max_pool#pooling-layers

# Possible Optimizations and Other Models 
We have 2 types of edges but no edge attributes or weights, and only 1 type of nodes, therefor as per my understanding we can experiment with almost any model.
RGAT is best suited if we want to introduce edge attributes.