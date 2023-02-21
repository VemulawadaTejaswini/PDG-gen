public class A{
	private boolean initialize(TreeSource src, TreePath path, CategoryElement ce) {
		//...
		Object obj;
		//...
		initialize(src, path.pathByAddingChild(obj),(CategoryElement) obj);
	}
}