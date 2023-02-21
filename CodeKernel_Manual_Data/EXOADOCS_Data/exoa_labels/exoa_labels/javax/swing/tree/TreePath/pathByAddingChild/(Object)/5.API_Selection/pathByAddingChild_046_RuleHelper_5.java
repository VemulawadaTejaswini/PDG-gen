public class A{
	public static boolean hasDescendantNotStockedContent(TreePath path) {
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
						if (obj != null) {
							if (obj instanceof StockableContentElement) {
								if (!((StockableContentElement) obj).isStocked()) {
									logMessage(Loggable.DEBUG,"  = Content Item is not stocked: "+ obj);
									return true;
								}
							} else if (obj instanceof CategoryElement) {
								if (hasDescendantNotStockedContent(path.pathByAddingChild(obj)))return true;
							}
						}
					}
				}
			}
		}
		return false;
	}
}