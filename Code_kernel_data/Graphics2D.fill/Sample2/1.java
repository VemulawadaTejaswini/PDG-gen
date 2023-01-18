//0
public class func{
	public void paintNodes(Graphics2D g,int height){
            g.setPaint(SwingTools.makeYellowPaint(NODE_RADIUS, NODE_RADIUS));
            g.setPaint(new Color(233, 233, 233));
            g.setPaint(SwingTools.makeBluePaint(NODE_RADIUS, NODE_RADIUS));
            g.setPaint(new Color(233, 233, 233));
        g.fill(node);
}
}
