public class A{
	public Object getUniqueKey(Object objTarget, Object objParentUniqueKey) {
		TreePath objPath = (TreePath)objParentUniqueKey;
		//...
		objTargetUID = objPath.pathByAddingChild(objTarget);
	}
}