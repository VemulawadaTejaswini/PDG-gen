public class A{
	private TreePath shortestCommonPath(TreePath p1, TreePath p2) {
		TreePath result = new TreePath(p1.getPathComponent(0));
		for(int i = 0; i < Math.min(p1.getPathCount(), p2.getPathCount()); i++)if(!p1.getPathComponent(i).equals(p2.getPathComponent(i)))break;
		elseresult = result.pathByAddingChild(p1.getPathComponent(i));
		return result;
	}
}