public class A{
	protected void paintVerticalPartOfLeg(Graphics g, Rectangle clipBounds,Insets insets, TreePath path) {
		//...
		parentBounds = getPathBounds(tree, path.pathByAddingChild(model.getChild(root, 0)));
	}
}