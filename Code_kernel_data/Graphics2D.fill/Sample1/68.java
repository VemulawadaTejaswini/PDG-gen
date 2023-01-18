//67
public class func{
	public void drawSeries(Graphics2D g2,Rectangle2D dataArea,PlotRenderingInfo info,PolarPlot plot,XYDataset dataset,int seriesIndex){
            g2.setComposite(AlphaComposite.getInstance(
                    AlphaComposite.SRC_OVER, 0.5f));
            g2.fill(poly);
            g2.setComposite(savedComposite);
}
}
