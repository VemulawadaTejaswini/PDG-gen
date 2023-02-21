public class A{
	public static void collectDescendantContentItems(Set set,TreeSource source, TreePath path) {
		Object obj = path.getLastPathComponent();
		//...
		collectDescendantContentItems(set, source, path.pathByAddingChild(obj));
	}
}