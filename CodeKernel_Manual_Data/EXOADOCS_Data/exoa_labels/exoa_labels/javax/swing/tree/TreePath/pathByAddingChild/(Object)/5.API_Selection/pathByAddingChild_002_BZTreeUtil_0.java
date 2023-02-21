public class A{
	public static void expandLevels(TreeSelectionModel expanded,TreeModel treeModel,TreePath path,int levels){
		if (levels<=0)return;


		expanded.addSelectionPath(path);
		
		Object parent =path.getLastPathComponent();
		int numChildren=treeModel.getChildCount(path.getLastPathComponent());
		for (int index=0; index<numChildren; index++){
			Object child = treeModel.getChild(parent,index);
			expandLevels(expanded,treeModel,path.pathByAddingChild(child),levels-1);
		}
		
		
		
	}
}