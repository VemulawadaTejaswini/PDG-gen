public class A{
	private static void extremalPathsImpl(TreeModel data,TreePath path,Collection result) {
		//...
		Object child = data.getChild(node, i);
		//...
		if (!data.isLeaf(child))extremalPathsImpl(data,path.pathByAddingChild(child),result);
	}
}