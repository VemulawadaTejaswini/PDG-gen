public class A{
	private int getSubTreeMaxX(TreePath root) {
		//...
		x = Math.max(x, getSubTreeMaxX(root.pathByAddingChild(node.getChildAt(i))));
	}
}