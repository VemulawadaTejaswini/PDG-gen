public class A{
	public void paint(SynthContext context, Graphics g) {
		recalculateIfInsetsChanged();
		recalculateIfOrientationChanged();
		Rectangle clip = g.getClipBounds();
		
		if (paintValue) {
			FontMetrics fm = SwingUtilities2.getFontMetrics(slider, g);
			valueRect.x = (thumbRect.x + (thumbRect.width / 2)) -context.getStyle().getGraphicsUtils(context).computeStringWidth(context, g.getFont(), fm,"" + slider.getValue()) / 2;
			g.setColor(context.getStyle().getColor(context, ColorType.TEXT_FOREGROUND));
			context.getStyle().getGraphicsUtils(context).paintText(context, g, "" + slider.getValue(), valueRect.x,valueRect.y, -1);
		}
		
		SynthContext subcontext = getContext(slider, Region.SLIDER_TRACK);
		paintTrack(subcontext, g, trackRect);
		subcontext.dispose();
		
		subcontext = getContext(slider, Region.SLIDER_THUMB);
		paintThumb(subcontext, g, thumbRect);
		subcontext.dispose();
		
		if (slider.getPaintTicks() && clip.intersects(tickRect)) {
			paintTicks(g);
		}
		
		if (slider.getPaintLabels() && clip.intersects(labelRect)) {
			paintLabels(g);
		}
	}
}