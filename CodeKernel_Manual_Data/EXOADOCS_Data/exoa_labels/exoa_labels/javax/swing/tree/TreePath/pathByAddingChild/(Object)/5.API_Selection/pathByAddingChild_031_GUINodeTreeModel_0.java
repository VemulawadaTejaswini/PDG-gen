public class A{
	public boolean hasNext() {
		if (childPath != null) return true;
		boolean descend = true;
		while (parentPath != null || lastPath != null) {
			GUINode crtParent;
			List children;
			Object crtChild;
			if (parentPath != null) {
				crtParent = (GUINode) parentPath.getLastPathComponent();
				children = crtParent.getChildren();
				crtChild = children.get(crtChildIndex);
			} else {
				crtParent = null;
				children = null;
				crtChild = lastPath.getLastPathComponent();
			}
			if (descend && crtChild instanceof GUINode) {
				List newChildren = ((GUINode)crtChild).getChildren();
				if (! newChildren.isEmpty()) {
					crtChildIndex = 0;
					parentPath = parentPath == null? new TreePath(crtChild): parentPath.pathByAddingChild(crtChild);
					childPath = parentPath.pathByAddingChild(newChildren.get(0));
					return true;
				}
				descend = false;
			}
			if(parentPath == null) return false;
			if (children.size() > ++crtChildIndex) {
				childPath = parentPath.pathByAddingChild(children.get(crtChildIndex));
				return true;
			}
			parentPath = parentPath.getParentPath();
			if(parentPath == null) return false;
			crtChildIndex =((GUINode)parentPath.getLastPathComponent()).getIndexOfChild(crtParent);
		}
		return false;
	}
}