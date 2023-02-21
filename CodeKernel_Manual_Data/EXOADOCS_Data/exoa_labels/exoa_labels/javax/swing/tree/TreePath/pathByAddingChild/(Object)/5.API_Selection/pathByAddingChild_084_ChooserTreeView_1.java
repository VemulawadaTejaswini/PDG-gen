public class A{
	public void mouseClicked(MouseEvent e) {
		if(e.getClickCount() == 2 && ((e.getModifiers() & e.BUTTON1_MASK) == e.BUTTON1_MASK)) {
			ProgressWatcher.watch(ChooserTreeView.this);
			int idx = content.locationToIndex(e.getPoint());
			if(idx < 0) return;
			Object n = content.getModel().getElementAt(idx);
			if(!tree.isLeaf(n))pathView.setPath(pathView.getPath().pathByAddingChild(n));
		}
	}
}