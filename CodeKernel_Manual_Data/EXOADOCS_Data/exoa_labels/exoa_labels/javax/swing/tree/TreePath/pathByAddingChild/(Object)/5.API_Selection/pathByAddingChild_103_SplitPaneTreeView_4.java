public class A{
	public void valueChanged(ListSelectionEvent e) {
		NodeList l = (NodeList)e.getSource();
		if(!e.getValueIsAdjusting()) {
			int[] idxs = l.getSelectedIndices();
			if(idxs.length == 1) {
				ProgressWatcher.watch(SplitPaneTreeView.this);
				if(!controler.tree.isLeaf(l.getModel().getElementAt(idxs[0]))) {
					SplitPaneTreeView.this.makeVisible(currentPathTo(l.node).pathByAddingChild(l.getModel().getElementAt(idxs[0])));
				}
			}
		}
	}
}