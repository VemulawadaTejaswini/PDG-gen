public class A{
	public static void collectDescendants(Set set, TreeSource source,TreePath path) {
		Object obj = path.getLastPathComponent();
		//...
		collectDescendants(set, source, path.pathByAddingChild(obj));
	}
}