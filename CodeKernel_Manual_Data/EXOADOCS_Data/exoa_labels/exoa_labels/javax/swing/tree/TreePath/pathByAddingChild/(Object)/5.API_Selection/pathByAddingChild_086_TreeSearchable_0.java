public class A{
	private void populateTreePaths0(Object node, TreePath path, TreeModel model) {
		if (((JTree) _component).isRootVisible() || path.getLastPathComponent() != ((JTree) _component).getModel().getRoot()) {
			_treePathes.add(path);
		}
		for (int i = 0; i < model.getChildCount(node); i++) {
			Object childNode = model.getChild(node, i);
			populateTreePaths0(childNode, path.pathByAddingChild(childNode), model);
		}
	}
}