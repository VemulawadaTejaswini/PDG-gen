public class A{
	private void command(TreePath parent, boolean expand) {
		Item node = (Item) parent.getLastPathComponent();
		if (node instanceof CompositeItem) {
			CompositeItem ci = (CompositeItem) node;
			if (ci.getItemsLength() >= 0) {
				for (int i = 0; i < ci.getItemsLength(); i++) {
					TreePath path = parent.pathByAddingChild(ci.getItem(i));
					command(path, expand);
				}
			}
		}
		if (expand) {
			expandPath(parent);
		} else {
			collapsePath(parent);
		}
	}
}