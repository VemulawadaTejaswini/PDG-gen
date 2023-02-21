public class A{
	public static Vector getPathsToNodeAsVector(DAGModel model, Object node) {
		//...
		for(int j=0; j < paths.size(); j++)result.addElement(((TreePath) paths.elementAt(j)).pathByAddingChild(node));
	}
}