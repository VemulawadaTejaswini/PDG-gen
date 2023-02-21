public class A{
	public void treeExpanded(TreeExpansionEvent event) {
		TreePath parent = event.getPath();
		Object obj = parent.getLastPathComponent();
		if (obj != null) {
			if (obj instanceof CategoryElement) {
				CategoryElement ce = (CategoryElement) obj;
				if (ce.hasCategoryItems()) {
					ListIterator li = ce.getCategories();
					Object obj2;
					while (li.hasNext()) {
						obj2 = li.next();
						CategoryElement cc = (CategoryElement) obj2;
						if (cc.isDownloaded()&& !cc.hasChilds()&& !CheckableTree.this.isExpanded(parent.pathByAddingChild(obj2))) {
							CheckableTree.this.setExpandedState(parent.pathByAddingChild(obj2), true);
							repaint();
						}
					}
				}
			}
		}
		
	}
}