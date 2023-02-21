public class A{
	public static TreePath findChild(CategoryElement ce, CatalogElement ck,TreePath tp, boolean digIn) {
		if (ce == null)return null;
		if (ck == null)return null;
		if (tp == null)tp = new TreePath(ce);
		boolean isCategoryTransport = false;
		if (ck instanceof CategoryElementTransport)isCategoryTransport = true;
		if (ce.getId() == ck.getId()&& (isCategoryTransport || ck.getClass().isInstance(ce)))return tp;
		ListIterator li = ce.getChilds();
		if (li != null) {
			Object obj = null;
			while (li.hasNext()) {
				obj = li.next();
				if (obj instanceof CategoryElement && digIn) {
					TreePath tn = findChild((CategoryElement) obj, ck, tp.pathByAddingChild(obj), digIn);
					if (tn != null)return tn;
				} else if (ck.getClass().isInstance(obj)) {
					if (((CatalogElement) obj).getId() == ck.getId())return tp.pathByAddingChild(obj);
				}
			}
		}
		return null;
	}
}