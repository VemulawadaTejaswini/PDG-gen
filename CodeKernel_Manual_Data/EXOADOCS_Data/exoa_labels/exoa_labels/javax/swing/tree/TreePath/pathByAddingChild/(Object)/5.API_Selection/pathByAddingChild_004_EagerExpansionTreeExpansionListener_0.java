public class A{
	public void treeExpanded(TreeExpansionEvent event) {
		TreePath path = event.getPath();
		Object component = path.getLastPathComponent();
		if (component instanceof TreeNode) {
			TreeNode treeNode = (TreeNode) component;
			if (treeNode.getChildCount() == 1) {
				tree.expandPath(path.pathByAddingChild(treeNode.getChildAt(0)));
			}
		}
	}
}