public class func{
public void drawHistogram(Graphics2D g2d){
                for (int i = 0; i < histoRect.width; i++) {
                    final int binIndex = (int) Math.floor(minViewBinIndex + i * binsPerPixel);
                    double binHeight = 0.0;
                    if (binIndex >= 0 && binIndex < histogramBins.length) {
                        final double counts = histogramBins[binIndex];
                        binHeight = countsScale * counts;
                    }
                    if (binHeight >= histoRect.height) {
                        binHeight = histoRect.height - 1;
                    }
                    r.setRect(histoRect.x + i, histoRect.y + histoRect.height - 1 - binHeight, 1.0, binHeight);
                    g2d.fill(r);
                }
            g2d.setPaint(oldPaint);
}
}
