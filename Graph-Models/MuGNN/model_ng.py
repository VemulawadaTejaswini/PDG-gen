import torch
from torch_geometric.nn import MessagePassing
from torch_geometric.utils import add_self_loops, degree, softmax, remove_self_loops
from torch_geometric.nn import global_add_pool, global_mean_pool, global_max_pool, GlobalAttention, Set2Set
import torch.nn.functional as F
from torch_scatter import scatter_add
from torch_geometric.nn.inits import glorot, zeros

from torch_geometric.nn import GCNConv, GATConv

class CustomGCN(torch.nn.Module):
    def __init__(self, num_node_features = 768, device = torch.device("cpu")):
        super(CustomGCN, self).__init__()
        self.conv1 = GCNConv(num_node_features, 100)
        self.conv2 = GCNConv(100, 64)
        self.conv3 = GCNConv(64, 32)
        self.device = device

    def forward(self, x, edge_index):
        x = self.conv1(x, edge_index)
        x = x.relu()
        x = self.conv2(x, edge_index)
        x = x.relu()
        x = self.conv3(x, edge_index)
        batch = torch.zeros(x.size(0), dtype=torch.long).to(self.device)
        graph_embedding = global_mean_pool(x, batch = batch)
        return graph_embedding