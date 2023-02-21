public class A{
	private void expandAll(TreePath parent, boolean expand) {
		DefaultTreeTableNode node = (DefaultTreeTableNode) parent.getLastPathComponent();
		if (node.getChildCount() >= 0) {
			for (int i = 0; i < node.getChildCount(); i++) {
				TreePath path = parent.pathByAddingChild(node.getChild(i));
				expandAll(path, expand);
			}
		}
		
		if (expand) {
			tree.expandPath(parent);
		} else {
			tree.collapsePath(parent);
		}
	}
}