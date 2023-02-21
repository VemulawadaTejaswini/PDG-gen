public class A{
	private int showNode(TreePath path, JTree tree, TreeModel model,int previous) {
		//...
		Object childNode = model.getChild(node, i);
		TreePath childPath = path.pathByAddingChild(childNode);
	}
}