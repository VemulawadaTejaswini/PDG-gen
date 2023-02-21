public class A{
	private void expand(TreePath path) {
		if(!(path.getLastPathComponent() instanceof TreeNode)) {
			if(isVisible(path)) return;
			makeVisible(path);
			return;
		}
		TreeNode node = (TreeNode)path.getLastPathComponent();
		if(node.getChildCount() == 0) {
			if(isVisible(path)) return;
			makeVisible(path);
		} else {
			for(Enumeration e = node.children(); e.hasMoreElements();)expand(path.pathByAddingChild(e.nextElement()));
		}
	}
}