public class A{
	public static TreePath findChild(CategoryElement ce, CatalogElement ck,TreePath tp, boolean digIn) {
		//...
		Object obj = null;
		//...
		if (((CatalogElement) obj).getId() == ck.getId())return tp.pathByAddingChild(obj);
	}
}