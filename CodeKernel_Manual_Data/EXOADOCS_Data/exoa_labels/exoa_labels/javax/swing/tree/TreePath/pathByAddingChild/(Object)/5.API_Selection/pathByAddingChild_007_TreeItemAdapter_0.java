public class A{
	private TreePath findNode(TreePath path, Object node) {
		Object lastPath = path.getLastPathComponent();
		if(lastPath == node) {
			return path;
		}
		TreeModel model = getComponent().getModel();
		int count = model.getChildCount(lastPath);
		for(int iter = 0 ; iter < count ; iter++) {
			Object child = model.getChild(lastPath, iter);
			TreePath result = findNode(path.pathByAddingChild(child), node);
			if(result != null) {
				return result;
			}
		}
		return null;
	}
}