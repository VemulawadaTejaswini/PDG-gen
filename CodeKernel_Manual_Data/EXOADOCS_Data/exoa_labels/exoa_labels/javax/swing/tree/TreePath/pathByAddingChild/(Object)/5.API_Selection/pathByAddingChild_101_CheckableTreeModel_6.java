public class A{
	public void setChildsUnchecked(TreePath path, CategoryElement ce) {
		ListIterator li = ce.getChilds();
		Object obj;
		TreePath tp;
		if (li == null)return;
		while (li.hasNext()) {
			obj = li.next();
			if (obj instanceof CatalogElement) {
				if (((CatalogElement) obj).isChecked()) {
					((CatalogElement) obj).setChecked(false);
					tp = path.pathByAddingChild(obj);
					fireTreeUnchecked(tp);
				}
			}
			if (obj instanceof CategoryElement) {
				tp = path.pathByAddingChild(obj);
				setChildsUnchecked(tp, (CategoryElement) obj);
			}
		}
	}
}