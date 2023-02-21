public class A{
	private void expandRecursively(TreePath path) {
		//...
		expandRecursively(path.pathByAddingChild(getMapping().getChild(node, i)));
	}
}