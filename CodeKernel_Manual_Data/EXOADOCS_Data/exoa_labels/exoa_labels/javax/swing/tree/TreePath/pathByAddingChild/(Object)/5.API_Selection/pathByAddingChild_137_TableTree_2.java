public class A{
	public void run() {
		int[] indices = e.getChildIndices();
		TreePath pPath = e.getTreePath();
		Object parent = pPath.getLastPathComponent();
		if (parent != null) {
			for (int i = 0; i < indices.length; i++) {
				int row = -1;
				int nextIndex = indices[i] - i;
				if (nextIndex < model.getChildCount(parent)) {
					Object node = model.getChild(parent, nextIndex);
					row = tree.getRowForPath(pPath.pathByAddingChild(node));
				} else {
					row = getLastRowForPath(pPath) + 1;
				}
				if (row != -1)fireTableRowsDeleted(row, row);
			}
		} else {
			fireTableDataChanged();
		}
	}
}