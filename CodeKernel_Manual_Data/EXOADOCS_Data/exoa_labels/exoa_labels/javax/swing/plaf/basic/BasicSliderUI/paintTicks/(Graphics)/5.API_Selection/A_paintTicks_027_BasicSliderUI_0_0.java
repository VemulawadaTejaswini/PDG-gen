public class A{
	public void paint(Graphics g, JComponent c){
		//...
		if (slider.getPaintTicks() && hitClip(g, tickRect))paintTicks(g);
	}
}