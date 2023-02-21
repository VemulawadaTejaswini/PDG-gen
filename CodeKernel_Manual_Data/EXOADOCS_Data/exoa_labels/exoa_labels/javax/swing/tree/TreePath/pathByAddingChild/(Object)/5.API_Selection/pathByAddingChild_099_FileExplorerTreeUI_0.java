public class A{
	protected void paintVerticalPartOfLeg(Graphics g, Rectangle clipBounds,Insets insets, TreePath path) {

		int lineX = ((path.getPathCount() + depthOffset) *totalChildIndent) - getRightChildIndent() + insets.left;

		int clipLeft = clipBounds.x;
		int clipRight = clipBounds.x + (clipBounds.width - 1);
		
		if (lineX > clipLeft && lineX < clipRight) {
			int clipTop = clipBounds.y;
			int clipBottom = clipBounds.y + clipBounds.height;
			Rectangle parentBounds = getPathBounds(tree, path);
			Rectangle lastChildBounds = getPathBounds(tree,getLastChildPath(path));

			if(lastChildBounds == null)return;

			int       top;
			
			if(parentBounds == null) {
				top = Math.max(insets.top + getVerticalLegBuffer(),clipTop);
			}
			elsetop = Math.max(parentBounds.y + parentBounds.height +getVerticalLegBuffer(), clipTop);
			if(path.getPathCount() == 1 && !isRootVisible()) {
				TreeModel      model = getModel();
				
				if(model != null) {
					Object        root = model.getRoot();
					
					if(model.getChildCount(root) > 0) {
						parentBounds = getPathBounds(tree, path.pathByAddingChild(model.getChild(root, 0)));
						if(parentBounds != null)top = Math.max(insets.top + getVerticalLegBuffer(),parentBounds.y +parentBounds.height / 2);
					}
				}
			}
			
			int bottom = Math.min(lastChildBounds.y +(lastChildBounds.height / 2), clipBottom);

			g.setColor(getHashColor());
			super.paintVerticalLine(g, tree, lineX + sideCorr, top, bottom);
		}
	}
}