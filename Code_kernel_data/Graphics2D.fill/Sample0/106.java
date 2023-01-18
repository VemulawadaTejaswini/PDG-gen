//105
public class func{
	public void paint(final Graphics2D g,final Rectangle clip){
    if(shape.getLabelsSize()>0) {
      g.setColor(shape.getGridLabelsColour().toAWT());
      g.fill(pathLabels);
    }
    if(vectorTrans!=null)
      endRotation(g, vectorTrans);
}
}
