public class A{
	public void select(String parentPath, String childSubstring) {
		TreePath jTreePath = getTreePath(parentPath);
		TreeModel model = jTree.getModel();
		Object node = jTreePath.getLastPathComponent();
		List subPaths = new ArrayList();
		for (int i = 0, max = model.getChildCount(node); i < max; i++) {
			Object child = model.getChild(node, i);
			String text = getShownText(child);
			if (text.indexOf(childSubstring) >= 0) {
				subPaths.add(jTreePath.pathByAddingChild(child));
			}
		}
		if (subPaths.isEmpty()) {
			Assert.fail("No children found");
		}
		
		TreePath[] result = (TreePath[])subPaths.toArray(new TreePath[subPaths.size()]);
		jTree.setSelectionPaths(result);
	}
}