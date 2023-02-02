//119
public class func{
	public void drawGeometry(Geometry g,Graphics2D g2,int series,int item,Rectangle2D dataArea,XYPlot plot,ValueAxis domainAxis,ValueAxis rangeAxis){
                g2.fill(new TranslatedLiteShape(g, dataArea, plot, domainAxis, rangeAxis));
}
}
