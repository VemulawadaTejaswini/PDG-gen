public class func{
public void fillDomainGridBand(Graphics2D g2,XYPlot plot,ValueAxis axis,Rectangle2D dataArea,double start,double end){
        double x1 = axis.valueToJava2D(start, dataArea,
                plot.getDomainAxisEdge());
        double x2 = axis.valueToJava2D(end, dataArea,
                plot.getDomainAxisEdge());
        if (plot.getOrientation() == PlotOrientation.VERTICAL) {
            band = new Rectangle2D.Double(Math.min(x1, x2), dataArea.getMinY(),
                    Math.abs(x2 - x1), dataArea.getWidth());
        }
        else {
            band = new Rectangle2D.Double(dataArea.getMinX(), Math.min(x1, x2),
                    dataArea.getWidth(), Math.abs(x2 - x1));
        }
        Paint paint = plot.getDomainTickBandPaint();
        if (paint != null) {
            g2.setPaint(paint);
            g2.fill(band);
        }
}
}
