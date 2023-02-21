public class A{
	public void paint( Graphics g, JComponent c )   {
		ThemeManager.instance().probeAntialiasing(g);
		
		recalculateIfInsetsChanged();
		recalculateIfOrientationChanged();
		Rectangle clip = g.getClipBounds();
		
		if(!clip.intersects(trackRect) && slider.getPaintTrack()) calculateGeometry();
		
		if(slider.getPaintTicks() && clip.intersects(tickRect)) paintTicks(g);
		if(slider.getPaintTrack() && clip.intersects(trackRect)) paintTrack(g);
		if(slider.getPaintLabels() && clip.intersects(labelRect)) paintLabels(g);
		if(slider.hasFocus() && clip.intersects(focusRect)) paintFocus(g);
		if(clip.intersects(thumbRect)) paintThumb(g);
	}
}