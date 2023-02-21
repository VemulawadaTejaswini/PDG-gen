public class A{
	public void expand(TreePath path, JTree tree) {
		TreeModel model = tree.getModel();
		Object node = path.getLastPathComponent();
		if(model.isLeaf(node))return;
		tree.expandPath(path);
		
		int count = model.getChildCount(node);
		for(int i = 0; i < count; i++) {
			expand(path.pathByAddingChild(model.getChild(node, i)), tree);
		}
		
	}
}