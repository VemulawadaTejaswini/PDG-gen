public class A{
	public static void expandLevels(TreeSelectionModel expanded,TreeModel treeModel,TreePath path,int levels){
		//...
		Object child = treeModel.getChild(parent,index);
		expandLevels(expanded,treeModel,path.pathByAddingChild(child),levels-1);
	}
}