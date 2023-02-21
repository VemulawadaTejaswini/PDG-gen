public class A{
	public static void expand(JTree tree, TreePath path){
		TreeModel model = tree.getModel();
		Object node = path.getLastPathComponent();
		
		if(model.isLeaf(node))return;

		tree.expandPath(path);
		
		int count = model.getChildCount(node);
		for(int i = 0; i < count; ++i)expand(tree, path.pathByAddingChild(model.getChild(node, i)));
	}
}