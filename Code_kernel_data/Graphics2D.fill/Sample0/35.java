//34
public class func{
	public void onMouseOver(Graphics2D g2d,Rectangle cell,U guess,U gold){
        Font bak = g2d.getFont();
        g2d.setFont(bak.deriveFont(bak.getSize() * 2.0f));
        g2d.setColor(Color.WHITE);
        g2d.fill(cell);
        g2d.setColor(Color.BLACK);
}
}
