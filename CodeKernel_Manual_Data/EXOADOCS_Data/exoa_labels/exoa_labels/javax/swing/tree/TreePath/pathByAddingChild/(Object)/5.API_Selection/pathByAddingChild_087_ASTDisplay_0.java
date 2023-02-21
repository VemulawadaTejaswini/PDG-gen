public class A{
	private static void extremalPathsImpl(TreeModel data,TreePath path,Collection result) {
		Object node = path.getLastPathComponent();
		
		boolean hasNonLeafChildren = false;
		
		int count = data.getChildCount(node);
		
		for (int i = 0; i < count; i++)if (!data.isLeaf(data.getChild(node, i)))hasNonLeafChildren = true;

		if (!hasNonLeafChildren)result.add(path);
		else {
			for (int i = 0; i < count; i++) {
				Object child = data.getChild(node, i);
				
				if (!data.isLeaf(child))extremalPathsImpl(data,path.pathByAddingChild(child),result);
			}
		}
	}
}