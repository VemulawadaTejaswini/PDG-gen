//145
public class func{
public void renderAttributes(Graphics2D graphics,Rectangle trackRectangle,Rectangle visibleRect,List<String> names,List<MouseableRegion> mouseRegions){
                graphics.setColor(AttributeManager.getInstance().getColor(key, attributeValue));
                graphics.fill(rect);
                mouseRegions.add(new MouseableRegion(rect, key, attributeValue));
}
}
