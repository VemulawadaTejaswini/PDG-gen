public class A{
	public void paint( Graphics g, JComponent c )   {
		//...
		if(slider.getPaintTicks() && clip.intersects(tickRect)) paintTicks(g);
	}
}