public class A{
	public void treeNodesInserted(TreeModelEvent e) {
		setSelectionPath(e.getTreePath().pathByAddingChild(e.getChildren()[0]));
	}
}