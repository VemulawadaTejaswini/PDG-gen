public class A{
	public void paint(Graphics g, JComponent c){
		leftToRightCache = slider.getComponentOrientation()!= ComponentOrientation.RIGHT_TO_LEFT;
		calculateGeometry();
		
		if (slider.getPaintTrack())paintTrack(g);
		if (slider.getPaintTicks())paintTicks(g);
		if (slider.getPaintLabels())paintLabels(g);

		paintThumb(g);
	}
}