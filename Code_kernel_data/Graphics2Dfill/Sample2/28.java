//27
public class func{
	public void paintComponent(final Graphics g){
            g2d.setPaint ( new Color ( 242, 242, 242 ) );
            g2d.fill ( border );
            g2d.setStroke ( new BasicStroke ( 2, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 1f,
                    new float[]{ Math.max ( 5f, Math.min ( Math.max ( width, height ) / 6, 10f ) ), 8f }, 4f ) );
            g2d.setPaint ( Color.LIGHT_GRAY );
            g2d.draw ( border );
        GraphicsUtils.restoreAntialias ( g2d, aa );
}
}
