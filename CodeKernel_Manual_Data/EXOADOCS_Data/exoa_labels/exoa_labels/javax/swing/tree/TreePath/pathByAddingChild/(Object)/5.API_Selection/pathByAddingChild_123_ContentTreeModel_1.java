public class A{
	public void setChildsUncheckedAndBlocked(TreePath path, CategoryElement ce) {
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
				((CatalogElement) obj).setBlocked(true);
			}
			if (obj instanceof CategoryElement) {
				tp = path.pathByAddingChild(obj);
				setChildsUncheckedAndBlocked(tp, (CategoryElement) obj);
			}
		}
	}
}