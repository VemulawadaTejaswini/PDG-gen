//6
public class func{
public void paintBackground(final Graphics2D g2d,final E popup,final Dimension popupSize){
        final Color backgroundColor = getBackgroundColor ( popup );
        if ( backgroundColor != null )
        {
            g2d.setColor ( backgroundColor );
            g2d.fill ( getBorderShape ( popup, popupSize, true ) );
        }
}
}
