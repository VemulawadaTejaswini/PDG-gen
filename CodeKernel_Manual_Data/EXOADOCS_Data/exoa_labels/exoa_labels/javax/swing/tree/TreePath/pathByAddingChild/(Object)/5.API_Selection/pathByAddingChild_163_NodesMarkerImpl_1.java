public class A{
	public Vector setCheckboxesOfDescendants(CheckboxStateOrder order,TreePath path, Vector paths) {
		CategoryElement ce;
		if (paths == null)paths = new Vector();
		if (path == null|| !(path.getLastPathComponent() instanceof CategoryElement))return paths;
		ce = (CategoryElement) path.getLastPathComponent();
		ListIterator li = null;
		if (order.isContentMode(CheckboxStateOrder.DONT_TOUCH))li = ce.getCategories();
		elseli = ce.getChilds();
		if (li == null)return paths;
		Object obj = null;
		boolean updateNode;
		CategoryElement co;
		ContentElement cc;
		TreePath tp;
		while (li.hasNext()) {
			obj = li.next();
			updateNode = false;
			if (obj instanceof CategoryElement) {
				tp = path.pathByAddingChild(obj);
				co = (CategoryElement) obj;
				if (co.isLeaf()) {
					if (!order.isLeafCategoriesMode(CheckboxStateOrder.DONT_TOUCH)) {
						if (order.isLeafCategoriesMode(CheckboxStateOrder.HIDE)&& !(co.isCheckboxHidden() && co.isBlocked())) {
							if (debug)System.out.println(co+ " - is leaf Category, have order to hide it.");
							co.setCheckboxHidden(true);
							co.setBlocked(true);
							updateNode = true;
						} else if (order.isLeafCategoriesMode(CheckboxStateOrder.MAKE_VISIBLE)&& (co.isCheckboxHidden() || co.isBlocked())) {
							if (debug)System.out.println(co+ " - is leaf Category, checkbox is hidden, have order to make it visible.");
							co.setCheckboxHidden(false);
							co.setBlocked(false);
							updateNode = true;
						}
					}
					paths.add(tp);
					if (!order.isContentMode(CheckboxStateOrder.DONT_TOUCH)) {
						setCheckboxesOfDescendants(order, path.pathByAddingChild(obj), paths);
					}
				} else {
					if (!order.isNonTerminalCategoriesMode(CheckboxStateOrder.DONT_TOUCH)) {
						if (order.isNonTerminalCategoriesMode(CheckboxStateOrder.HIDE)&& !(co.isCheckboxHidden() && co.isBlocked())) {
							if (debug)System.out.println(co+ " - is non-terminal Category, have order to hide it.");
							co.setCheckboxHidden(true);
							co.setBlocked(true);
							updateNode = true;
						} else if (order.isNonTerminalCategoriesMode(CheckboxStateOrder.MAKE_VISIBLE)&& (co.isCheckboxHidden() || co.isBlocked())) {
							if (debug)System.out.println(co+ " - is non-terminal Category, checkbox is hidden, have order to make it visible.");
							co.setCheckboxHidden(false);
							co.setBlocked(false);
							updateNode = true;
						}
					}
					paths.add(tp);
					setCheckboxesOfDescendants(order, path.pathByAddingChild(obj), paths);
				}
				
			} else if (!order.isContentMode(CheckboxStateOrder.DONT_TOUCH)&& obj instanceof ContentElement) {
				tp = path.pathByAddingChild(obj);
				cc = (ContentElement) obj;
				if (order.isContentMode(CheckboxStateOrder.HIDE)&& !(cc.isCheckboxHidden() && cc.isBlocked())) {
					if (debug)System.out.println(cc+ " - checkbox is visible, have order to hide it.");
					cc.setCheckboxHidden(true);
					cc.setBlocked(true);
					paths.add(tp);
				} else if (order.isContentMode(CheckboxStateOrder.MAKE_VISIBLE)&& (cc.isCheckboxHidden() || cc.isBlocked())) {
					if (debug)System.out.println(cc+ " - checkbox is hidden, have order to make it visible.");
					cc.setCheckboxHidden(false);
					cc.setBlocked(false);
					paths.add(tp);
				}
			}
		}
		return paths;
	}
}