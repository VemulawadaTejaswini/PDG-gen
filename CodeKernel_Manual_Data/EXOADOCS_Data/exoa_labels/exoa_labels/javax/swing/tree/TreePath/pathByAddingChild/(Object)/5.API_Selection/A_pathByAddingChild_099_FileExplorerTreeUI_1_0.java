public class A{
	protected TreePath getLastChildPath(TreePath parent) {
		//...
		return parent.pathByAddingChild(treeModel.getChild(parent.getLastPathComponent(), childCount - 1));
	}
}