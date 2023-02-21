public class A{
	public static void expand(JTree tree, TreePath path){
		//...
		for(int i = 0; i < count; ++i)expand(tree, path.pathByAddingChild(model.getChild(node, i)));
	}
}