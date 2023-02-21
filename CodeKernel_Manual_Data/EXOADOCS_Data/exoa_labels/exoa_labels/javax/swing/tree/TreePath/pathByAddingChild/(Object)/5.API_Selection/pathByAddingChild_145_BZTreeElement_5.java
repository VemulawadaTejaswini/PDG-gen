public class A{
	private void genChildrenNodeViews(TreePath parentPath,ArrayList resArrayList){


		if (isExpanded(parentPath)){

			int numChildren = ivModel.getChildCount(parentPath.getLastPathComponent());
			for (int index = 0; index < numChildren; index++){
				Object childNode = ivModel.getChild(parentPath.getLastPathComponent(), index);
				TreePath childNodePath = parentPath.pathByAddingChild(childNode);
				if (isVisible(childNodePath)){
					this.genNodeViews(childNodePath, resArrayList);
				}
			}
		}
	}
}