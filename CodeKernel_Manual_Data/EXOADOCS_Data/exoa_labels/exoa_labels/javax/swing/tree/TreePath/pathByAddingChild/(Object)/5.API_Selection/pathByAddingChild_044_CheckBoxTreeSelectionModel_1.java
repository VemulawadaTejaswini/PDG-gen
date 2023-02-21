public class A{
	private void toggleRemoveSelection(TreePath path) {
		boolean fireEventAtTheEnd = false;
		if (isSingleEventMode() && _fireEvent) {
			_fireEvent = false;
			fireEventAtTheEnd = true;
		}
		
		try {
			Stack<TreePath> stack = new Stack<TreePath>();
			TreePath parent = path.getParentPath();
			while (parent != null && !isPathSelected(parent)) {
				stack.push(parent);
				parent = parent.getParentPath();
			}
			if (parent != null)stack.push(parent);
			else {
				delegateRemoveSelectionPaths(new TreePath[]{path});
				return;
			}
			
			List<TreePath> toBeAdded = new ArrayList<TreePath>();
			while (!stack.isEmpty()) {
				TreePath temp = stack.pop();
				TreePath peekPath = stack.isEmpty() ? path : stack.peek();
				Object node = temp.getLastPathComponent();
				Object peekNode = peekPath.getLastPathComponent();
				int childCount = _model.getChildCount(node);
				for (int i = 0; i < childCount; i++) {
					Object childNode = _model.getChild(node, i);
					if (childNode != peekNode) {
						TreePath treePath = temp.pathByAddingChild(childNode);
						if (_tree.isCheckBoxVisible(treePath) && _tree.isCheckBoxEnabled(treePath)) {
							toBeAdded.add(treePath);
						}
					}
				}
			}
			if (toBeAdded.size() > 0) {
				delegateAddSelectionPaths(toBeAdded.toArray(new TreePath[toBeAdded.size()]));
			}
			delegateRemoveSelectionPaths(new TreePath[]{parent});
		}
		finally {
			_fireEvent = true;
			if (isSingleEventMode() && fireEventAtTheEnd) {
				notifyPathChange(new TreePath[]{path}, false, path);
			}
		}
	}
}