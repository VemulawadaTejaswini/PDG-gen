public class A{
	public Object getUniqueKey(Object objTarget, Object objParentUniqueKey) {
		TreePath objPath = (TreePath)objParentUniqueKey;
		Object objTargetUID = null;
		if(objPath != null){
			objTargetUID = objPath.pathByAddingChild(objTarget);
		}else{
			objTargetUID = new TreePath(objTarget);
		}
		return objTargetUID;
	}
}