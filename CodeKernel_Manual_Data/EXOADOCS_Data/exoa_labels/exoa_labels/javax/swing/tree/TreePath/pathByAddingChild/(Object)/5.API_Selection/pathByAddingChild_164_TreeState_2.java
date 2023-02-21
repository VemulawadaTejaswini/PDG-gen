public class A{
	private TreePath getPath(){
		if (node == null){
			return null;
		}
		
		if (isNodeParentNode){
			return node.getTreePath().pathByAddingChild(treeModel.getChild(node.getUserObject(), childIndex));
		}
		return node.path;
	}
}