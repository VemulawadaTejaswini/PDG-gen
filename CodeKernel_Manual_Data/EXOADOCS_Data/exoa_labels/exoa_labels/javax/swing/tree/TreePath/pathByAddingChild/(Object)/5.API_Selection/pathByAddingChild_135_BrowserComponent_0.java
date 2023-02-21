public class A{
	public void setBrowserPath(BrowserPath browserPath) {
		
		if (browserPath == null) {
			return;
		}
		LinkedList pathComponents = browserPath.getPathComponents();
		Iterator it = pathComponents.iterator();
		if (!it.hasNext()) {
			return;
		}
		CategoryHolder categoryComponent = (CategoryHolder)it.next();
		String category = categoryComponent.getCategory();
		TreePath path = treePane.getPathForCategory(category);
		if (path == null) {
			return;
		}
		while (it.hasNext()) {
			PathComponent pathComponent = (PathComponent)it.next();
			int childIndex;
			if (pathComponent instanceof ReferenceHolder) {
				ReferenceHolder referenceHolder = (ReferenceHolder)pathComponent;
				try {
					if (category.equals(BrowserTreeNode.NODE_METHOD)) {
						childIndex = services.getClassFile().getMethodIndex(referenceHolder.getName(), referenceHolder.getType());
					} else if (category.equals(BrowserTreeNode.NODE_FIELD)) {
						childIndex = services.getClassFile().getFieldIndex(referenceHolder.getName(), referenceHolder.getType());
					} else {
						break;
					}
				} catch (InvalidByteCodeException ex) {
					break;
				}
			} else if (pathComponent instanceof IndexHolder) {
				childIndex = ((IndexHolder)pathComponent).getIndex();
			} else {
				break;
			}
			BrowserTreeNode lastNode = (BrowserTreeNode)path.getLastPathComponent();
			if (childIndex >= lastNode.getChildCount()) {
				break;
			}
			path = path.pathByAddingChild(lastNode.getChildAt(childIndex));
		}
		
		JTree tree = treePane.getTree();
		tree.expandPath(path);
		tree.setSelectionPath(path);
		Object[] pathObjects = path.getPath();
		if (pathObjects.length > 2) {
			TreePath categoryPath = new TreePath(new Object[]{pathObjects[0], pathObjects[1], pathObjects[2]});
			tree.scrollPathToVisible(categoryPath);
		}
		
	}
}