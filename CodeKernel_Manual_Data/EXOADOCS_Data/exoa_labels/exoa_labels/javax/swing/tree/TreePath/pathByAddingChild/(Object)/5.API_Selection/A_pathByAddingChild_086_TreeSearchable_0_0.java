public class A{
	private void populateTreePaths0(Object node, TreePath path, TreeModel model) {
		//...
		Object childNode = model.getChild(node, i);
		populateTreePaths0(childNode, path.pathByAddingChild(childNode), model);
	}
}