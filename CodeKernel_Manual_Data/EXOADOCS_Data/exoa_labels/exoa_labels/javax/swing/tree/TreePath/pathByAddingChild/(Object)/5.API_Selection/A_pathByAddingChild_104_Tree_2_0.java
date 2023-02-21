public class A{
	private void expandSubTree(TreePath path) {
		//...
		Object child = jTreeModel.getChild(node, i);
		TreePath childPath = path.pathByAddingChild(child);
	}
}