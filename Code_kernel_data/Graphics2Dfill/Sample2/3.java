//2
public class func{
	public void fillTabShape(Graphics2D g2d,Shape shape,boolean isSelected,Rectangle bounds){
        g2d.setPaint(UIUtil.getGradientPaint(bounds.x, bounds.y, TAB_BG_ACTIVE_WND_SELECTED_FROM, bounds.x, (float)bounds.getMaxY(),
                                             TAB_BG_ACTIVE_WND_SELECTED_TO));
        g2d.setPaint(UIUtil.getGradientPaint(bounds.x, bounds.y, TAB_BG_ACTIVE_WND_UNSELECTED_FROM, bounds.x, (float)bounds.getMaxY(), TAB_BG_ACTIVE_WND_UNSELECTED_TO));
      g2d.setPaint(
        UIUtil.getGradientPaint(bounds.x, bounds.y, TAB_BG_PASSIVE_WND_FROM, bounds.x, (float)bounds.getMaxY(), TAB_BG_PASSIVE_WND_TO));
    g2d.fill(shape);
}
}
