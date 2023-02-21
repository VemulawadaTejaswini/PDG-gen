public class A{
	public void treeNodesChanged(TreeModelEvent e){
		TreePath parentPath=e.getTreePath();
		Object[] children=e.getChildren();
		
		
		
		for (int index=0; index<children.length; index++){
			Object childNode = children[index];
			TreePath childPath = parentPath.pathByAddingChild(childNode);
			updateTreeRow(childPath);
		}
		updateBGAltColors();
	}
}