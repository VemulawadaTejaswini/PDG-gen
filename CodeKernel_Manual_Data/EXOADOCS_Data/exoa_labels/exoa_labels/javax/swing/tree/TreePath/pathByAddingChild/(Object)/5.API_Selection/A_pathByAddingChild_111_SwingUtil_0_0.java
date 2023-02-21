public class A{
	protected static void expandTree(JTree tree, TreePath path,Hashtable lookedAt) {
		//...
		Object child = tree.getModel().getChild(node, i);
		TreePath p = path.pathByAddingChild(child);
	}
}