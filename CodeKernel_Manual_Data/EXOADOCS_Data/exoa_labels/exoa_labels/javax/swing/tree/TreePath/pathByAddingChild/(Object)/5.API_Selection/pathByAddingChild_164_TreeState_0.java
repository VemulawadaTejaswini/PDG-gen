public class A{
	public void setParent(MutableTreeNode parent){
		super.setParent(parent);
		if (parent != null){
			path = ((TreeStateNode) parent).getTreePath().pathByAddingChild(getUserObject());
			addMapping(this);
		}
	}
}