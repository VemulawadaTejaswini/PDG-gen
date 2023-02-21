public class A{
	public void paint(Graphics2D gx){
		if (m_fillColor != null) {
			Color c = gx.getColor();
			gx.setColor(m_fillColor);
			gx.fill(m_shape);
			gx.setColor(c);
		}
		gx.draw(m_shape);
		Rectangle2D bounds = m_shape.getBounds2D();
		if (m_name!=null && m_name.length()>0) {
			if (m_text == null) {
				m_text = new TextLayout(m_name,gx.getFont(),gx.getFontRenderContext());
			}
			m_text.draw(gx,(float) bounds.getCenterX(),(float) bounds.getCenterY());
		}
	}
}