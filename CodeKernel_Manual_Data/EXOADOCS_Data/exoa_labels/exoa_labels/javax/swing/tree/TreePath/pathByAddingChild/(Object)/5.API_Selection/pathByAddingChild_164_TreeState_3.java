public class A{
	public Object nextElement(){
		if (!hasMoreElements()){
			throw new NoSuchElementException("No more visible paths");
		}
		
		TreePath retObject;
		
		if (nextIndex == -1){
			retObject = parent.getTreePath();
		}
		else{
			TreeStateNode node = parent.getChildAtModelIndex(nextIndex);
			
			if (node == null){
				retObject = parent.getTreePath().pathByAddingChild(treeModel.getChild(parent.getUserObject(), nextIndex));
			}
			else{
				retObject = node.getTreePath();
			}
		}
		updateNextObject();
		return retObject;
	}
}