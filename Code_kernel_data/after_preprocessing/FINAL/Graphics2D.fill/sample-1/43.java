public class func{
public void print(Graphics g,PageFormat pageFormat,int pageIndex){
    Rectangle2D.Double rect = new Rectangle2D.Double();
    rect.setFrame(0, pageheight - ymargin, pagewidth, ymargin);
    g2d.fill(rect);
    rect.setFrame(pagewidth - xmargin, 0, xmargin, pageheight);
    g2d.fill(rect);
}
}
