public class func{
public void paintSurveyColumn(Graphics graphics,int column,float currentX,float columnDistance){
        if (dataTable.isSupportingColumnWeights()) {
            Color weightColor = getWeightColor(dataTable.getColumnWeight(column), this.maxWeight);
            Rectangle2D weightRect = new Rectangle2D.Double(0, MARGIN, columnDistance, this.dataTable.getNumberOfRows());
            g.setColor(weightColor);
            g.fill(weightRect);
        }
    if (this.dataTable.getNumberOfColumns() <= 10)
      g.drawString(this.dataTable.getColumnName(column), 0, MARGIN - 3);
    g.translate(0, MARGIN);
    g.setColor(GRID_COLOR);
}
}
