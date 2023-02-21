public class A{
	public void expandAll() {
		TreePath path = new TreePath(getMapping().getRoot());
		Object node = getMapping().getRoot();
		for (int i = 0; i < getMapping().getChildCount(node); i++) {
			expandRecursively(path.pathByAddingChild(getMapping().getChild(node, i)));
		}
	}
}