public class A{
	public static void collectDescendants(Set set, TreeSource source,TreePath path) {
		Object obj = path.getLastPathComponent();
		//...
		TreeNodeSelection tns = TreeNodeSelection.createTreeNodeSelection(source, path.pathByAddingChild(obj));
	}
}