public class A{
	public void drawGlyphVector(GlyphVector g, float x, float y) {
		translate(x, y);
		for (int i=0; i < g.getNumGlyphs(); i++)fill(g.getGlyphOutline(i));
		translate(-x, -y);
	}
}