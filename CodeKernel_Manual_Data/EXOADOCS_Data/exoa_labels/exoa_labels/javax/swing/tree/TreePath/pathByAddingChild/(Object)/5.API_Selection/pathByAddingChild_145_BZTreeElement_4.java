public class A{
	private void removeSelected(TreePath path){
		ivSelectionModel.removeSelectionPath(path);
	}
	
	
	void removeTreeRows(TreePath node, boolean clearSelected){
		if (isSelected(node) && clearSelected)removeSelected(node);

		BZTreeNodeView nodeView = getTreeNodeView(node);
		
		if (nodeView != null){
			for (int nrIndex=0; nrIndex<nodeView.getRows().size(); nrIndex++){
				BZElement nodeRow = nodeView.getRows().get(nrIndex);
				nodeRow.getParent().getChildren().remove(nodeRow);
			}
			removeTreeNodeView(node);
			if (isExpanded(node)){
				removeChildrenTreeRows(node,clearSelected);
			}
		}
	}
	
	void removeChildrenTreeRows(TreePath parent, boolean clearSelected){
		int numChildren = ivModel.getChildCount(parent.getLastPathComponent());
		for (int index = 0; index < numChildren; index++){
			Object child = ivModel.getChild(parent.getLastPathComponent(), index);
			removeTreeRows(parent.pathByAddingChild(child),clearSelected);
		}
		
	}
}