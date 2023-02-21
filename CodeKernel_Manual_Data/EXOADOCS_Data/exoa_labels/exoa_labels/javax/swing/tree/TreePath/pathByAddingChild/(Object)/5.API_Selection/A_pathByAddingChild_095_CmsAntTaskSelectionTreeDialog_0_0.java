public class A{
	private void expandTree(TreePath treePath) {
		//...
		expandTree(treePath.pathByAddingChild(children.nextElement()));
	}
}