public class A{
	public static boolean hasDescendantContent(TreePath path) {
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
							if (obj instanceof ContentElement) {
								logMessage(Loggable.DEBUG, "Has Content Item: "+ obj);
								return true;
							} else if (obj instanceof CategoryElement) {
								if (hasDescendantContent(path.pathByAddingChild(obj)))return true;
							}
						}
					}
				}
			}
		}
		return false;
	}
}