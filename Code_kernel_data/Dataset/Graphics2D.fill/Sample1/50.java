//49
public class func{
	public void paintUpDownArrowsIcon(Graphics2D graphics){
        graphics.setColor(this.isDarkColorScheme ? WidgetBaseColors.DARK_FONT_COLOR : WidgetBaseColors.LIGHT_FONT_COLOR);
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.translate(upArrowX, upArrowY);
        graphics.fill(createUpArrow(arrowSideLength));
        graphics.translate(0, verticalDistanceBetweenArrows);
        graphics.fill(createDownArrow(arrowSideLength));
}
}
