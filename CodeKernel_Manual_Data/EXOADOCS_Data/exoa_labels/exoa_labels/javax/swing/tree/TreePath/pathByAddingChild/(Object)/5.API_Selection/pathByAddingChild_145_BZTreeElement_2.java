public class A{
	public void treeNodesRemoved(TreeModelEvent e){

		TreePath parentPath=e.getTreePath();
		
		Object[] children=e.getChildren();
		for (int index=0; index<children.length; index++){
			Object childNode = children[index];
			TreePath path = parentPath.pathByAddingChild(childNode);
			removeTreeRows(path,true);
		}
		updateBGAltColors();
	}
}