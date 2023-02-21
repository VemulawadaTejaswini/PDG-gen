public class A{
	public void expandAll(TreePath tp) {
		TreeNode tn = (TreeNode)tp.getLastPathComponent();
		expandPath(tp);
		for (int i=0; i<getModel().getChildCount(tn); i++) {
			TreePath child = tp.pathByAddingChild(getModel().getChild(tn, i));
			expandAll(child);
		}
	}
}