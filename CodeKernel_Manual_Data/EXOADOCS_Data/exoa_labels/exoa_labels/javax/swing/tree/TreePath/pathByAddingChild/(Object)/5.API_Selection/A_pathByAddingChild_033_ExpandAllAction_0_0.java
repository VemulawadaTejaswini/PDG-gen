public class A{
	public void expand(TreePath path, JTree tree) {
		//...
		expand(path.pathByAddingChild(model.getChild(node, i)), tree);
	}
}