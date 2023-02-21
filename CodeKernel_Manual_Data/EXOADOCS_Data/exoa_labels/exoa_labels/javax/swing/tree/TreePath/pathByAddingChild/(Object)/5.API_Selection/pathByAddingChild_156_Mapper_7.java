public class A{
	public void collapseAll() {
		TreePath path = new TreePath(getMapping().getRoot());
		Object node = getMapping().getRoot();
		for (int i = 0; i < getMapping().getChildCount(node); i++) {
			collapseRecursively(path.pathByAddingChild(getMapping().getChild(node, i)));
		}
	}
}