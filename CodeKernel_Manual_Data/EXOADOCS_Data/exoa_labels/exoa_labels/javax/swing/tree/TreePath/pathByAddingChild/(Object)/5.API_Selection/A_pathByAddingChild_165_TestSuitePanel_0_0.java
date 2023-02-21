public class A{
	private void expandPath(TreePath treePath, int index, boolean select) {
		TreePath fullTreePath = treePath.pathByAddingChild(fModel.getChild(treePath.getLastPathComponent(), index));
	}
}