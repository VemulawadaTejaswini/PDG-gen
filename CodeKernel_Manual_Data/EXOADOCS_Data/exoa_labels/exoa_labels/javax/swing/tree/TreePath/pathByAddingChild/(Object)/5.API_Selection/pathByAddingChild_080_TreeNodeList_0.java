public class A{
	public TreePath getTreePath() {
		TreePath path = new TreePath(get(0));
		
		for (int i = 1; i < count(); i++) {
			Object o = get(i);
			path = path.pathByAddingChild(o);
		}
		
		return path;
	}
}