public class A{
	//...
	void removeChildrenTreeRows(TreePath parent, boolean clearSelected){
		//...
		Object child = ivModel.getChild(parent.getLastPathComponent(), index);
		removeTreeRows(parent.pathByAddingChild(child),clearSelected);
	}
}