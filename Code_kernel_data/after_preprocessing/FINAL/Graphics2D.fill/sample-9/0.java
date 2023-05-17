public class func{
public void drawWeights(Graphics graphics,int pixWidth,int pixHeight){
        for (int i = 0; i < columnMapping.length; i++) {
            g.setColor(getWeightColor(this.dataTable.getColumnWeight(columnMapping[i]), this.maxWeight));
            Rectangle2D weightRect = null;
            if (i == 0) {
                weightRect = new Rectangle2D.Double(currentX, 0.0d, columnDistance / 2.0d, pixHeight);
            } else if (i == columnMapping.length - 1) {
                weightRect = new Rectangle2D.Double(currentX - (columnDistance / 2.0d), 0.0d, columnDistance / 2.0d, pixHeight);                
            } else {
                weightRect = new Rectangle2D.Double(currentX - (columnDistance / 2.0d), 0.0d, columnDistance, pixHeight);
            }
            g.fill(weightRect);
            currentX += columnDistance;
        }
}
}
