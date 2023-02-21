public class A{
	private TreePath computeChildTreePath(String parentPath, int childIndex) {
		TreePath jTreePath = getTreePath(parentPath);
		Object child = jTree.getModel().getChild(jTreePath.getLastPathComponent(), childIndex);
		return jTreePath.pathByAddingChild(child);
	}
}