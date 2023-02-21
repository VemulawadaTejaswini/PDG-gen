public class A{
	public static TreePath findChild(CategoryElement ce, CatalogElement ck,TreePath tp, boolean digIn) {
		//...
		Object obj = null;
		//...
		TreePath tn = findChild((CategoryElement) obj, ck, tp.pathByAddingChild(obj), digIn);
	}
}