public class A{
	public static boolean isDescendantTerminalCategoryChecked(TreePath path) {
		Object obj = path.getLastPathComponent();
		CategoryElement cu;
		if (obj == null)return false;
		if (obj instanceof CategoryElement) {
			cu = (CategoryElement) obj;
			logMessage(Loggable.DEBUG, "  Check " + cu);
			if (cu.hasCategoryItems()) {
				Iterator it = cu.getCategories();
				if (it != null) {
					while (it.hasNext()) {
						obj = it.next();
						if (obj != null) {
							if (isDescendantTerminalCategoryChecked(path.pathByAddingChild(obj)))return true;
						}
					}
				}
			} else {
				if (cu.isChecked()) {
					logMessage(Loggable.DEBUG, "  = Item is checked: " + obj);
					return true;
				}
			}
		}
		return false;
	}
}