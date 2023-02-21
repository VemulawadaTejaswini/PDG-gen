public class A{
	public static Vector getPathsToNodeAsVector(DAGModel model, Object node) {
		Vector result = new Vector();
		int parentCount = model.getParentCount(node);
		if (parentCount == 0) {
			result.addElement(new TreePath(node));
		} else {
			for(int i=0; i < parentCount; i++) {
				Object parent = model.getParent(node, i);
				Vector paths = getPathsToNodeAsVector(model, parent);
				for(int j=0; j < paths.size(); j++)result.addElement(((TreePath) paths.elementAt(j)).pathByAddingChild(node));
			}
		}
		return result;
	}
}