public class A{
	private void collapseRecursively(TreePath path) {
		//...
		collapseRecursively(path.pathByAddingChild(getMapping().getChild(node, i)));
	}
}