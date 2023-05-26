public class func{
public void yellowHighlight(Image image,Collection<Rectangle> boxes,float outsetFactor){
        box.grow((int) (box.getHeight() * outsetFactor),
            (int) (box.getWidth() * outsetFactor));
      g2d.fill(box);
    g2d.setComposite(originalComposite);
}
}
