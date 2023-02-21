public class A{
	public void setCheckboxesOfDescendants(CheckboxStateOrderInterface order,TreePath path) {
		if (order == null)return;
		CategoryElement ce;
		if (path == null|| !(path.getLastPathComponent() instanceof CategoryElement))return;
		ce = (CategoryElement) path.getLastPathComponent();
		ListIterator li = null;
		li = ce.getChilds();
		if (li == null)return;
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
				updateNode = order.applyStateOrder(co);
				if (updateNode)fireTreeNodesChanged(tp);
				setCheckboxesOfDescendants(order, path.pathByAddingChild(obj));
			} else if (obj instanceof ContentElement) {
				tp = path.pathByAddingChild(obj);
				cc = (ContentElement) obj;
				updateNode = order.applyStateOrder(cc);
				if (updateNode)fireTreeNodesChanged(tp);
			}
		}
	}
}