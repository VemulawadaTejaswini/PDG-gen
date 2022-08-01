//2
public class func{
	public void drawHandledRect(Graphics2D graphics,Rectangle2D rect,double handleSize){
    Rectangle2D hr = new Rectangle2D.Double();
    hr.setRect(x - handleSize/2, y - handleSize/2, handleSize, handleSize);
    graphics.fill( hr);
    hr.setRect(x + w - handleSize/2, y - handleSize/2, handleSize, handleSize);
    graphics.fill( hr);
    hr.setRect(x - handleSize/2, y + h - handleSize/2, handleSize, handleSize);
    graphics.fill( hr);
    hr.setRect(x + w - handleSize/2, y + h - handleSize/2, handleSize, handleSize);
    graphics.fill( hr);
}
}
