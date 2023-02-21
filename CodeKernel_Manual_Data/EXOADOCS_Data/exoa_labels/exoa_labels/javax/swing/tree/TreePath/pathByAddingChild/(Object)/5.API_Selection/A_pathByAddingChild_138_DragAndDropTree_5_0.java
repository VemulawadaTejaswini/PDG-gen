public class A{
	private int getSubTreeHeight(TreePath root) {
		//...
		h = h + getSubTreeHeight(root.pathByAddingChild(node.getChildAt(i)));
	}
}