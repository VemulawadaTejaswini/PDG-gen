//0
public class func{
	public void create3LightsYellowImage(final int WIDTH,final int HEIGHT,final boolean IS_ON){
            final Ellipse2D OFF = new Ellipse2D.Double(0.1875 * IMAGE_WIDTH, 0.38 * IMAGE_HEIGHT, 0.625 * IMAGE_WIDTH, 0.25 * IMAGE_HEIGHT);
            G2.setPaint(new RadialGradientPaint(new Point2D.Double(0.5 * IMAGE_WIDTH, 0.585 * IMAGE_HEIGHT), (0.59375f * IMAGE_WIDTH), new float[]{0.0f, 0.98f, 0.99f, 1.0f}, new Color[]{new Color(0.3254901961f, 0.3333333333f, 0f, 1f), new Color(0.0039215686f, 0.0039215686f, 0f, 1f), new Color(0f, 0f, 0f, 1f), new Color(0f, 0f, 0f, 1f)}));
            G2.fill(OFF);
            final Ellipse2D HIGHLIGHT_OFF = new Ellipse2D.Double(0.2625 * IMAGE_WIDTH, 0.385 * IMAGE_HEIGHT, 0.4625 * IMAGE_WIDTH, 0.1 * IMAGE_HEIGHT);
            G2.setPaint(new RadialGradientPaint(new Point2D.Double(0.5 * IMAGE_WIDTH, 0.405 * IMAGE_HEIGHT), (0.2125f * IMAGE_WIDTH), new float[]{0.0f, 0.98f, 1.0f}, new Color[]{new Color(1f, 1f, 1f, 0.2235294118f), new Color(1f, 1f, 1f, 0.0274509804f), new Color(1f, 1f, 1f, 0.0274509804f)}));
            G2.fill(HIGHLIGHT_OFF);
            final Ellipse2D GLOW = new Ellipse2D.Double(0.0 * IMAGE_WIDTH, 0.3 * IMAGE_HEIGHT, 1.0 * IMAGE_WIDTH, 0.4 * IMAGE_HEIGHT);
            G2.setPaint(new RadialGradientPaint(new Point2D.Double(0.5 * IMAGE_WIDTH, 0.5 * IMAGE_HEIGHT), (0.5f * IMAGE_WIDTH), new float[]{0.0f, 0.98f, 0.99f, 1.0f}, new Color[]{new Color(1f, 1f, 0f, 1f), new Color(1f, 1f, 0f, 0f), new Color(1f, 1f, 0f, 0f), new Color(1f, 1f, 0f, 0f)}));
            G2.fill(GLOW);
            final Ellipse2D ON = new Ellipse2D.Double(0.1875 * IMAGE_WIDTH, 0.38 * IMAGE_HEIGHT, 0.625 * IMAGE_WIDTH, 0.25 * IMAGE_HEIGHT);
            G2.setPaint(new RadialGradientPaint(new Point2D.Double(0.5 * IMAGE_WIDTH, 0.585 * IMAGE_HEIGHT), (0.59375f * IMAGE_WIDTH), new float[]{0.0f, 0.98f, 0.99f, 1.0f}, new Color[]{new Color(1f, 1f, 0f, 1f), new Color(0.3333333333f, 0.3411764706f, 0f, 1f), new Color(0.3254901961f, 0.3333333333f, 0f, 1f), new Color(0.3254901961f, 0.3333333333f, 0f, 1f)}));
            G2.fill(ON);
            final Ellipse2D HIGHLIGHT_ON = new Ellipse2D.Double(0.2625 * IMAGE_WIDTH, 0.385 * IMAGE_HEIGHT, 0.4625 * IMAGE_WIDTH, 0.1 * IMAGE_HEIGHT);
            G2.setPaint(new RadialGradientPaint(new Point2D.Double(0.5 * IMAGE_WIDTH, 0.405 * IMAGE_HEIGHT), (0.2125f * IMAGE_WIDTH), new float[]{0.0f, 0.98f, 1.0f}, new Color[]{new Color(1f, 1f, 1f, 0.6745098039f), new Color(1f, 1f, 1f, 0.0862745098f), new Color(1f, 1f, 1f, 0.0862745098f)}));
            G2.fill(HIGHLIGHT_ON);
        final Ellipse2D INNER_SHADOW = new Ellipse2D.Double(0.1875 * IMAGE_WIDTH, 0.38 * IMAGE_HEIGHT, 0.625 * IMAGE_WIDTH, 0.25 * IMAGE_HEIGHT);
        G2.setPaint(new RadialGradientPaint(new Point2D.Double(0.5 * IMAGE_WIDTH, 0.505 * IMAGE_HEIGHT), (0.3125f * IMAGE_WIDTH), new float[]{0.0f, 0.55f, 0.5501f, 0.78f, 0.79f, 1.0f}, new Color[]{new Color(0.0039215686f, 0.0039215686f, 0.0039215686f, 0f), new Color(0f, 0f, 0f, 0f), new Color(0f, 0f, 0f, 0f), new Color(0f, 0f, 0f, 0.1215686275f), new Color(0f, 0f, 0f, 0.1294117647f), new Color(0f, 0f, 0f, 0.4980392157f)}));
        G2.fill(INNER_SHADOW);
        G2.dispose();
}
}
//1
public class func{
	public void paintComponent(Graphics graphics){
        r = new Rectangle(- 5, - 5, 10, 10);
        g.fill(r);
        r = new Rectangle(w / 4 - 5, h / 4 - 5, 10, 10);
        g.fill(r);
        r = new Rectangle(w / 4 - 5, - h / 4 - 5, 10, 10);
        g.fill(r);
        r = new Rectangle(- w / 4 - 5, h / 4 - 5, 10, 10);
        g.fill(r);
        r = new Rectangle(- w / 4 - 5, - h / 4 - 5, 10, 10);
        g.fill(r);
}
}
//2
public class func{
	public void drawHandledRect(Graphics2D graphics,Rectangle2D rect,double handleSize){
    Rectangle2D hr = new Rectangle2D.Double();
    hr.setRect(x - handleSize/2, y - handleSize/2, handleSize, handleSize);
    graphics.fill( hr);
    hr.setRect(x + w - handleSize/2, y - handleSize/2, handleSize, handleSize);
    graphics.fill( hr);
    hr.setRect(x - handleSize/2, y + h - handleSize/2, handleSize, handleSize);
    graphics.fill( hr);
    hr.setRect(x + w - handleSize/2, y + h - handleSize/2, handleSize, handleSize);
    graphics.fill( hr);
}
}
//3
public class func{
	public void paintBackgroundEnabled(Graphics2D g){
    g.setPaint(color14);
    g.fill(path);
    path = decodePath2();
    g.setPaint(decodeGradient5(path));
    g.fill(path);
    path = decodePath3();
    g.setPaint(decodeGradient6(path));
    g.fill(path);
    path = decodePath4();
    g.setPaint(decodeGradient7(path));
    g.fill(path);
    path = decodePath5();
    g.setPaint(decodeGradient8(path));
    g.fill(path);
}
}
//4
public class func{
	public void paintBackgroundDisabled(Graphics2D g){
    g.setPaint(color1);
    g.fill(path);
    path = decodePath2();
    g.setPaint(decodeGradient1(path));
    g.fill(path);
    path = decodePath3();
    g.setPaint(decodeGradient2(path));
    g.fill(path);
    path = decodePath4();
    g.setPaint(decodeGradient3(path));
    g.fill(path);
    path = decodePath5();
    g.setPaint(decodeGradient4(path));
    g.fill(path);
}
}
//5
public class func{
	public void draw(Graphics2D g2,Rectangle2D area){
        if (t > 0.0) {
            rect.setRect(x, y, w, t);
            g2.fill(rect);
        }
        if (b > 0.0) {
            rect.setRect(x, y + h - b, w, b);
            g2.fill(rect);
        }
        if (l > 0.0) {
            rect.setRect(x, y, l, h);
            g2.fill(rect);
        }
        if (r > 0.0) {
            rect.setRect(x + w - r, y, r, h);
            g2.fill(rect);
        }
}
}
//6
public class func{
	public void createRedLightImage(final int WIDTH,final int HEIGHT){
        final int IMAGE_WIDTH = IMAGE.getWidth();
        final int IMAGE_HEIGHT = IMAGE.getHeight();
        final Ellipse2D FRAME = new Ellipse2D.Double(0.10204081632653061 * IMAGE_WIDTH, 0.046762589928057555 * IMAGE_HEIGHT, 0.7959183673469388 * IMAGE_WIDTH, 0.2805755395683453 * IMAGE_HEIGHT);
        G2.setPaint(new LinearGradientPaint(new Point2D.Double(0.5 * IMAGE_WIDTH, 0.046762589928057555 * IMAGE_HEIGHT), new Point2D.Double(0.5 * IMAGE_WIDTH, 0.3273381294964029 * IMAGE_HEIGHT), new float[]{0.0f, 0.05f, 0.1f, 0.17f, 0.27f, 1.0f}, new Color[]{new Color(1f, 1f, 1f, 1f), new Color(0.8f, 0.8f, 0.8f, 1f), new Color(0.6f, 0.6f, 0.6f, 1f), new Color(0.4f, 0.4f, 0.4f, 1f), new Color(0.2f, 0.2f, 0.2f, 1f), new Color(0.0039215686f, 0.0039215686f, 0.0039215686f, 1f)}));
        G2.fill(FRAME);
        final Ellipse2D INNER_CLIP = new Ellipse2D.Double(0.10204081632653061 * IMAGE_WIDTH, 0.0683453237410072 * IMAGE_HEIGHT, 0.7959183673469388 * IMAGE_WIDTH, 0.2589928057553957 * IMAGE_HEIGHT);
        G2.setPaint(new LinearGradientPaint(new Point2D.Double(0.5 * IMAGE_WIDTH, 0.0683453237410072 * IMAGE_HEIGHT), new Point2D.Double(0.5 * IMAGE_WIDTH, 0.3273381294964029 * IMAGE_HEIGHT), new float[]{0.0f, 0.35f, 0.66f, 1.0f}, new Color[]{new Color(0f, 0f, 0f, 1f), new Color(0.0156862745f, 0.0156862745f, 0.0156862745f, 1f), new Color(0f, 0f, 0f, 1f), new Color(0.0039215686f, 0.0039215686f, 0.0039215686f, 1f)}));
        G2.fill(INNER_CLIP);
        final Ellipse2D LIGHT_EFFECT = new Ellipse2D.Double(0.14285714285714285 * IMAGE_WIDTH, 0.06474820143884892 * IMAGE_HEIGHT, 0.7142857142857143 * IMAGE_WIDTH, 0.2517985611510791 * IMAGE_HEIGHT);
        G2.setPaint(new RadialGradientPaint(new Point2D.Double(0.5 * IMAGE_WIDTH, 0.1906474820143885 * IMAGE_HEIGHT), (0.3622448979591837f * IMAGE_WIDTH), new float[]{0.0f, 0.88f, 0.95f, 1.0f}, new Color[]{new Color(0f, 0f, 0f, 1f), new Color(0f, 0f, 0f, 1f), new Color(0.3686274510f, 0.3686274510f, 0.3686274510f, 1f), new Color(0.0039215686f, 0.0039215686f, 0.0039215686f, 1f)}));
        G2.fill(LIGHT_EFFECT);
        final Ellipse2D INNER_SHADOW = new Ellipse2D.Double(0.14285714285714285 * IMAGE_WIDTH, 0.06474820143884892 * IMAGE_HEIGHT, 0.7142857142857143 * IMAGE_WIDTH, 0.2517985611510791 * IMAGE_HEIGHT);
        G2.setPaint(new LinearGradientPaint(new Point2D.Double(0.5 * IMAGE_WIDTH, 0.0683453237410072 * IMAGE_HEIGHT), new Point2D.Double(0.5 * IMAGE_WIDTH, 0.29856115107913667 * IMAGE_HEIGHT), new float[]{0.0f, 1.0f}, new Color[]{new Color(0f, 0f, 0f, 1f), new Color(0.0039215686f, 0.0039215686f, 0.0039215686f, 0f)}));
        G2.fill(INNER_SHADOW);
        G2.dispose();
}
}
//7
public class func{
	public void paintBackgroundMouseOverAndFocused(Graphics2D g){
    path = decodePath2();
    g.setPaint(decodeGradient9(path));
    g.fill(path);
    path = decodePath3();
    g.setPaint(decodeGradient6(path));
    g.fill(path);
    path = decodePath4();
    g.setPaint(decodeGradient10(path));
    g.fill(path);
    path = decodePath5();
    g.setPaint(decodeGradient8(path));
    g.fill(path);
}
}
//8
public class func{
	public void drawComponentSelectionBox(Graphics2D g,LWComponent c){
        if (CHS % 2 == 0) {
            // if box size is even, bias to inside the selection border
            r.height--;
            r.width--;
        }
        ComponentHandle.setFrame(r.x, r.y , CHS, CHS);
        g.fill(ComponentHandle);
        ComponentHandle.setFrame(r.x, r.y + r.height, CHS, CHS);
        g.fill(ComponentHandle);
        ComponentHandle.setFrame(r.x + r.width, r.y, CHS, CHS);
        g.fill(ComponentHandle);
        ComponentHandle.setFrame(r.x + r.width, r.y + r.height, CHS, CHS);
        g.fill(ComponentHandle);
}
}
//9
public class func{
	public void replay(final WmfFile file){
      graph.fill( rect );
      rect.setFrame( rec.x, rec.y - dim.height, rec.width, dim.height );
      graph.fill( rect );
      rect.setFrame( rec.x, rec.y, dim.width, rec.height );
      graph.fill( rect );
      rect.setFrame( rec.width - dim.width, rec.y, dim.width, rec.height );
      graph.fill( rect );
}
}
//10
public class func{
	public void paintImage(Graphics2D g2d,Color color1,Color color2,Color color3){
        Color bcolor = new Color(1f, 1f, 1f, 0f);
        g2d.setBackground(bcolor);
        g2d.setColor(color1);
        g2d.fill(path);
        g2d.clearRect(0, 16, 40, 8);
        g2d.setColor(color2);
        g2d.translate(0, 128);
        g2d.fill(path);
        g2d.clearRect(0, 16, 40, 8);
        g2d.setColor(color3);
        g2d.translate(0, 128);
        g2d.fill(path);
        g2d.clearRect(0, 16, 40, 8);
}
}
//11
public class func{
	public void createTriangles(Color c){
        g2.fill(new Polygon(new int[] {0, a/2, a}, new int[] {0, b/2, 0}, 3));
        g2.fill(new Polygon(new int[] {0, a/2, 0}, new int[] {b/2, b/2, b}, 3));
        g2.fill(new Polygon(new int[] {a, a/2, a}, new int[] {b/2, b/2, b}, 3));
        return new TexturePaint(bi, new Rectangle(0, 0, a, b));
}
}
//12
public class func{
	public void debugVisibleArea(Graphics2D g){
    ellipse.setFrame(camera.getViewCenter().x - 3 * px1,
        camera.getViewCenter().y - 3 * px1, px1 * 6, px1 * 6);
    g.fill(ellipse);
    ellipse.setFrame(metrics.lo.x - 3 * px1, metrics.lo.y - 3 * px1,
        px1 * 6, px1 * 6);
    g.fill(ellipse);
    ellipse.setFrame(metrics.hi.x - 3 * px1, metrics.hi.y - 3 * px1,
        px1 * 6, px1 * 6);
    g.fill(ellipse);
}
}
//13
public class func{
	public void drawModel(Graphics2D g2d){
                    g2d.setColor(new Color(255, 200, 200));
                    g2d.setColor(new Color(200, 200, 255));
                g2d.fill(face.outline);
                g2d.setColor(Color.WHITE);
                g2d.fill(face.outline);
                g2d.setColor(new Color(100, 100, 100));
                g2d.fill(face.outline);
            g2d.setColor(Color.BLACK);
}
}
//14
public class func{
	public void paintBackgroundDisabled(Graphics2D g){
    g.setPaint(color1);
    g.fill(rect);
    rect = decodeRect2();
    g.setPaint(decodeGradient1(rect));
    g.fill(rect);
    rect = decodeRect3();
    g.setPaint(decodeGradient2(rect));
    g.fill(rect);
    rect = decodeRect4();
}
}
//15
public class func{
	public void paintImage(Graphics2D g2d,Color color1,Color color2,Color color3){
        Dimension dimension = getDimension();
        g2d.scale(dimension.getWidth() / 128, dimension.getWidth() / 128);
        draw(path, g2d);
        g2d.setColor(color1);
        g2d.fill(path);
        g2d.setColor(color2);
        g2d.translate(0, 128);
        g2d.fill(path);
        g2d.setColor(color3);
        g2d.translate(0, 128);
        g2d.fill(path);
}
}
//16
public class func{
	public void paintObject(Graphics2D g2,State s,ObjectInstance ob,float cWidth,float cHeight){
      g2.fill(new Rectangle2D.Double(x, y, size, size));
      if (x + size > FrostbiteDomain.gameWidth)
        g2.fill(new Rectangle2D.Double(x - FrostbiteDomain.gameWidth, y, size, size));
      else if (x < 0)
        g2.fill(new Rectangle2D.Double(x + FrostbiteDomain.gameWidth, y, size, size));
}
}
//17
public class func{
	public void paintButtonBackground(Graphics g,AbstractButton b){
          RoundRectangle2D rect = new RoundRectangle2D.Float(0, 0,
              width, height, link.getBtnGroup().getArc(), arc);
          g2.setColor(b.getBackground());
          g2.fill(rect);
          Rectangle2D rectFix = new Rectangle((int) width - arc, 0,
              (int) arc, (int) height);
          g2.fill(rectFix);
          g2.dispose();
}
}
//18
public class func{
	public void paintFocus(Graphics g,AbstractButton b,Rectangle viewRect,Rectangle textRect,Rectangle iconRect){
        g2.setColor(getFocusColor());
        g2.fill(rect);
        Rectangle2D rectFix = new Rectangle((int) width - arc, 0,
            (int) arc, (int) height);
        g2.fill(rectFix);
        g2.dispose();
}
}
//19
public class func{
	public void paint(Graphics2D g2){
                g2.setPaint(textures.createMultiColor(fh.colors));
                g2.fill(area);
                g2.setPaint(textures.create(fh.colors[0]));
                g2.fill(area);
        g2.setPaint(null);
        g2.setComposite(old);
}
}
//20
public class func{
	public void doPaint(Graphics2D g,JComponent c,int width,int height,Object[] extendedCacheKeys){
            g.setColor(SkinColors.SCROLL_THUMB_BORDER_COLOR);
            g.fill(s1);
            Shape s2 = shapeGenerator.createRectangle(1, 1, width - 2, height - 1);
            g.setPaint(getScrollBarThumbPaint(s2));
            g.fill(s2);
}
}
//21
public class func{
	public void createRedOffImage(final int WIDTH,final int HEIGHT){
        final int IMAGE_WIDTH = IMAGE.getWidth();
        final int IMAGE_HEIGHT = IMAGE.getHeight();
        final Ellipse2D LIGHT_OFF = new Ellipse2D.Double(0.17346938775510204 * IMAGE_WIDTH, 0.07553956834532374 * IMAGE_HEIGHT, 0.6530612244897959 * IMAGE_WIDTH, 0.2302158273381295 * IMAGE_HEIGHT);
        G2.setPaint(new RadialGradientPaint(new Point2D.Double(0.5 * IMAGE_WIDTH, 0.1906474820143885 * IMAGE_HEIGHT), (0.32653061224489793f * IMAGE_WIDTH), new float[]{0.0f, 1.0f}, new Color[]{new Color(1f, 0f, 0f, 0.2470588235f), new Color(1f, 0f, 0f, 0.0470588235f)}));
        G2.fill(LIGHT_OFF);
        final Ellipse2D INNER_SHADOW = new Ellipse2D.Double(0.17346938775510204 * IMAGE_WIDTH, 0.07553956834532374 * IMAGE_HEIGHT, 0.6530612244897959 * IMAGE_WIDTH, 0.2302158273381295 * IMAGE_HEIGHT);
        G2.setPaint(new RadialGradientPaint(new Point2D.Double(0.5 * IMAGE_WIDTH, 0.1906474820143885 * IMAGE_HEIGHT), (0.32653061224489793f * IMAGE_WIDTH), new float[]{0.0f, 0.55f, 0.5501f, 0.78f, 0.79f, 1.0f}, new Color[]{new Color(0.0039215686f, 0.0039215686f, 0.0039215686f, 0f), new Color(0f, 0f, 0f, 0f), new Color(0f, 0f, 0f, 0f), new Color(0f, 0f, 0f, 0.1215686275f), new Color(0f, 0f, 0f, 0.1294117647f), new Color(0f, 0f, 0f, 0.4980392157f)}));
        G2.fill(INNER_SHADOW);
}
}
//22
public class func{
	public void paintComponent(final Graphics g){
        final Shape rf2 = new Rectangle2D.Float(0.0f, 0.0f, getWidth(), getHeight());
        final Shape rf1 = new Rectangle2D.Float(3.0f,
                                                getHeight() * 0.5f,
                                                getWidth() - 6,
                                                (float) (getHeight() * 0.5 - 3));
        g2.setPaint(gp2);
        g2.fill(rf2);
        g2.setPaint(gp1);
        g2.fill(rf1);
}
}
//23
public class func{
	public void render(Graphics og){
        Color c = new Color(colour.getRed(), colour.getGreen(), 
                  colour.getBlue());
        g.setColor(c);
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                  RenderingHints.VALUE_ANTIALIAS_ON);
        g.fill(topPoly);
        g.setColor(colour);
        g.fill(bottomPoly);
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                  RenderingHints.VALUE_ANTIALIAS_OFF);          
        g.setColor(Color.black);
        g.draw(strokeRect);
}
}
//24
public class func{
	public void paintForegroundDisabledAndFinished(Graphics2D g){
    rect = decodeRect1();
    g.setPaint(decodeGradient9(rect));
    g.fill(rect);
    rect = decodeRect2();
    g.setPaint(decodeGradient10(rect));
    g.fill(rect);
}
}
//25
public class func{
	public void paintForegroundDisabled(Graphics2D g){
    rect = decodeRect3();
    g.setPaint(decodeGradient9(rect));
    g.fill(rect);
    rect = decodeRect4();
    g.setPaint(decodeGradient10(rect));
    g.fill(rect);
}
}
//26
public class func{
	public void paintBackgroundSelectedAndFocused(Graphics2D g){
    path = decodePath1();
    g.setPaint(decodeGradient10(path));
    g.fill(path);
    path = decodePath10();
    g.setPaint(decodeGradient9(path));
    g.fill(path);
    path = decodePath11();
}
}
//27
public class func{
	public void paintForegroundEnabledAndFinished(Graphics2D g){
    rect = decodeRect1();
    g.setPaint(decodeGradient5(rect));
    g.fill(rect);
    rect = decodeRect2();
    g.setPaint(decodeGradient6(rect));
    g.fill(rect);
}
}
//28
public class func{
	public void paintBackgroundEnabled(Graphics2D g){
    path = decodePath1();
    g.setPaint(decodeGradient1(path));
    g.fill(path);
    path = decodePath2();
    g.setPaint(decodeGradient2(path));
    g.fill(path);
}
}
//29
public class func{
	public void paintBackgroundDisabled(Graphics2D g){
    rect = decodeRect1();
    g.setPaint(decodeGradient3(rect));
    g.fill(rect);
    rect = decodeRect2();
    g.setPaint(decodeGradient4(rect));
    g.fill(rect);
}
}
//30
public class func{
	public void paintBackgroundSelectedAndPressedAndFocused(Graphics2D g){
    path = decodePath12();
    g.setPaint(decodeGradient13(path));
    g.fill(path);
    path = decodePath13();
    g.setPaint(decodeGradient14(path));
    g.fill(path);
    path = decodePath14();
}
}
//31
public class func{
	public void paintBackgroundSelectedAndMouseOver(Graphics2D g){
    path = decodePath8();
    g.setPaint(decodeGradient11(path));
    g.fill(path);
    path = decodePath9();
    g.setPaint(decodeGradient12(path));
    g.fill(path);
}
}
//32
public class func{
	public void paintBackgroundDisabledAndEditable(Graphics2D g){
    g.setPaint(color1);
    g.fill(path);
    path = decodePath2();
    g.setPaint(decodeGradient1(path));
    g.fill(path);
    path = decodePath3();
}
}
//33
public class func{
	public void paintBackgroundDisabledAndEditable(Graphics2D g){
    g.setPaint(color4);
    g.fill(path);
    path = decodePath4();
    g.setPaint(decodeGradient2(path));
    g.fill(path);
}
}
//34
public class func{
	public void paintBackgroundSelectedAndPressed(Graphics2D g){
    path = decodePath8();
    g.setPaint(decodeGradient13(path));
    g.fill(path);
    path = decodePath9();
    g.setPaint(decodeGradient14(path));
    g.fill(path);
}
}
//35
public class func{
	public void paintBackgroundSelectedAndDisabled(Graphics2D g){
    path = decodePath7();
    g.setPaint(decodeGradient7(path));
    g.fill(path);
    path = decodePath2();
    g.setPaint(decodeGradient9(path));
    g.fill(path);
}
}
//36
public class func{
	public void paintBackgroundDisabled(Graphics2D g){
    path = decodePath5();
    g.setPaint(decodeGradient7(path));
    g.fill(path);
    path = decodePath6();
    g.setPaint(decodeGradient8(path));
    g.fill(path);
}
}
//37
public class func{
	public void paintBackgroundEnabledAndMouseOver(Graphics2D g){
    path = decodePath1();
    g.setPaint(decodeGradient3(path));
    g.fill(path);
    path = decodePath2();
    g.setPaint(decodeGradient4(path));
    g.fill(path);
}
}
//38
public class func{
	public void paintBackgroundEnabledAndPressed(Graphics2D g){
    path = decodePath3();
    g.setPaint(decodeGradient5(path));
    g.fill(path);
    path = decodePath4();
    g.setPaint(decodeGradient6(path));
    g.fill(path);
}
}
//39
public class func{
	public void paintForegroundEnabled(Graphics2D g){
    rect = decodeRect3();
    g.setPaint(decodeGradient5(rect));
    g.fill(rect);
    rect = decodeRect4();
    g.setPaint(decodeGradient6(rect));
    g.fill(rect);
}
}
//40
public class func{
	public void paintBackgroundEnabled(Graphics2D g){
    rect = decodeRect1();
    g.setPaint(decodeGradient1(rect));
    g.fill(rect);
    rect = decodeRect2();
    g.setPaint(decodeGradient2(rect));
    g.fill(rect);
}
}
//41
public class func{
	public void createDiagonalUp(Color c){
        g2.fill(new Polygon(new int[] {a/2, a, a}, new int[] {a, a/2, a}, 3));
        g2.fill(new Polygon(new int[] {0, a/2, a, 0}, new int[] {a/2, 0, 0, a}, 4));
        return new TexturePaint(bi, new Rectangle(0, 0, a, a));
}
}
//42
public class func{
	public void begin(Entity e,Object drawState){
        gr.setColor( clr.darker() );
        gr.fill( path );
        gr.scale( 0.9f, 0.9f );
        gr.setColor( clr );
        gr.fill( path );
        gr.setTransform( popped );
}
}
//43
public class func{
	public void print(Graphics g,PageFormat pageFormat,int pageIndex){
    Rectangle2D.Double rect = new Rectangle2D.Double();
    rect.setFrame(0, pageheight - ymargin, pagewidth, ymargin);
    g2d.fill(rect);
    rect.setFrame(pagewidth - xmargin, 0, xmargin, pageheight);
    g2d.fill(rect);
}
}
//44
public class func{
	public void fillLiteShape(Graphics2D g,LiteShape2 shape){
        if(shape.getGeometry() instanceof MultiPolygon && shape.getGeometry().getNumGeometries() > 1) {
            MultiPolygon mp = (MultiPolygon) shape.getGeometry();
            for (int i = 0; i < mp.getNumGeometries(); i++) {
                Polygon p = (Polygon) mp.getGeometryN(i);
                try {
                    g.fill(new LiteShape2(p, null, null, false, false));
                } catch(Exception e) {
                    // should not really happen, but anyways
                    throw new RuntimeException("Unexpected error occurred while rendering a multipolygon", e);
                }
            }
        } else {
            g.fill(shape);
        }
}
}
//45
public class func{
	public void paintComponent(final Graphics g){
        final Ellipse2D circle2 = new Ellipse2D.Double(two.getX() - 6,
                two.getY() - 5, 10, 10);
        g2.draw(circle1);
        g2.fill(circle1);
        g2.draw(circle2);
        g2.fill(circle2);
        final Line2D line = new Line2D.Double(one, two);
}
}
//46
public class func{
	public void paintComponent(Graphics graphics){
      g2.setColor(this.getBackground());
      g2.fill(rect);
      g2.setColor(this.getBackground());
      g2.fill(rect);
    g2.dispose();
}
}
//47
public class func{
	public void drawPoints(Graphics2D g,Iterable<Point> points){
        g.setColor(Color.BLUE);
        g.fill(onCurves);
        g.setColor(Color.RED);
        g.fill(offCurves);
}
}
//48
public class func{
	public void drawBaggle(Graphics2D g,BuggleWorldCell cell){
      g.fill(new Arc2D.Double(padx+ox+pad, pady+oy+pad, d, d, 0, 360, Arc2D.CHORD));
      g.setColor(getCellColor(cell.getX(), cell.getY()));
      g.fill(new Arc2D.Double(padx+ox+pad2, pady+oy+pad2, d2, d2, 0, 360, Arc2D.CHORD));
}
}
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
//50
public class func{
	public void paintBackground(Graphics g,JComponent component){
      final RoundRectangle2D rectangleRounded = new RoundRectangle2D.Double( 0, 0, getWidth(), getHeight() * 2, 8, 8 );
      g2D.fill( rectangleRounded );
      final RoundRectangle2D rectangleRounded = new RoundRectangle2D.Double( 0, 0, getWidth() * 2, getHeight(), 8, 8 );
      g2D.fill( rectangleRounded );
    g2D.dispose();
}
}
//51
public class func{
	public void paintColorBlob(final Graphics2D g,final Color color){
            g.setColor(Color.white);
            g.fill(BlobShape);
            g.setColor(color);
            g.fill(BlobShape);
            g.setColor(Color.gray);
            g.draw(BlobShape);
}
}
//52
public class func{
	public void drawVertexRectangles(Graphics2D g2d){
      g2d.fill(new Rectangle2D.Double(v0.x - vertexDrawSize / scale,
          v0.y - vertexDrawSize / scale, vertexDrawSize * 2 / scale,
          vertexDrawSize * 2 / scale));
      g2d.fill(new Rectangle2D.Double(v1.x - vertexDrawSize / scale,
          v1.y - vertexDrawSize / scale, vertexDrawSize * 2 / scale,
          vertexDrawSize * 2 / scale));
}
}
//53
public class func{
	public void paintDecoration(final Graphics2D g,final Graphics2D gstroke,final double x0,final double y0,final double x1,final double y1,double dx,double dy,double dxn,double dyn){
    shape.addPoint((int)x1, (int)y1);
    g.fill(shape);
}
}
//54
public class func{
	public void paintComponent(Graphics g){
      UIUtil.drawLine(g2, (int)line.getX1(), (int)line.getY1(), (int)line.getX2(), (int)line.getY2());
      final Shape arrow = LineEndDecorator.getArrowShape(line, line.getP2());
      g2.fill(arrow);
      g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, old);
}
}
//55
public class func{
	public void paintComponent(Graphics g2d){
          g.fillRoundRect((int)dialog.getX(), (int)dialog.getY() - 5, (int)dialog.getWidth(), (int)(5 + dialog.getHeight()), 5, 5);
          g.fill(dialog);
        paintShadowFromParent(g);
}
}
//56
public class func{
	public void paint(Graphics2D g2){
            g2.fill(transformArea(ra, entry.getKey()));
                    new ImmutablePoint((int)ra.getBounds2D().getCenterX(), (int)ra.getBounds2D().getCenterY()), Color.WHITE, null);
}
}
//57
public class func{
	public void paintArrowhead(Graphics2D g2D,Point p1,Point p2,Double arrowheadPlacement2,Color casingColor,Color fillColor){
        head = AffineTransform.getRotateInstance(angle).createTransformedShape(head);
        head = AffineTransform.getTranslateInstance(pTip.x, pTip.y).createTransformedShape(head);
        g2D.fill(head);
}
}
//58
public class func{
	public void paintArrowhead(Graphics2D g2D,Point p1,Point p2,Double arrowheadPlacement2,Color casingColor,Color fillColor){
        headCore = AffineTransform.getRotateInstance(angle).createTransformedShape(headCore);
        headCore = AffineTransform.getTranslateInstance(pTip.x, pTip.y).createTransformedShape(headCore);
        g2D.fill(headCore);
}
}
//59
public class func{
	public void paintChannel(final Channel channel,final Graphics2D g,final MapView mv){
        double angle = angleFromXAxis(fromPoint, toPoint);
        head = AffineTransform.getRotateInstance(angle).createTransformedShape(head);
        head = AffineTransform.getTranslateInstance(toPoint.x, toPoint.y).createTransformedShape(head);
        g.fill(head);
}
}
//60
public class func{
	public void paintComponent(Graphics g){
      for (Point2D p: points) {
        r.setRect(p.getX(), p.getY(), 1, 1);
        g2.fill(r);
      }
}
}
//61
public class func{
	public void drawArrowHead(final Graphics2D aCanvas,final int aXpos,final int aYpos,final int aDirection,final int aArrowWidth,final int aArrowHeight){
    final Polygon arrowHead = new Polygon();
    arrowHead.addPoint( x1, y2 );
    aCanvas.fill( arrowHead );
}
}
//62
public class func{
	public void replay(final WmfFile file){
        g2.fill( getScaledBounds() );
}
}
//63
public class func{
	public void replay(final WmfFile file){
        g2.fill( getScaledBounds() );
}
}
//64
public class func{
	public void replay(final WmfFile file){
        g2.fill( getScaledBounds() );
}
}
//65
public class func{
	public void draw(Graphics2D g,boolean showAnchors){
         for (int i = 0; i < anchors.length; i++) {
            g.fill(anchors[i]);
         }
}
}
//66
public class func{
	public void fillPolyPolygon(Graphics2D g2d,List pols){
            for (int i = 0; i < pols.size(); i++) {
                Polygon2D pol = (Polygon2D)(pols.get(i));
                path.append(pol, false);
            }
            g2d.fill(path);
}
}
//67
public class func{
	public void drawSeries(Graphics2D g2,Rectangle2D dataArea,PlotRenderingInfo info,PolarPlot plot,XYDataset dataset,int seriesIndex){
            g2.setComposite(AlphaComposite.getInstance(
                    AlphaComposite.SRC_OVER, 0.5f));
            g2.fill(poly);
            g2.setComposite(savedComposite);
}
}
//68
public class func{
	public void yellowHighlight(Image image,Collection<Rectangle> boxes,float outsetFactor){
        box.grow((int) (box.getHeight() * outsetFactor),
            (int) (box.getWidth() * outsetFactor));
      g2d.fill(box);
    g2d.setComposite(originalComposite);
}
}
//69
public class func{
	public void createDiagonalCheck(Color c){
        g2.fill(new Polygon(new int[] {a/2, a, a/2, 0}, new int[] {0, a/2, a, a/2}, 4));
        return new TexturePaint(bi, new Rectangle(0, 0, a, a));
}
}
//70
public class func{
	public void paintImage(Graphics2D g2d,Color color){
        Color bcolor = new Color(1f, 1f, 1f, 0f);
        g2d.setBackground(bcolor);
        g2d.fill(path);
        g2d.clearRect(0, 16, 40, 8);
}
}
//71
public class func{
	public void runTest(Object ctx,int numReps){
                ellipse.setFrame(x, y, size, size);
                g2d.fill(ellipse);
}
}
//72
public class func{
	public void fillCircle(final Ellipse2D ell,final IPoint pt,final double width,final Graphics2D g){
    ell.setFrame(pt.getX()-width/2., pt.getY()-width/2., width, width);
    g.fill(ell);
}
}
//73
public class func{
	public void paint(Graphics2D g2d){
        Area area2 = new Area(outSquare);
        area2.subtract(new Area(midSquare));
        g2d.fill(area2);
}
}
//74
public class func{
	public void paint(Graphics2D g2d){
        Area area = new Area(midSquare);
        area.subtract(new Area(inSquare));
        g2d.fill(area);
}
}
//75
public class func{
	public void paintComponent(Graphics g){
        g2.fill(g.getClipBounds());
        paintGrid(g2);
        AffineTransform originalTransform = g2.getTransform();
}
}
//76
public class func{
	public void paintComponent(Graphics g){
        g2.fill(g.getClipBounds());
        AffineTransform originalTransform = g2.getTransform();
}
}
//77
public class func{
	public void paint(Component c,Graphics2D g){
    g.setStroke(PainterUtils.DEFAULT_STROKE);
    g.fill(dot);
}
}
//78
public class func{
	public void renderElement(StyleGroup group,Graphics2D g,Camera camera,GraphicElement element){
    shape.setFrame(pos.x - w2, pos.y - h2, width, height);
    g.fill(shape);
    renderText(group, g, camera, element);
}
}
//79
public class func{
	public void drawTab(Graphics g,int left,int right,boolean leftNotch,boolean rightNotch){
    g2.fill(Toolkit.createRoundRect(left, TAB_TOP,
                                    right, TAB_BOTTOM,
                                    leftNotch ? CURVE_RADIUS : 0,
                                    rightNotch ? CURVE_RADIUS : 0,
                                    0, 0));
}
}
//80
public class func{
	public void paint(Component c,Graphics2D g2){
        g2.setStroke(DEFAULT_STROKE);
        g2.fill(dot);
}
}
//81
public class func{
	public void renderElement(StyleGroup group,Graphics2D g,Camera camera,GraphicElement element){
    shape.setFrame(node.x - w2, node.y - h2, width, height);
    g.fill(shape);
    renderText(group, g, camera, element);
}
}
//82
public class func{
	public void drawTab(Graphics g,int left,int right,boolean leftNotch,boolean rightNotch){
      g2.fill(Toolkit.createRoundRect(left, TAB_TOP, right, TAB_BOTTOM, 0, 0,
                                      rightNotch ? CURVE_RADIUS : 0,
                                      leftNotch ? CURVE_RADIUS : 0));
}
}
//83
public class func{
	public void drawV(boolean immediate){
    gV.setBackground(Color.white);
    gV.fill(gV.getClipBounds());
    renderGrid.renderVertView(gV, atI);
}
}
//84
public class func{
	public void draw(Graphics2D g){
            g.fill(getBounds().getRectangle2D());
        g.clip(getBounds().getRectangle2D());
}
}
//85
public class func{
	public void fill(Graphics2D g2d){
        final Shape old = g2d.getClip();
        g2d.clip(clip);
        g2d.fill(area);
        g2d.setClip(old);
}
}
//86
public class func{
	public void drawPoint(Graphics2D g2,double x,double y,double r,Color color,boolean hasBorder){
    c.setFrame(x - r, y - r, w, w);
    g2.fill(c);
}
}
//87
public class func{
	public void renderMap(@Nonnull Map map,@Nonnull Rectangle viewport,int level,@Nonnull Graphics2D g){
                                renderTile(xdisp, ydisp, g, t.getImg()[0]);
                                renderOverlay(g, mt);
                                    g.fill(getTilePolygon());
        g.setTransform(transform);
}
}
//88
public class func{
	public void paintBorder(final Component c,Graphics g,final int x,final int y,final int width,final int height){
            ((Graphics2D)g).fill(getCapsLockShape());
}
}
//89
public class func{
	public void paintBackground(Graphics g,Dimension size,Color background,int state){
        ((Graphics2D)g).fill(getShape(size));
}
}
//90
public class func{
	public void paintBackground(Graphics g,Dimension size,Color background,int state){
          ((Graphics2D)g).fill(getShape(size));
}
}
//91
public class func{
	public void paintBackground(Graphics g,Dimension size,Color background,int state){
          ((Graphics2D)g).fill(getShape(size));
}
}
//92
public class func{
	public void paint(Graphics g,JComponent c){
    ((Graphics2D)g).fill(path);
}
}
//93
public class func{
	public void drawFill(Graphics2D g){
        g.fill(getPath());
}
}
//94
public class func{
	public void drawFill(Graphics2D g){
    g.fill(getTransformedShape());
}
}
//95
public class func{
	public void paint(Graphics g){
            Shape shape = perspectiveTransformer.perspectiveTransform(rectangle);
            g2d.fill(shape);
}
}
//96
public class func{
	public void drawFill(Graphics2D g){
            g.fill(ellipse);
}
}
//97
public class func{
	public void paintImage(Graphics2D graphics2d,Color color){
        GeneralPath path = new GeneralPath();
        draw(path);
        g2d.fill(path);
}
}
//98
public class func{
	public void drawFill(Graphics2D g){
        g.fill(bounds);
}
}
//99
public class func{
	public void draw(Graphics2D graphics,Paint_Delegate paintDelegate){
                                graphics.fill(arc);
}
}
//100
public class func{
	public void fill(Graphics2D g2d){
            g2d.fill(getShape());
}
}
//101
public class func{
	public void drawFill(Graphics2D g){
        double grow = AttributeKeys.getPerpendicularFillGrowth(this);
        Geom.grow(r, grow, grow);
        g.fill(r);
}
}
//102
public class func{
	public void drawPreview(Graphics2D g2d,Dimension dimension,MapView mv){
        g2d.fill(shape);
}
}
//103
public class func{
	public void paintAreaHighlight(Graphics2D g2){
            g2.fill(transformArea(area, selectedFeaturePointer.getPosition()));
}
}
//104
public class func{
	public void draw(Graphics2D graphics,Paint_Delegate paintDelegate){
                            graphics.fill(shape);
}
}
//105
public class func{
	public void paintComponent(Graphics g){
      ((Graphics2D) g).fill(rect);
}
}
//106
public class func{
	public void paintShape(Graphics2D g,AffineTransform t){
            g.fill (createPoly (t));
}
}
//107
public class func{
	public void paintLastGhost(Graphics2D g2d){
    g2d.fill(path.getShape());
}
}
//108
public class func{
	public void paintStrips(Graphics2D g,List<ATEAnalysisItem> items){
            g.fill(composeIndicatorRectangle(item.line, 0));
}
}
//109
public class func{
	public void processFillShape(Graphics2D g){
    g.fill(readShape());
}
}
//110
public class func{
	public void drawRectangle(Graphics2D g,Color fill,Color stroke){
                g.fill(r);
}
}
//111
public class func{
	public void replay(final WmfFile file){
      graph.fill( rec );
}
}
//112
public class func{
	public void paintComponent(final Graphics g){
        g2d.fill ( getProgressShape () );
        GraphicsUtils.restoreAntialias ( g2d, aa );
}
}
//113
public class func{
	public void drawRect(Graphics2D g,int color,double w1,double h1,double w2,double h2,boolean useLatlon){
    double hmin = Math.min(h1, h2);
    double height = Math.abs(h1 - h2);
    rect.setRect(wmin, hmin, width, height);
    g.fill(rect);
}
}
//114
public class func{
	public void paint(Graphics g,Divider divider){
                g2d.fill(divider.getBounds());
}
}
//115
public class func{
	public void closePath(Graphics2D g,Path2D.Double path,double previousX,Rectangle2D bounds,double yTopMargin){
      double yBottomOfArea = bounds.getY() + bounds.getHeight() - yTopMargin;
      path.lineTo(previousX, yBottomOfArea);
      path.closePath();
      g.fill(path);
}
}
//116
public class func{
	public void drawFill(Graphics2D g){
            g.fill(r);
}
}
//117
public class func{
	public void paintBorder(final Graphics g,final int x,final int y,final int w,final int h){
            ((Graphics2D)g).fill(area);
}
}
//118
public class func{
	public void paintIcon(Component c,Graphics g,int x,int y){
                    g2.fill(path);
}
}
//119
public class func{
	public void drawGeometry(Geometry g,Graphics2D g2,int series,int item,Rectangle2D dataArea,XYPlot plot,ValueAxis domainAxis,ValueAxis rangeAxis){
                g2.fill(new TranslatedLiteShape(g, dataArea, plot, domainAxis, rangeAxis));
}
}
//120
public class func{
	public void draw(Graphics2D g,boolean showAnchors){
         g.fill(shape);
}
}
//121
public class func{
	public void paint(Graphics g){
            g2d.fill(lens);
}
}
//122
public class func{
	public void drawFill(Graphics2D g){
            g.fill(getPath());
}
}
//123
public class func{
	public void paintComponent(Graphics g){
    ((Graphics2D)g).fill(arrow);
}
}
//124
public class func{
	public void main(String[] args){
    g.fill(stroke.createStrokedShape(shape));
}
}
//125
public class func{
	public void paintComponent(Graphics g){
                g2.fill(noteRect);
}
}
//126
public class func{
	public void replay(final WmfFile file){
      graph.fill( genPath );
}
}
//127
public class func{
	public void replay(final WmfFile file){
      graph.fill( arc );
}
}
//128
public class func{
	public void replay(final WmfFile file){
      graph.fill( ellipse );
}
}
//129
public class func{
	public void paint(Graphics g){
                ((Graphics2D)g).fill(arrowShape);
}
}
//130
public class func{
	public void drawFill(Graphics2D g){
            g.fill(r);
}
}
//131
public class func{
	public void drawFill(Graphics2D g){
            g.fill(roundrect.getBounds2D());
}
}
//132
public class func{
	public void drawFill(Graphics2D g){
            g.fill(roundrect);
}
}
//133
public class func{
	public void fillPolyPolygon(Graphics2D g2d,List pols){
            g2d.fill((Polygon2D)(pols.get(0)));
}
}
//134
public class func{
	public void drawSpline(Graphics g,float[] xpoints,float[] ypoints,int npoints,boolean closed,boolean fill,boolean isActiveOverlayRoi){
        g2d.fill(path);
}
}
//135
public class func{
	public void paintComponent(final Graphics g){
        g2.fill(getArrow(this.type));
}
}
//136
public class func{
	public void fillPoint(Graphics2D g,Point2D p){
        Shape shape = getPointShape(p);
        g.fill(shape);
}
}
//137
public class func{
	public void paint(Graphics g){
                ((Graphics2D) g).fill(_arrowShape);
}
}
//138
public class func{
	public void paintComponent(Graphics g){
                        g2d.rotate(Math.PI+Math.PI/2,this.getWidth()/2.0,this.getHeight()/2.0);
                    g2d.fill(shape);
}
}
//139
public class func{
	public void paintComponent(Graphics g){
        g2d.fill(area);
}
}
//140
public class func{
	public void paintComponent(Graphics g){
        g2.fill(getBounds());
}
}
//141
public class func{
	public void replay(final WmfFile file){
      graph.fill( polygon );
}
}
//142
public class func{
	public void paintOutputPart(DisplayedGem displayedGem,Graphics2D g2d){
        Polygon bindPoint = displayedGem.getDisplayedGemShape().getOutputShape();
        g2d.fill(bindPoint);
}
}
//143
public class func{
	public void drawToken(DBInputTextTokenInfo info,Graphics2D g,Color c,boolean fill){
                    g.fill(gp);
}
}
//144
public class func{
	public void paint(Graphics g){
        g2.fill(resize);
}
}
//145
public class func{
	public void fillSelectionAndBorder(Graphics2D g,JBTabsImpl.ShapeInfo selectedShape,Color tabColor,int x,int y,int height){
    g.fill(selectedShape.fillPath.getShape());
}
}
//146
public class func{
	public void paint(Graphics g){
        g2.fill(reformThumbShape(this.getWidth(), this.getHeight(), (int) viewExtent));
}
}
//147
public class func{
	public void drawFill(Graphics2D g){
                g.fill(path);
}
}
//148
public class func{
	public void drawCoordinate(Coordinate c,Graphics2D g2,int series,int item,Rectangle2D dataArea,XYPlot plot,ValueAxis domainAxis,ValueAxis rangeAxis){
            g2.fill(shape);
}
}
//149
public class func{
	public void paint(Graphics g,HandleGesture gesture){
            ((Graphics2D) g).fill(curve);
}
}
//150
public class func{
	public void replay(final WmfFile file){
      graph.fill( shape );
}
}
//151
public class func{
	public void replay(final WmfFile file){
      graph.fill( rect );
}
}
//152
public class func{
	public void drawFill(Graphics2D g){
        g.fill(getTextShape());
}
}
//153
public class func{
	public void draw(Graphics2D graphics,float x,float y){
                graphics.fill(fShape);
}
}
//154
public class func{
	public void drawFill(Graphics2D g){
        g.fill(ellipse);
}
}
//155
public class func{
	public void replay(final WmfFile file){
    final MfLogRegion reg = file.getRegionObject( getRegion() );
    g2.fill( reg.getBounds() );
}
}
//156
public class func{
	public void renderArrow(StyleGroup group,Graphics2D g,Camera camera,GraphicEdge edge){
        shape.reset();
        shape.moveTo(x, y);
        shape.lineTo(x - theDirection.data[0] - perp.data[0], y
            - theDirection.data[1] - perp.data[1]);
        shape.closePath();
        g.fill(shape);
}
}
