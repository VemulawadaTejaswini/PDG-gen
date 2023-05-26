//144
public class func{
public void renderAttributeBand(Graphics2D g2D,Rectangle bandRectangle,Rectangle visibleRectangle,List<String> attributeNames,List<String> sampleList,List<MouseableRegion> mouseRegions){
                        g2D.setColor(AttributeManager.getInstance().getColor(key, attributeValue));
                        g2D.fill(rect);
                        mouseRegions.add(new MouseableRegion(rect, key, attributeValue));
}
}
