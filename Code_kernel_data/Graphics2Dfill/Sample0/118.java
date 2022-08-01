//117
public class func{
	public void drawParticles(Vec2[] centers,float radius,ParticleColor[] colors,int count){
      AffineTransform old = g.getTransform();
      g.translate(center.x, center.y);
      g.scale(radius, radius);
      g.setColor(color);
      g.fill(circle);
      g.setTransform(old);
    restoreState(g);
}
}
