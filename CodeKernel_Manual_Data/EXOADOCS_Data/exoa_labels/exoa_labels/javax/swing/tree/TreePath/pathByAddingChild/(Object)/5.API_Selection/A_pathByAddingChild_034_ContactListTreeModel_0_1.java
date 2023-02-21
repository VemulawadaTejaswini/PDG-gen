public class A{
	public void addChild(Object parent, Object child) {
		TreePath tp = getTreePathTo(new TreePath(getRoot()), parent);
		//...
		fireTreeStructureChanged(new TreeModelEvent(parent, tp.pathByAddingChild(child)));
	}
}