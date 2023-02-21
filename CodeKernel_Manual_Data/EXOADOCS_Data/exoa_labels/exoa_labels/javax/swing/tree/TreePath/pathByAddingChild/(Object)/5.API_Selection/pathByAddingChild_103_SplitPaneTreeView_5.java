public class A{
	public TreePath getPath() {
		if(node == null) return null;
		TreePath result = new TreePath(currentPath[0]);
		if(currentPath[0] == node) return result;
		for(int i = 1; ; i++) {
			result = result.pathByAddingChild(currentPath[i]);
			if(currentPath[i] == node)return result;
		}
	}
}