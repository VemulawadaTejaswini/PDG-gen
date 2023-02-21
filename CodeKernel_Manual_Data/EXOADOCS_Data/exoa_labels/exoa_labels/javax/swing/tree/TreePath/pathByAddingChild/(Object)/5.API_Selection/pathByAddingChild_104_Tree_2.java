public class A{
	private void expandSubTree(TreePath path) {
		TreeModel jTreeModel = jTree.getModel();
		Object node = path.getLastPathComponent();
		for (int i = 0; i < jTreeModel.getChildCount(node); i++) {
			Object child = jTreeModel.getChild(node, i);
			TreePath childPath = path.pathByAddingChild(child);
			if (!isLeaf(childPath)) {
				expandSubTree(childPath);
			}
		}
		jTree.expandPath(path);
	}
}