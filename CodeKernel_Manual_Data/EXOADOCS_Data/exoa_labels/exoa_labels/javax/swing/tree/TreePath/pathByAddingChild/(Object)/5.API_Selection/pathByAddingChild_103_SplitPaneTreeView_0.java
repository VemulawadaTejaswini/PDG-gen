public class A{
	private TreePath currentPathTo(Object node) {
		TreePath result = new TreePath(currentPath[0]);
		if(node == currentPath[0]) return result;
		for(int i = 1; i < currentPath.length; i++) {
			result = result.pathByAddingChild(currentPath[i]);
			if(node == currentPath[i])return result;
		}
		throw new IllegalArgumentException("node " + node + " not in " + new TreePath(currentPath));
	}
}