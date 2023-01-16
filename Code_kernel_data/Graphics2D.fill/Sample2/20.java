//19
public class func{
	public void paintThumb(final Graphics g){
                g2d.setPaint ( new GradientPaint ( 0, thumbRect.y, thumbBgTop, 0, thumbRect.y + thumbRect.height, thumbBgBottom ) );
                g2d.setPaint ( new GradientPaint ( thumbRect.x, 0, thumbBgTop, thumbRect.x + thumbRect.width, 0, thumbBgBottom ) );
            g2d.fill ( ts );
}
}
