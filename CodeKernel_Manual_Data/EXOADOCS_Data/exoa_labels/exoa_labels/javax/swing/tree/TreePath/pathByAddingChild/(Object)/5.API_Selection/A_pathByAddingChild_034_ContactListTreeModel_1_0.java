public class A{
	protected TreePath getTreePathTo(TreePath startPath, Object o) {
		//...
		Object child = getChild(cur, i);
		TreePath newPath = startPath.pathByAddingChild(child);
	}
}