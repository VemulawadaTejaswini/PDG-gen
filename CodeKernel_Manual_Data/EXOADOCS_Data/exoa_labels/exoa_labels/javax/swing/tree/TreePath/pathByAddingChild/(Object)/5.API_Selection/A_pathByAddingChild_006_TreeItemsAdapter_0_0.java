public class A{
	private void findNodes(TreePath path, List nodes, List<TreePath> result) {
		//...
		Object child = model.getChild(lastPath, iter);
		findNodes(path.pathByAddingChild(child), nodes, result);
	}
}