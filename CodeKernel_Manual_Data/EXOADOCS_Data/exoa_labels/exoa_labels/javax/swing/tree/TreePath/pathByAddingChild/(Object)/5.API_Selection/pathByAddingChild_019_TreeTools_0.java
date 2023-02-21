public class A{
	public static void collapseAll(JTree tree, TreePath path) {
		Object node = path.getLastPathComponent();
		TreeModel model = tree.getModel();
		if (model.isLeaf(node))return;
		int num = model.getChildCount(node);
		for (int i = 0; i < num; i++)collapseAll(tree, path.pathByAddingChild(model.getChild(node, i)));
		tree.collapsePath(path);
	}
}