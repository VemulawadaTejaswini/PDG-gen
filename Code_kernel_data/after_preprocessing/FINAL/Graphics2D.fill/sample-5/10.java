public class func{
public void drawFeature(Graphics2D g2d,int start,int end,int ypos,Color colour,Color borderColor,float size,boolean selected,float selected_size,int fontHeight){
    if(colour == null)
      colour = Color.BLACK;
    GradientPaint gp = new GradientPaint(start, ypos, 
        colour,
        start, ypos+( (fontHeight/2) * size ), 
        Color.white, true);
    g2d.setPaint(gp); 
    g2d.fill(e);
}
}
