public class A{
	private boolean areSiblingsSelected(TreePath path){
		TreePath parent = path.getParentPath();
		if(parent==null)return true;
		Object node = path.getLastPathComponent();
		Object parentNode = parent.getLastPathComponent();
		
		int childCount = model.getChildCount(parentNode);
		for(int i = 0; i<childCount; i++){
			Object childNode = model.getChild(parentNode, i);
			if(childNode==node)continue;
			if(!isPathSelected(parent.pathByAddingChild(childNode)))return false;
		}
		return true;
	}
}