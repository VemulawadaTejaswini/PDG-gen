public class func{
public void drawSliders(Graphics2D g2d){
        for (int i = 0; i < getSliderCount(); i++) {
            double sliderPos = getRelativeSliderPos(getSliderSample(i));
            g2d.translate(sliderPos, 0.0);
            final Color sliderColor = getSliderColor(i);
            g2d.setPaint(sliderColor);
            g2d.fill(sliderShape);
            int gray = (sliderColor.getRed() + sliderColor.getGreen() + sliderColor.getBlue()) / 3;
            g2d.setColor(gray < 128 ? Color.white : Color.black);
            g2d.draw(sliderShape);
            String text = getFormattedValue(getSliderSample(i));
            g2d.setColor(Color.black);
            final AffineTransform oldTransform = g2d.getTransform();
            g2d.transform(AffineTransform.getRotateInstance(Math.PI / 2));
            g2d.drawString(text, 3 + 0.5f * SLIDER_HEIGHT, 0.35f * FONT_SIZE);
            g2d.setTransform(oldTransform);
            g2d.translate(-sliderPos, 0.0);
        }
        g2d.translate(-sliderBaseLineRect.x, -sliderBaseLineRect.y);
}
}
