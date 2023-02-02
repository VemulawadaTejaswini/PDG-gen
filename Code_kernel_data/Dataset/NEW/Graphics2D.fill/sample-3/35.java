//35
public class func{
public void drawWeightRectangle(Graphics2D newSpace,DataTable dataTable,int column,double maxWeight,int plotterSize){
            weightRect = new Rectangle2D.Double(weightBorder, weightBorder, plotterSize - 2 * weightBorder, plotterSize - 2 * weightBorder);
            newSpace.fill(weightRect);
}
}
