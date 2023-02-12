public class func{
public void drawNominalLegend(Graphics graphics,DataTable table,int legendColumn,int xOffset,int alpha){
            Color color = getColorProvider().getPointColor((double) i / (double) (numberOfValues - 1), alpha);
            g.setColor(color);
            g.fill(colorBullet);
            g.setColor(Color.black);
            g.draw(colorBullet);
            g.drawString(nominalValue, currentX, 15);
            Rectangle2D stringBounds = LABEL_FONT.getStringBounds(nominalValue, g.getFontRenderContext());
            currentX += stringBounds.getWidth() + 15;
}
}
