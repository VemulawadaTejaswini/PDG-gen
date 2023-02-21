public class A{
	protected TreePath getPathforObject(TreePath parentPath, Object o){
		for(int i = 0; i < getChildCount(parentPath.getLastPathComponent()); i++){
			Object child = getChild(parentPath.getLastPathComponent(), i);
			if(child.equals(o)){
				return parentPath.pathByAddingChild(o);
			}
			else{
				if(getChildCount(child) > 0){
					TreePath path = getPathforObject(parentPath.pathByAddingChild(child), o);
					if(path != null){
						return path;
					}
				}
			}
		}
		return null;
	}
}