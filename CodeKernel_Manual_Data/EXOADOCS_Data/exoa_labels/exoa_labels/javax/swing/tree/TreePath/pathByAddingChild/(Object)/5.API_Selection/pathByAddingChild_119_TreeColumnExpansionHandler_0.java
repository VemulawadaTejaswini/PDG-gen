public class A{
	private int showNode(TreePath path, JTree tree, TreeModel model,int previous) {
		int start = -1;
		if (previous == -1) {
			previous = maker.getTableModelStartIndex(path);
		}
		Object node = path.getLastPathComponent();
		int childCount = model.getChildCount(node);
		if (tree.isExpanded(path)) {
			int temp = previous;
			for (int i = 0; i < childCount; i++) {
				Object childNode = model.getChild(node, i);
				TreePath childPath = path.pathByAddingChild(childNode);
				temp = showNode(childPath, tree, model, temp);
			}
			return temp;
		} else if (childCount != 0) {
			if (start == -1) {
				tableModel.showRow(previous,maker.getTableModelStartIndex(path));
			} else {
				tableModel.showRow(previous, previous);
			}
			return -1;
		}
		return previous;
	}
}