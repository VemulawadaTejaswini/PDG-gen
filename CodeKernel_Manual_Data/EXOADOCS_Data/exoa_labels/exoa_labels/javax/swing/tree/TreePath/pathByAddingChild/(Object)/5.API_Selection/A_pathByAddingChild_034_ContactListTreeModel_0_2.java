public class A{
	public void addChild(Object parent, Object child) {
		TreePath tp = getTreePathTo(new TreePath(getRoot()), parent);
		//...
		fireTreeNodesInserted(new TreeModelEvent(parent, tp.pathByAddingChild(child)));
	}
}