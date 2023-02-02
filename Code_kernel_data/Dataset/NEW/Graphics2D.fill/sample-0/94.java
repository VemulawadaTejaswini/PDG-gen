//94
public class func{
public void paint(Graphics g,JComponent c){
    Shape contour = SubstanceOutlineUtilities
        .getBaseOutline(
            width,
            height,
            Math.max(
                0,
                2.0f
                    * SubstanceSizeUtils
                        .getClassicButtonCornerRadius(componentFontSize)
                    - borderDelta), null, borderDelta);
    graphics.setColor(SubstanceTextUtilities
        .getTextBackgroundFillColor(this.spinner));
    graphics.fill(contour);
    graphics.dispose();
}
}
