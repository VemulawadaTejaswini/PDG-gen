public class func{
public void paintComponent(Graphics g){
    g2d.setPaint(new RadialGradientPaint(this.getWidth() / 2 - RADIUS / 4,
        this.ballY - RADIUS / 5, RADIUS + RADIUS / 4, new float[] {
            0.0f, 1.0f }, new Color[] { Color.green,
            Color.green.darker().darker() }));
    g2d.fill(shape);
}
}
