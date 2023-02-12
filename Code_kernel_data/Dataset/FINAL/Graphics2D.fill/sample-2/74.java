public class func{
public void draw(final Element element,final Graphics2D graphics2D){
      final Color overlapErrorColor = WorkspaceSettings.getInstance().getOverlapErrorColor();
        new Color( overlapErrorColor.getRed(), overlapErrorColor.getGreen(), overlapErrorColor.getBlue(), 64 );
      graphics2D.setPaint( highLight );
      graphics2D.fill( elementBounds );
}
}
