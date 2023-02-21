public class A{
	public void treeNodesInserted(TreeModelEvent e) {
		super.treeNodesInserted(e);
		if(e != null) {
			int                 changedIndexs[];
			int                 maxCounter;
			
			changedIndexs = e.getChildIndices();
			if(e.getTreePath() != null && changedIndexs != null &&(maxCounter = changedIndexs.length) > 0) {

				setExpandedState(e.getTreePath(), true);
				for(int counter = 0; counter < maxCounter; counter++) {
					setExpandedState(e.getTreePath().pathByAddingChild(e.getChildren()[counter]), true);
				}
			}
		}
	}
}