public class A{
	private void findNodes(TreePath path, List nodes, List<TreePath> result) {
		Object lastPath = path.getLastPathComponent();
		if(nodes.contains(lastPath)) {
			result.add(path);
		}
		TreeModel model = getComponent().getModel();
		int count = model.getChildCount(lastPath);
		for(int iter = 0 ; iter < count ; iter++) {
			Object child = model.getChild(lastPath, iter);
			findNodes(path.pathByAddingChild(child), nodes, result);
		}
	}
}