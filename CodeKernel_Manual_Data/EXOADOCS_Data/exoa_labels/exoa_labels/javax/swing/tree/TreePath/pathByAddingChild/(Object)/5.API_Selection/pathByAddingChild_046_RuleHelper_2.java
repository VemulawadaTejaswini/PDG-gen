public class A{
	public static boolean isDescendantChecked(TreePath path) {
		Object obj = path.getLastPathComponent();
		CategoryElement cu;
		if (obj == null)return false;
		if (obj instanceof CategoryElement) {
			cu = (CategoryElement) obj;
			logMessage(Loggable.DEBUG, "  Check " + cu);
			if (cu.hasChilds()) {
				Iterator it = cu.getChilds();
				if (it != null) {
					while (it.hasNext()) {
						obj = it.next();
						if (obj != null && obj instanceof CatalogElement) {
							if (((CatalogElement) obj).isChecked()) {
								logMessage(Loggable.DEBUG,"  = Item is checked: " + obj);
								return true;
							}
							if (obj instanceof CategoryElement) {
								if (isDescendantChecked(path.pathByAddingChild(obj)))return true;
							}
						}
					}
				}
			}
		}
		return false;
	}
}