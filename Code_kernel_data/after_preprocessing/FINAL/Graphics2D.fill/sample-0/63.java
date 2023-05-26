public class func{
public void paint(Graphics2D g,JXMapViewer map,int w,int h){
                    Rectangle green_mask = new Rectangle(st_gp_pt_screen, new Dimension(25,25));
                    g.fill(green_mask);
                    g.setColor(Color.BLACK);
                    g.draw(green_mask);
                    g.dispose();
}
}
