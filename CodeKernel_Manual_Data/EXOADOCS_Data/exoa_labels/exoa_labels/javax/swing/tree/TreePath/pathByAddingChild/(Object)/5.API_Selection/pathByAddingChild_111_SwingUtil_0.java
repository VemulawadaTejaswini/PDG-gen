public class A{
	protected static void expandTree(JTree tree, TreePath path,Hashtable lookedAt) {
		Object node = path.getLastPathComponent();
		if (lookedAt.containsKey(node))return;
		lookedAt.put(node, node);
		
		Vector paths = new Vector();
		tree.makeVisible(path);
		int childCount = tree.getModel().getChildCount(node);
		for(int i=0; i < childCount; i++) {
			Object child = tree.getModel().getChild(node, i);
			TreePath p = path.pathByAddingChild(child);
			expandTree(tree, p, lookedAt);
		}
	}
}