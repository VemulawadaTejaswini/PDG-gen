public class A{
	public static void collapseAll(JTree tree, TreePath path) {
		//...
		for (int i = 0; i < num; i++)collapseAll(tree, path.pathByAddingChild(model.getChild(node, i)));
	}
}