public class A{
	public static void collectDescendants(Set set, TreeSource source,TreePath path) {
		Object obj = path.getLastPathComponent();
		CategoryElement cu;
		if (obj == null)return;
		if (obj instanceof CategoryElement) {
			cu = (CategoryElement) obj;
			if (cu.hasChilds()) {
				Iterator it = cu.getChilds();
				if (it != null) {
					while (it.hasNext()) {
						obj = it.next();
						if (obj != null && obj instanceof CatalogElement) {
							TreeNodeSelection tns = TreeNodeSelection.createTreeNodeSelection(source, path.pathByAddingChild(obj));
							set.add(tns);
							if (obj instanceof CategoryElement) {
								collectDescendants(set, source, path.pathByAddingChild(obj));
							}
						}
					}
				}
			}
		}
	}
}