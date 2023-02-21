public class A{
	public void run() {
		Object[] children = e.getChildren();
		TreePath pPath = e.getTreePath();
		Object parent = pPath.getLastPathComponent();
		if (parent != null) {
			for (int i = 0; i < children.length; i++) {
				int row = tree.getRowForPath(pPath.pathByAddingChild(children[i]));
				if (row != -1)fireTableRowsUpdated(row, row);
			}
		} else {
			fireTableDataChanged();
		}
	}
}