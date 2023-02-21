public class A{
	public FolderList(MsgFolder root) {
		super();
		setModel(new FolderListTreeModel(root));
		setRootVisible(false);
		setCellRenderer(new FolderListTreeCellRenderer());
		getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		Object r = getModel().getRoot();
		TreePath tp = new TreePath(r);
		for(int i=0; i<getModel().getChildCount(r); i++) {
			Object tier1 = getModel().getChild(r, i);
			TreePath tp1 = tp.pathByAddingChild(tier1);
			expandPath(tp1);
			for(int j=0; j<getModel().getChildCount(tier1); j++) {
				Object tier2 = getModel().getChild(tier1, j);
				TreePath tp2 = tp1.pathByAddingChild(tier2);
				expandPath(tp2);
			}
		}
	}
}