public class A{
	public static void selectPath(JTreeFixture treeFixture, String[]path){
		JTree tree = treeFixture.targetCastedTo(JTree.class);
		TreePath finalPath = getPathForStrings(treeFixture,path);
		
		if(!tree.isVisible(finalPath)){
			TreePath parentPath = new TreePath(finalPath.getPathComponent(0));
			for(int i=1;i<finalPath.getPathCount();i++){
				TreePath curPath = parentPath.pathByAddingChild(finalPath.getPathComponent(i));
				if(!tree.isVisible(curPath)){
					treeFixture.toggleRow(tree.getRowForPath(curPath.getParentPath()));
				}
				parentPath = curPath;
			}
		}
		
		treeFixture.selectRow(tree.getRowForPath(finalPath));
		
	}
}