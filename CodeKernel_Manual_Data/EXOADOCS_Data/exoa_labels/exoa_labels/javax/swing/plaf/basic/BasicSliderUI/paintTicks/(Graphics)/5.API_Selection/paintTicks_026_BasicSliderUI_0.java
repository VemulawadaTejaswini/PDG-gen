public class A{
	public void paint(Graphics g, JComponent c){
		recalculateIfInsetsChanged();
		recalculateIfOrientationChanged();
		if (slider.getPaintTrack() && hitClip(g, trackRect))paintTrack(g);
		if (slider.getPaintTicks() && hitClip(g, tickRect))paintTicks(g);
		if (slider.getPaintLabels() && hitClip(g, labelRect))paintLabels(g);
		if (slider.hasFocus() && hitClip(g, focusRect))paintFocus(g);
		if (hitClip(g, thumbRect))paintThumb(g);
	}
}