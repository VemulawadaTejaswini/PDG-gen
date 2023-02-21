public class A{
	protected TreePath getTreePathTo(TreePath startPath, Object o) {
		Object cur = startPath.getLastPathComponent();
		for(int i=0; i<getChildCount(cur); i++) {
			Object child = getChild(cur, i);
			TreePath newPath = startPath.pathByAddingChild(child);
			if(child == o) {
				return newPath;
			} else {
				getTreePathTo(newPath, o);
			}
		}
		return null;
	}
}