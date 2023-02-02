//61
public class func{
	public void drawGradientShape(Graphics2D graphics2D,Shape shape,boolean highlighted){
            paint = new LinearGradientPaint(startPos, endPos,
                                            new float[]{0.0f, 0.5f, 0.6f, 0.8f, 1.0f},
                                            new Color[]{
                                                    new Color(255, 255, 255, 64),
                                                    new Color(255, 255, 255, 255),
                                                    new Color(255, 255, 255, 255),
                                                    new Color(255, 255, 255, 160),
                                                    new Color(0, 0, 0, 160)
                                            });
            paint = new LinearGradientPaint(startPos, endPos,
                                            new float[]{0.0f, 0.5f, 0.6f, 0.8f, 1.0f},
                                            new Color[]{
                                                    new Color(255, 255, 255, 0),
                                                    new Color(255, 255, 255, 64),
                                                    new Color(255, 255, 255, 64),
                                                    new Color(255, 255, 255, 30),
                                                    new Color(0, 0, 0, 40)
                                            });
        graphics2D.setPaint(paint);
        graphics2D.fill(shape);
}
}
