public class func{
public void applyColorFilter(Image image,Color color,float alpha){
            g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
            g.setColor(color);
            g.fill(rect);
            g.dispose();
}
}
