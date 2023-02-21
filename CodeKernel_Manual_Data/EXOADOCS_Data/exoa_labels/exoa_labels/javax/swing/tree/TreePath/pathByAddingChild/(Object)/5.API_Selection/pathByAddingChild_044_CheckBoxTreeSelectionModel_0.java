public class A{
	private boolean areSiblingsSelected(TreePath path) {
		TreePath parent = path.getParentPath();
		if (parent == null)return true;
		Object node = path.getLastPathComponent();
		Object parentNode = parent.getLastPathComponent();
		
		int childCount = _model.getChildCount(parentNode);
		for (int i = 0; i < childCount; i++) {
			Object childNode = _model.getChild(parentNode, i);
			if (childNode == node)continue;
			TreePath childPath = parent.pathByAddingChild(childNode);
			if (_tree != null && (!_tree.isCheckBoxVisible(childPath) || !_tree.isCheckBoxEnabled(childPath)))continue;
			if (!isPathSelected(childPath)) {
				return false;
			}
		}
		return true;
	}
}