public class A{
	private void expand(TreePath path) {
		//...
		for(Enumeration e = node.children(); e.hasMoreElements();)expand(path.pathByAddingChild(e.nextElement()));
	}
}