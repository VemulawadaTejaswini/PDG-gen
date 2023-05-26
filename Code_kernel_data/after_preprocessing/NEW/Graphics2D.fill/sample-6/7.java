//7
public class func{
public void paintLowerThumb(Graphics g){
        if (thumbImage != null) {
            // Draw thumb using image.
            g2d.drawImage(thumbImage, knobBounds.x, knobBounds.y, null);
            
        } else {
            // Create default thumb shape.
            Shape thumbShape = createThumbShape(w - 1, h - 1, false);

            // Draw thumb.
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.translate(knobBounds.x, knobBounds.y);

            g2d.setColor(Color.CYAN);
            g2d.fill(thumbShape);

            g2d.setColor(Color.BLUE);
            g2d.draw(thumbShape);
        }
        g2d.dispose();
}
}
