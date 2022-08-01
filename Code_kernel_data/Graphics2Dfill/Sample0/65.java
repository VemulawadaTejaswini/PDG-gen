//64
public class func{
	public void paint(Graphics2D g,JXMapViewer map,int w,int h){
                        Rectangle yellow_mask = new Rectangle(st_gp_pt_screen, new Dimension(25,25));
                        g.fill(yellow_mask);
                        g.setColor(Color.BLACK);
                        g.draw(yellow_mask);
                    g.dispose();
}
}
