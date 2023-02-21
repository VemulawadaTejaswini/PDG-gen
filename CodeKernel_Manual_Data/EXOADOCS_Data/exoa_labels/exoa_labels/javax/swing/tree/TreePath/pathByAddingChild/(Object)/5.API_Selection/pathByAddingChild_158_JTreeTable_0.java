public class A{
	private int getSubTreeMaxX(TreePath root) {
		Rectangle bounds = tree.getPathBounds(root);
		if (bounds != null) {
			int x = tree.getPathBounds(root).x + tree.getPathBounds(root).width;
			TreeNode node = (TreeNode) root.getLastPathComponent();
			for (int i = 0; i < node.getChildCount(); i++) {
				x = Math.max(x, getSubTreeMaxX(root.pathByAddingChild(node.getChildAt(i))));
			}
			return x;
		}
		return -1;
	}
}