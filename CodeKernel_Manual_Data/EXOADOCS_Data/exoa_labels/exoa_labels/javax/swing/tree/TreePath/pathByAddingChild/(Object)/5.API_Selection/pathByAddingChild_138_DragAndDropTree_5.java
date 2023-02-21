public class A{
	private int getSubTreeHeight(TreePath root) {
		Rectangle bounds = getPathBounds(root);
		if (bounds != null) {
			int h = getPathBounds(root).height;
			TreeNode node = (TreeNode)root.getLastPathComponent();
			for (int i=0; i<node.getChildCount(); i++) {
				h = h + getSubTreeHeight(root.pathByAddingChild(node.getChildAt(i)));
			}
			return h;
		}
		return -1;
	}
}