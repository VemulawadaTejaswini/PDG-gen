public class A{
	public void treeShouldExpand(TreeModelEvent e) {
		Object[] children = e.getChildren();
		for (int i=0; i<children.length; i++)tree.getTree().makeVisible(e.getTreePath().pathByAddingChild(children[i]));
	}
}