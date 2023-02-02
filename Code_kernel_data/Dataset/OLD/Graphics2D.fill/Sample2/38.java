//37
public class func{
	public void paint(final Graphics2D g2d,final Rectangle bounds,final E button){
        g2d.setPaint ( enabled ? ( pressed ? pressedBackgroundColor : ( rollover ? rolloverBackgroundColor : backgroundColor ) ) :
                disabledBackgroundColor );
        g2d.fill ( shape );
                enabled ? ( pressed ? pressedBorderColor : ( rollover ? rolloverBorderColor : borderColor ) ) : disabledBorderColor );
}
}
