public class A{
	public void treeNodesRemoved(TreeModelEvent ev){
		if (ev != null){
			TreePath parent = ev.getTreePath();
			Object[] children = ev.getChildren();
			TreeSelectionModel sm = getSelectionModel();
			if (children != null){
				TreePath path;
				Vector toRemove = new Vector();
				for (int i = children.length - 1; i >= 0; i--){
					path = parent.pathByAddingChild(children[i]);
					if (nodeStates.containsKey(path))toRemove.add(path);
					if (sm != null)removeDescendantSelectedPaths(path, true);
				}
				if (toRemove.size() > 0)removeDescendantToggledPaths(toRemove.elements());
				TreeModel model = getModel();
				if (model == null || model.isLeaf(parent.getLastPathComponent()))nodeStates.remove(parent);
			}
		}
	}
}