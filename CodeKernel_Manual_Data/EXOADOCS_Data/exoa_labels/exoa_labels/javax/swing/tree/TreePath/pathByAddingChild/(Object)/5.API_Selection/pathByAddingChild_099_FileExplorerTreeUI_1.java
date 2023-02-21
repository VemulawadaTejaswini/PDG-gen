public class A{
	protected TreePath getLastChildPath(TreePath parent) {
		if(treeModel != null) {
			int         childCount = treeModel.getChildCount(parent.getLastPathComponent());
			if(childCount > 0){
				return parent.pathByAddingChild(treeModel.getChild(parent.getLastPathComponent(), childCount - 1));
			}
		}
		return null;
	}
}