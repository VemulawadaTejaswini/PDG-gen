public class A{
	public static void collectDescendantContentItems(Set set,TreeSource source, TreePath path) {
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
						if (obj != null && obj instanceof ContentElement) {
							TreeNodeSelection tns = TreeNodeSelection.createTreeNodeSelection(source, path.pathByAddingChild(obj));
							set.add(tns);
						} else if (obj instanceof CategoryElement) {
							collectDescendantContentItems(set, source, path.pathByAddingChild(obj));
						}
					}
				}
			}
		}
	}
}