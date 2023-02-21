public class A{
	public void uncheckWithChildsExcept(TreePath path, CategoryElement ce,CatalogElement ci) {
		if ((!ce.isBlocked()) && ce.isChecked()) {
			if (ci == null || (!ce.equals(ci))) {
				ce.setChecked(false);
				this.fireTreeUnchecked(path);
			}
		}
		ce.setChecked(false);
		ListIterator li = ce.getChilds();
		if (li == null)return;
		Object obj = null;
		while (li.hasNext()) {
			obj = li.next();
			if (obj instanceof CategoryElement) {
				TreePath tp = path.pathByAddingChild(obj);
				uncheckWithChildsExcept(tp, (CategoryElement) obj, ci);
			} else if (obj instanceof ContentElement) {
				ContentElement co = (ContentElement) obj;
				if ((!co.isBlocked()) && co.isChecked()) {
					if (ci == null || (!co.equals(ci))) {
						co.setChecked(false);
						TreePath tp = path.pathByAddingChild(co);
						fireTreeUnchecked(tp);
					}
				}
			}
		}
	}
}