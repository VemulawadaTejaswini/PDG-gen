public class A{
	private void collapseRecursively(TreePath path) {
		Object node = path.getLastPathComponent();
		for (int i = 0; i < getMapping().getChildCount(node); i++) {
			collapseRecursively(path.pathByAddingChild(getMapping().getChild(node, i)));
		}
		getTree().collapsePath(path);
	}
}