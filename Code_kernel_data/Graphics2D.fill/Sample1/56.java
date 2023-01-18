//55
public class func{
	public void paintComponent(Graphics g2d){
          g.fillRoundRect((int)dialog.getX(), (int)dialog.getY() - 5, (int)dialog.getWidth(), (int)(5 + dialog.getHeight()), 5, 5);
          g.fill(dialog);
        paintShadowFromParent(g);
}
}
