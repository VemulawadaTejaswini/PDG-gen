public class A{
	private TreePath findNode(TreePath path, Object node) {
		//...
		Object child = model.getChild(lastPath, iter);
		TreePath result = findNode(path.pathByAddingChild(child), node);
	}
}