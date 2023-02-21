public class A{
	private void resetChildrenPaths(TreePath parentPath){
		removeMapping(this);
		if (parentPath == null){
			path = new TreePath(getUserObject());
		}
		else{
			path = parentPath.pathByAddingChild(getUserObject());
		}
		addMapping(this);
		for (int counter = getChildCount() - 1; counter >= 0; counter--){
			((TreeStateNode) getChildAt(counter)).resetChildrenPaths(path);
		}
	}
}