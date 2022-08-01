//0
public class func{
	public void paint(Graphics g){
                g2.setColor(new Color(255, 255, 255, 100));
                g2.fill(triangle);
                g2.setColor(Color.BLACK);
                g2.draw(triangle);
}
}
//1
public class func{
	public void drawPath(final boolean isCurrent,Graphics2D g2d,final GeneralPath gp,final float offsetX){
            g2d.setColor(new Color(255, 200, 200, 30));
            g2d.setColor(new Color(255, 255, 255, 30));
        g2d.fill(gp);
}
}
//2
public class func{
	public void paintControlPoint(Graphics2D g2,Point2D control){
            g2.setColor(new Color(1.0f, 1.0f, 1.0f, 1.0f));
            g2.setColor(new Color(0.8f, 0.8f, 0.8f, 0.6f));
        g2.fill(inner);
}
}
//3
public class func{
	public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.translate(startX, startY);
        g2d.rotate(Math.atan2(ey, ex));
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setComposite(composite);
        g2d.setColor(this.color);
        g2d.fill(arrow);
        g2d.setColor(Color.BLACK);
        g2d.draw(arrow);
}
}
//4
public class func{
	public void drawTextBox(Graphics2D g2D,String text,int x0,int y0,Color color){
        final FontMetrics fontMetrics = g2D.getFontMetrics();
        final Rectangle2D textBounds = fontMetrics.getStringBounds(text, g2D);
        x0 -= textBounds.getWidth() / 2;
        textBounds.setRect(textBounds.getX() - 1, textBounds.getY(), textBounds.getWidth(), textBounds.getHeight());
        Rectangle2D.Double r = new Rectangle2D.Double(x0 + textBounds.getX() - 2.0,
                                                      y0 + textBounds.getY() - 2.0,
                                                      textBounds.getWidth() + 4.0,
                                                      textBounds.getHeight() + 4.0);
        if (r.getMaxX() > getWidth()) {
            r.setRect(getWidth() - r.getWidth(), r.getY(), r.getWidth(), r.getHeight());
        }
        if (r.getMinX() < 0) {
            r.setRect(0, r.getY(), r.getWidth(), r.getHeight());
        }
        if (r.getMaxY() > getHeight()) {
            r.setRect(r.getX(), getHeight() - r.getHeight(), r.getWidth(), r.getHeight());
        }
        if (r.getMinY() < 0) {
            r.setRect(r.getX(), 0, r.getWidth(), r.getHeight());
        }
        g2D.setColor(color);
        g2D.fill(r);
        g2D.setColor(Color.black);
        g2D.draw(r);
        g2D.drawString(text, x0, y0);
}
}
//5
public class func{
	public void paintLowerThumb(Graphics g){
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.translate(knobBounds.x, knobBounds.y);
            g2d.setColor(Color.CYAN);
            g2d.fill(thumbShape);
            g2d.setColor(Color.BLUE);
            g2d.draw(thumbShape);
            g2d.dispose();
}
}
//6
public class func{
	public void paintComponent(Graphics g){
            for (int i = 0; i < ticker.length; i++) {
                int channel = 224 - (128 / (i + 1));
                g2.setColor(new Color(channel, channel, channel, 100));
                g2.fill(ticker[i]);


                try {
                    Rectangle2D bounds = ticker[i].getBounds2D();

                    if (bounds.getMaxY() > maxY) {
                        maxY = bounds.getMaxY();
                    }
                } catch (ArrayIndexOutOfBoundsException ae) {
                    //
                }
            }
            g2.setColor(UIHelper.GREY_COLOR);
            g2.setFont(UIHelper.VER_10_BOLD);
            FontMetrics fm = g2.getFontMetrics(g2.getFont());
            int stringSize = fm.stringWidth(text);
}
}
//7
public class func{
	public void paintComponent(Graphics graphics){
    g.setColor(FILL_COLOR);
    g.fill(drawRect);
    g.setColor(DRAW_COLOR);
    g.draw(drawRect);
    g.dispose();    
}
}
//8
public class func{
	public void paint(Graphics2D g){
    g2d.setColor(Color.green.darker());
    g2d.fill(dotShape);
    g2d.setColor(Color.black);
    g2d.draw(dotShape);
    g2d.dispose();
}
}
//9
public class func{
	public void paint(Graphics g){
                g2d.setColor(new Color(255, 255, 255, 128));
                g2d.fill(s);
                g2d.setColor(Color.black);
}
}
//10
public class func{
	public void drawAlgoState(Graphics2D g2,SortingWorld world,int maxSize){
      g2.setColor( values[i]==i ? Color.GREEN : Color.RED) ;
      g2.fill(rect);
      g2.setColor(Color.black);
      g2.draw(rect);
      if (scale > 20) 
        g2.drawString(val2str(values[i],world.getValueCount()) , (int)scale*i+(int)scale/2, maxSize-2);
}
}
//11
public class func{
	public void drawBB(java.awt.Graphics2D g,ProjectionRect bb,Color fillColor){
    if (null != fillColor) {
      g.setColor(fillColor);
      g.fill(rect);
    }
    g.setColor(outlineColor);
    g.draw(rect);
}
}
//12
public class func{
	public void paint(Graphics2D g,Rectangle2D rect,String text){
        textBounds = new Rectangle2D.Double(
            x + textBounds.getX(),
            y + textBounds.getY(),
            textBounds.getWidth(),
            textBounds.getHeight()
        );
        RoundRectangle2D background = new RoundRectangle2D.Double(
            textBounds.getX() - ArcRadius / 2,
            textBounds.getY() - ArcRadius / 2,
            textBounds.getWidth() + ArcRadius,
            textBounds.getHeight() + ArcRadius,
            ArcRadius, ArcRadius
        );
        Color oldColor = g.getColor();
        g.setColor(BackColor);
        g.fill(background);
        g.setColor(TextColor);
}
}
//13
public class func{
	public void paintIcon(Component c,Graphics g,int x,int y){
            Graphics2D graphics = (Graphics2D)g;
            graphics.setColor(SwingTools.LIGHT_BLUE);
            graphics.fill(arrowShape);
            graphics.setColor(SwingTools.DARK_BLUE);
            graphics.draw(arrowShape);
            g.translate(-x, -y);
}
}
//14
public class func{
	public void paintTrack(Graphics g,JComponent c,Rectangle trackBounds){
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(background);
        g2.fill(trackBounds);
        g2.setColor(foreground);
        g2.draw(trackBounds);
}
}
//15
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
//16
public class func{
	public void paint(Graphics2D g2d,Rectangle paintArea,WMSMapContent mapContent){
        Rectangle2D bgRect = new Rectangle2D.Double(
            x - 3.0, y - d.getHeight(), 
            d.getWidth() + 6.0, d.getHeight() + 6.0
        );
        g2d.setColor(Color.WHITE);
        g2d.fill(bgRect);
        g2d.setColor(Color.BLACK);
}
}
//17
public class func{
	public void createShapeImage(Shape shape,Color c1,Color c2){
    BufferedImage image = GraphicsUtils.createImage(rect.width,
        rect.height, true);
    Graphics2D g = image.createGraphics();
    g.setColor(c1);
    g.fill(shape);
    g.setColor(c2);
    g.draw(shape);
}
}
//18
public class func{
	public void drawSolidCircle(Vec2 center,float radius,Vec2 axis,Color3f color){
    g.scale(radius, radius);
    g.setColor(f);
    g.fill(circle);
    g.setColor(s);
    g.draw(circle);
}
}
//19
public class func{
	public void drawInnerCircle(final Graphics2D g2,final double theCenterX,final double theCenterY,final double innerRadius){
        g2.setColor(Color.white);
        g2.fill(innerCircle);
        g2.setColor(Color.black);
        g2.draw(innerCircle);
        drawCross(g2, (int) theCenterX, (int) theCenterY, lineLength, lineLength);
}
}
//20
public class func{
	public void drawGenericNominalLegend(Graphics graphics,String[] names,PointStyle[] pointStyles,Color[] colors,int xOffset,int alpha){
            g.setColor(color);
            g.fill(shape);
            g.setColor(Color.black);
            g.draw(shape);
            g.drawString(nominalValue, currentX, 15);
            Rectangle2D stringBounds = LABEL_FONT.getStringBounds(nominalValue, g.getFontRenderContext());
            currentX += stringBounds.getWidth() + 15;
}
}
//21
public class func{
	public void paintComponent(Graphics g){
        g2.setColor(MOTOR_FILL_COLOR);
        g2.fill(circle);
        g2.setColor(MOTOR_BORDER_COLOR);
        g2.draw(circle);
}
}
//22
public class func{
	public void draw(Graphics2D g){
            g.setColor(Color.GREEN);
            g.fill(e);
            g.setColor(Color.BLACK);
            g.draw(e);
}
}
//23
public class func{
	public void draw(Graphics2D g){
            g.setColor(Color.GREEN);
            g.fill(e);
            g.setColor(Color.BLACK);
            g.draw(e);
}
}
//24
public class func{
	public void drawPoint(Graphics2D g,PointStyle pointStyle,double x,double y,Color color,Color borderColor){
        g.setColor(color);
        g.fill(pointShape);
        g.setColor(borderColor);
        g.draw(pointShape);
}
}
//25
public class func{
	public void createWorldMapImage(final GeneralPath[] geoBoundaryPaths){
                g2d.setColor(_fillColor);
                g2d.fill(boundaryPath);
                g2d.setColor(Color.red);
                g2d.draw(boundaryPath);
}
}
//26
public class func{
	public void paint(Graphics g){
            g2.setColor(arrowColor);
            g2.fill(arrow);
            g2.setColor(Color.white);
            g2.draw(arrow);
}
}
//27
public class func{
	public void paint(Graphics g){
            g2.setColor(highlight);
            g2.fill(arrow);
            g2.setColor(Color.yellow);
            g2.draw(arrow);
}
}
//28
public class func{
	public void paint(Graphics2D gfx){
            gfx.setColor(color);
            gfx.fill(_bpoly);
            gfx.setColor(Color.black);
            gfx.draw(_bpoly);
}
}
//29
public class func{
	public void paint(Graphics2D g2d,Rectangle paintArea,WMSMapContent mapContent){
                g2d.setStroke(new BasicStroke(2 * haloRadius, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
                g2d.draw(outline);
            g2d.setFont(font);
            g2d.setColor(fontColor);
            g2d.fill(outline);
            g2d.setColor(oldColor);
            g2d.setFont(oldFont);
            g2d.setStroke(oldStroke);
}
}
//30
public class func{
	public void draw(Graphics2D g2){
        g2.setColor(Color.lightGray);
        g2.fill(outerCircle);
        g2.setColor(Color.black);
        g2.draw(outerCircle);
}
}
//31
public class func{
	public void render(Graphics2D gfx){
        gfx.setColor(getBackground());
        gfx.fill(_shape);
        gfx.setColor(_outline);
        gfx.draw(_shape);
        SwingUtil.restoreAntiAliasing(gfx, oalias);
}
}
//32
public class func{
	public void drawMiddleEllipse(Graphics2D g){
    g.setColor(DARK_GREEN_ALPHA_80);
    g.fill(ellipse);
    g.setColor(GREEN_ALPHA_40);
    g.setStroke(THIN_STROKE);
    g.draw(ellipse);
}
}
//33
public class func{
	public void main(String[] args){
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.translate(150, 150);
        g2d.setColor(Color.BLUE);
        g2d.fill(shape);
        g2d.setColor(Color.BLACK);
        g2d.setFont(font);
}
}
//34
public class func{
	public void onMouseOver(Graphics2D g2d,Rectangle cell,U guess,U gold){
        Font bak = g2d.getFont();
        g2d.setFont(bak.deriveFont(bak.getSize() * 2.0f));
        g2d.setColor(Color.WHITE);
        g2d.fill(cell);
        g2d.setColor(Color.BLACK);
}
}
//35
public class func{
	public void paint(Graphics g){
            g2.setColor(getBorderColor().brighter());
            g2.setColor(getBorderColor());
        g2.fill(body);
}
}
//36
public class func{
	public void paint(Graphics g){
            g2.setColor(Comment.background.brighter());
            g2.setColor(Comment.background);
        g2.fill(textarea);
}
}
//37
public class func{
	public void paint(Graphics g){
            g2.setColor(Color.lightGray.brighter());
            g2.setColor(Color.lightGray);
        g2.fill(resize);
}
}
//38
public class func{
	public void paint(Graphics2D g,Sequence sequence,IcyCanvas canvas){
                    g2.setColor(getSelectedColor());
                    g2.setColor(getColor());
                g2.fill(ellipse);
}
}
//39
public class func{
	public void drawTransformed(Shape s,Graphics2D g){
    Color oldColor = g.getColor();
    g.setColor(color);
    g.fill(s);
    g.setColor(oldColor);    
}
}
//40
public class func{
	public void paintThumb(Graphics g,JComponent c,Rectangle thumbBounds){
        g2.setColor(borderUIColor != null ? borderUIColor : fgUIColor);
        g2.fill(thumbBounds);
        g2.setColor(bgUIColor);
        g2.drawLine(x-w, y+2, x+w, y+2);
}
}
//41
public class func{
	public void initButton(){
        g.setColor(new Color(128, 128, 128, 128));
        g.fill(roundRect);
        comp.paint(g);
        g.setColor(Color.white);
        g.draw(roundRect);
        g.dispose();
}
}
//42
public class func{
	public void drawShadow(Graphics2D g2d,Shape shape,double deltaShadow,double dpiFactor){
        gg.setColor(colorLine);
        gg.draw(shape);
        gg.setColor(color);
        gg.fill(shape);
      gg.dispose();
}
}
//43
public class func{
	public void main(String[] args){
       g2d.translate(x, y);
       g2d.setColor(Color.RED);
       tl.draw(g2d, 0, 0);
       g2d.setColor(Color.BLUE);
       g2d.fill(bounds);
       g2d.dispose();
}
}
//44
public class func{
	public void toRaster(Shape mask){
                if (bounds.width > 0 && bounds.height > 0) {
                    BufferedImage clip =
                        new BufferedImage(bounds.x + bounds.width,
                                          bounds.y + bounds.height,
                                          BufferedImage.TYPE_BYTE_BINARY);
                    Graphics2D g = clip.createGraphics();
                    g.setColor(Color.black);
                    g.fillRect(0, 0, bounds.x + bounds.width, bounds.y + bounds.height);
                    g.setColor(Color.white);
                    g.fill(mask);
                    raster = clip.getRaster();
                }
}
}
//45
public class func{
	public void main(String[] args){
        if (img.getRGB(60, 20) != Color.BLACK.getRGB()) {
            throw new RuntimeException("Error. Invalid pixel at (60,20)");
        }
        img = createCustomImage();
        g2d = img.createGraphics();
        g2d.setColor(Color.BLACK);
        g2d.fillRect(0,0,IMG_WIDTH,IMG_HEIGHT);
        g2d.setColor(Color.WHITE);
        g2d.fill(oddShape);
}
}
//46
public class func{
	public void drawInnerSubDecoration(Graphics2D g){
    transform(g, AffineTransform.getTranslateInstance(110, 54));
    g.setColor(GREEN_ALPHA_08);
    g.fill(shape);
    g.setStroke(THIN_STROKE);
    g.setColor(GREEN_ALPHA_48);
    g.draw(shape);
}
}
//47
public class func{
	public void drawMiddleDecoration(Graphics2D g){
    transform(g, AffineTransform.getTranslateInstance(77, 41));
    g.setColor(GREEN_ALPHA_20);
    g.fill(shape);
    g.setStroke(THIN_STROKE);
    g.setColor(GREEN_ALPHA_48);
    g.draw(shape);
}
}
//48
public class func{
	public void paint(Graphics2D g,Object t,int width,int height){
      g.setColor(frameColor);
      g.draw(rc);
      g.setColor(fillColor);
      g.fill(rc);
}
}
//49
public class func{
	public void main(String[] args){
        BufferedImage img = new BufferedImage(IMG_WIDTH, IMG_HEIGHT,
                                              BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = img.createGraphics();
        g2d.setColor(Color.BLACK);
        g2d.fillRect(0,0,IMG_WIDTH,IMG_HEIGHT);
        g2d.setColor(Color.WHITE);
        g2d.fill(oddShape);
}
}
//50
public class func{
	public void paintObject(Graphics2D g2,State s,ObjectInstance ob,float cWidth,float cHeight){
      g2.setColor(this.getColorForString(ob.getStringValForAttribute(BlocksWorld.ATTCOLOR)));
      float ry = cHeight - blockHeight - this.getHeight(s, ob)*blockHeight;
      g2.fill(new Rectangle2D.Float(rx + (hGap), ry, blockWidth - 2*hGap, blockHeight));
      g2.setColor(Color.black);
}
}
//51
public class func{
	public void paintComponent(Graphics g){
        g2d.setColor(UIUtil.getListSelectionBackground());
        g2d.fillRect(0, 0, bounds.width, bounds.height);
      g2d.setColor(Color.WHITE);
      g2d.fill(shape);
}
}
//52
public class func{
	public void paintWorld(Graphics2D g){
    for(String country:this.country2shape.keySet())
      {
      Shape shape=country2shape.get(country);
      float color=0;
      if(seen.count(country)!=0)
        {
        color=1f-(float)(Math.log(seen.count(country))/Math.log((double)seen.getTotal()));
        }
      g.setColor(seen.count(country)==0?Color.WHITE:new Color(color,0f,0f));
      g.fill(shape);
      }
    for(String country:this.country2shape.keySet())
      {
      Shape shape=country2shape.get(country);
      g.setColor(Color.BLACK);
      g.draw(shape);
        
      }
}
}
//53
public class func{
	public void paintChildren(Graphics g){
      graphics.setColor(new Color(255, 255, 255, 30));
      graphics.fill(r);
    graphics.dispose();
}
}
//54
public class func{
	public void paint(Graphics g){
            g2d.setColor(new Color(128, 0, 255, 128));
            g2d.fill(bounds);
        g2d.dispose();
}
}
//55
public class func{
	public void create_DISABLED_Image(final int WIDTH){
        G2.setColor(new Color(102, 102, 102, 178));
        G2.fill(BACKGROUND);
        G2.dispose();
}
}
//56
public class func{
	public void create_DISABLED_Image(final int WIDTH){
        G2.setColor(new Color(102, 102, 102, 178));
        G2.fill(GAUGE_BACKGROUND);
        G2.dispose();
}
}
//57
public class func{
	public void paintBorder(Component c,Graphics g,int x,int y,int width,int height){
            Area corner = new Area(new Rectangle2D.Float(x, y, width, height));
            corner.subtract(new Area(round));
            g2.fill(corner);
        g2.setColor(Color.lightGray);
        g2.draw(round);
        g2.dispose();
}
}
//58
public class func{
	public void drawToolTip(Graphics2D g){
      Rectangle2D bg = new Rectangle2D.Double((toolTipX) - stringBounds.getWidth() - 15, (toolTipY - (stringBounds.getHeight() / 2)), stringBounds.getWidth() + 6, Math.abs(stringBounds.getHeight()) + 4);
      g.fill(bg);
      g.setColor(Color.black);
      g.draw(bg);
      g.drawString(currentToolTip, (float) ((toolTipX ) - stringBounds.getWidth() - 12 ), (float) ((toolTipY + stringBounds.getHeight() * 0.5) + 1));
}
}
//59
public class func{
	public void drawToolTip(Graphics2D g,ToolTip toolTip){
            Rectangle2D bg = new Rectangle2D.Double(toolTip.getX() - stringBounds.getWidth() / 2 - 4, toolTip.getY() - stringBounds.getHeight() / 2, stringBounds.getWidth() + 5, stringBounds.getHeight() + 3);
            g.fill(bg);
            g.setColor(Color.black);
            g.draw(bg);
            g.drawString(toolTip.getText(), (int) (toolTip.getX() - stringBounds.getWidth() / 2 - 2), toolTip.getY() + 6);
}
}
//60
public class func{
	public void drawToolTip(Graphics2D g){
      Rectangle2D bg = new Rectangle2D.Double(toolTipX - stringBounds.getWidth() / 2 - 4, toolTipY - stringBounds.getHeight() / 2 - 2, stringBounds.getWidth() + 5, Math.abs(stringBounds.getHeight()) + 3);
      g.fill(bg);
      g.setColor(Color.black);
      g.draw(bg);
}
}
//61
public class func{
	public void doPaint(Graphics2D g2,Object o,int i,int i1){
        g2.setColor(new Color(1.0f, 1.0f, 1.0f));
        g2.fill(area);
        g2.setComposite(composite);
}
}
//62
public class func{
	public void drawToolTip(Graphics2D g,double dx,double dy,double sx,double sy){
      Rectangle2D bg = new Rectangle2D.Double((toolTipX + dx) * sx - stringBounds.getWidth() / 2 - 4, (toolTipY + dy) * sy + 3, stringBounds.getWidth() + 5, Math.abs(stringBounds.getHeight()) + 3);
      g.fill(bg);
      g.setColor(Color.black);
      g.draw(bg);
}
}
//63
public class func{
	public void paint(Graphics2D g,JXMapViewer map,int w,int h){
                    Rectangle green_mask = new Rectangle(st_gp_pt_screen, new Dimension(25,25));
                    g.fill(green_mask);
                    g.setColor(Color.BLACK);
                    g.draw(green_mask);
                    g.dispose();
}
}
//64
public class func{
	public void paint(Graphics2D g,JXMapViewer map,int w,int h){
                        Rectangle yellow_mask = new Rectangle(st_gp_pt_screen, new Dimension(25,25));
                        g.fill(yellow_mask);
                        g.setColor(Color.BLACK);
                        g.draw(yellow_mask);
                    g.dispose();
}
}
//65
public class func{
	public void draw(Graphics2D g2d,AlphaComposite composite,String name){
        g2d.setColor(new Color(255, 0, 0, 190));
        g2d.fill(dest);
        g2d.setComposite(composite);
}
}
//66
public class func{
	public void paintComponent(Graphics g){
      if (s1[i].empty() == false)
        graphics2D.fill(new Ellipse2D.Double(s1[i].x - 1, s1[i].y - 1, 3, 3));
    graphics2D.setColor(Color.blue);
}
}
//67
public class func{
	public void paintComponent(Graphics g){
            for (int i = 0; i < ticker.length; i++) {
                int channel = 224 - (128 / (i + 1));
                g2.setColor(new Color(channel, channel, channel, alphaLevel));
                g2.fill(ticker[i]);

                Rectangle2D bounds = ticker[i].getBounds2D();

                if (bounds.getMaxY() > maxY) {
                    maxY = bounds.getMaxY();
                }
            }
}
}
//68
public class func{
	public void createClipImage(Graphics2D g,Shape shape){
        g2.fillRect(0, 0, shape.getBounds().width, shape.getBounds().height);
        g2.setComposite(AlphaComposite.Src);
        g2.setRenderingHint(
            RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.WHITE);
        g2.fill(shape);
        g2.dispose();
}
}
//69
public class func{
	public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.red);
        g2d.fill(ellipse);
        g2d.dispose();
}
}
//70
public class func{
	public void paintControlPoint(Graphics2D g2,Point2D control){
        g2.setColor(new Color(0.0f, 0.0f, 0.5f, 0.5f));
        g2.fill(circle);
                (int) xPositionToPixel(pos), (int) yPositionToPixel(pos));
}
}
//71
public class func{
	public void drawBlurs(Graphics2D g2d,Shape shape,float contourWidth){
                float value = n / (float) (count + 1);
                Color color = new Color(value, value, value);
                g2d.setColor(color);
                g2d.fill(semiBlur);
}
}
//72
public class func{
	public void doPaintBackground(Graphics2D g,Rectangle clip,boolean vertical,Rectangle rectangle){
    g.setColor(new Color(0, 0, 0, 80));
    g.fill(clip);
}
}
//73
public class func{
	public void paintComponent(Graphics g){
        g2.setColor(new Color(97,0,0,50));
        g2.fill(region);
}
}
//74
public class func{
	public void paintRobocodeLogo(Graphics2D g){
    g.setColor(new Color(0, 0x40, 0));
    g.fill(robocodeTextPath);
}
}
//75
public class func{
	public void paintIcon(Component c,Graphics g,int x,int y){
             g2.setColor( new Color( 255, 255, 0, 127) );
             g2.fill(r);
}
}
//76
public class func{
	public void doPaintBackground(Graphics2D g,Rectangle clip,boolean vertical,Rectangle rectangle){
    g.setColor(new Color(0, 0, 0, 80));
    g.fill(clip);
}
}
//77
public class func{
	public void applyColorFilter(Image image,Color color,float alpha){
            g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
            g.setColor(color);
            g.fill(rect);
            g.dispose();
}
}
//78
public class func{
	public void composeMaskedImage(ImageCreator isrc,Shape mask,BufferedImage base){
        int wid = base.getWidth();
        int hei = base.getHeight();
        BufferedImage target = isrc.createImage(wid, hei, Transparency.TRANSLUCENT);
        Graphics2D g2 = target.createGraphics();
            g2.setColor(Color.BLACK); // whatever, really
            g2.fill(mask);
            g2.setComposite(AlphaComposite.SrcIn);
            g2.drawImage(base, 0, 0, null);
            g2.dispose();
}
}
//79
public class func{
	public void paintComponent(Graphics graphics){
            g.setColor(new Color(128, 128, 128, 128));
            g.fill(outer);
}
}
//80
public class func{
	public void drawBackground(Rectangle bounds,Graphics2D graphics2D){
        graphics2D.setColor(new Color(255, 255, 255, 64));
        graphics2D.fill(backgroundShape);
}
}
//81
public class func{
	public void renderG2D(Item item,G2DTarget target,PreviewProperties properties){
        graphics.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), alpha));
        graphics.fill(ellipse);
}
}
//82
public class func{
	public void paint(Graphics2D g2d){
        g2d.setColor(new Color(96, 96, 96));
        g2d.fill(area);
}
}
//83
public class func{
	public void draw(Graphics2D g,int maxW,int maxH,Display display){
    g.setColor(new Color(255,255,0,100));
    g.fill(this);
}
}
//84
public class func{
	public void paintComponent(Graphics g){
            g2.setColor(new Color(34,177,76));
            g2.fill(r);
}
}
//85
public class func{
	public void print(Graphics2D g2,double scalex,double scaley,int xOffset,int yOffset,int imgHeight){
      for (int i = 0; i < spotcnt; i++)
        g2.fill(new Rectangle2D.Double(spots[i].x * scalex - 1 + xOffset, spots[i].y * scalex - 1 + yOffset, 3, 3));
      g2.setColor(Color.black);
}
}
//86
public class func{
	public void computeRect(PlanarImage[] sourceImages,WritableRaster tile,Rectangle destRect){
        graphics2D.translate(-tile.getMinX(), -tile.getMinY());
        graphics2D.setColor(Color.WHITE);
        graphics2D.fill(shape);
        graphics2D.dispose();
}
}
//87
public class func{
	public void paintImage(Graphics2D g2d,Color color1,Color color2,Color color3){
        g2d.fill(new Ellipse2D.Double(0, 0, dim, dim));
        g2d.setColor(color3);
        g2d.translate(0, 16);
}
}
//88
public class func{
	public void paintComponent(final Graphics aGraphics){
        for ( int i = 0; i < this.barCount; i++ )
        {
          canvas.setColor( calculateBarColor( i ) );
          canvas.fill( rect );
          canvas.rotate( ( 2.0 * Math.PI ) / this.barCount );
        }
        canvas.fillRect( 0, 0, getWidth(), getHeight() );
      canvas.dispose();
}
}
//89
public class func{
	public void paintComponent(Graphics graphics){
    g2.setColor(this.getBackground());
    g2.fill(rect);
    g2.dispose();
}
}
//90
public class func{
	public void create_LCD_THRESHOLD_Image(final int WIDTH,final int HEIGHT,final Color COLOR){
        G2.setColor(COLOR);
        G2.fill(LCD_THRESHOLD);
        G2.dispose();
}
}
//91
public class func{
	public void create_MEASURED_VALUE_Image(final int WIDTH,final Color COLOR,final double ROTATION_OFFSET){
        G2.setColor(COLOR);
        G2.fill(INDICATOR);
        G2.dispose();
}
}
//92
public class func{
	public void create_MEASURED_VALUE_Image(final int WIDTH,final Color COLOR){
        G2.setColor(COLOR);
        G2.fill(MAXMEASURED);
        G2.dispose();
}
}
//93
public class func{
	public void paintComponentChrono(Graphics g){
    g2.fill(new Rectangle2D.Double(0., 0., (double) getWidth(),
        (double) getHeight()));
    g2.setColor(Color.black);
}
}
//94
public class func{
	public void paint(Graphics g,JComponent c){
    Shape contour = SubstanceOutlineUtilities
        .getBaseOutline(
            width,
            height,
            Math.max(
                0,
                2.0f
                    * SubstanceSizeUtils
                        .getClassicButtonCornerRadius(componentFontSize)
                    - borderDelta), null, borderDelta);
    graphics.setColor(SubstanceTextUtilities
        .getTextBackgroundFillColor(this.spinner));
    graphics.fill(contour);
    graphics.dispose();
}
}
//95
public class func{
	public void paintComponent(Graphics g){
    g2.fill(new Rectangle2D.Double(0., 0., (double) getWidth(),
        (double) getHeight()));
    g2.setColor(Color.black);
}
}
//96
public class func{
	public void paint(Graphics2D g2,State s,float cWidth,float cHeight){
        g2.fill(new Rectangle2D.Double(0, 0, FrostbiteDomain.gameWidth, FrostbiteDomain.gameHeight));
        g2.setColor(Color.white);
}
}
//97
public class func{
	public void drawWorld2D(Graphics2D g){
        g.fill(new Rectangle2D.Double(x*LightBotWorldView2D.CELL_WIDTH, y*LightBotWorldView2D.CELL_WIDTH, LightBotWorldView2D.CELL_WIDTH, LightBotWorldView2D.CELL_WIDTH));
    g.setColor(GRID_COLOR);
}
}
//98
public class func{
	public void paintFocus(Graphics g){
        g2d.setColor(Color.black);
        g2d.fill(r);
        r = new Rectangle2D.Double(x2 - 2, y2 - 1, 4, 4);
}
}
//99
public class func{
	public void drawWeightRectangle(Graphics2D newSpace,DataTable dataTable,int column,double maxWeight,int plotterSize){
            Rectangle2D weightRect = new Rectangle2D.Double(1, 1, plotterSize - 2, plotterSize - 2);
            newSpace.fill(weightRect);
            newSpace.setColor(Color.WHITE);
}
}
//100
public class func{
	public void dot(Graphics2D g2d,Point2D p,double r,Color c){
        g2d.fill(new Ellipse2D.Double(p.getX() - r, p.getY() - r, 2 * r, 2 * r));
        g2d.setColor(old);
}
}
//101
public class func{
	public void paintTrack(Graphics graphics){
        graphics2d.fill(track);
        graphics2d.setColor(TRACK_BORDER_COLOR);
        graphics2d.draw(track);
}
}
//102
public class func{
	public void paintFocus(Graphics g){
        g2d.setColor(Color.black);
        g2d.fill(r);
        r = new Rectangle2D.Double(getX() + getWidth() - 2, getY()
                + getHeight() - 2, 4, 4);
}
}
//103
public class func{
	public void paintFocus(Graphics g){
        g2d.setColor(Color.black);
        g2d.fill(r);
        r = new Rectangle2D.Double(getX() + getWidth() - 2, getY() - 1, 4, 4);
}
}
//104
public class func{
	public void paintFocus(Graphics g){
        g2d.setColor(Color.black);
        g2d.fill(r);
        r = new Rectangle2D.Double(getX() - 1, getY() + getHeight() - 2, 4, 4);
}
}
//105
public class func{
	public void paint(final Graphics2D g,final Rectangle clip){
    if(shape.getLabelsSize()>0) {
      g.setColor(shape.getGridLabelsColour().toAWT());
      g.fill(pathLabels);
    }
    if(vectorTrans!=null)
      endRotation(g, vectorTrans);
}
}
//106
public class func{
	public void paint(Graphics2D graphics){
    if (fillColor != Color.NONE) {
      graphics.setColor(fillColor.toAWTColor());
      graphics.fill(shape);
    }
    if (strokeColor != Color.NONE) {
      float[] dashArray = getDashArray();
      if (dashArray.length == 0)
        dashArray = null;
      graphics.setColor(strokeColor.toAWTColor());
      graphics.setStroke(new BasicStroke(getStrokeWidth(),
          getStrokeCap().value, getStrokeJoin().value,
          getMiterLimit(), dashArray,
          getDashOffset()));
      graphics.draw(shape);
    }
}
}
//107
public class func{
	public void renderBoxBorderAndBackground(final RenderBox box){
    if ( box.getBoxDefinition().getBorder().isEmpty() == false ) {
      borderRenderer.paintBackgroundAndBorder( box, g2 );
    } else {
      final Color backgroundColor = (Color) box.getStyleSheet().getStyleProperty( ElementStyleKeys.BACKGROUND_COLOR );
      if ( backgroundColor != null ) {
        final double x = StrictGeomUtility.toExternalValue( box.getX() );
        final double y = StrictGeomUtility.toExternalValue( box.getY() );
        final double w = StrictGeomUtility.toExternalValue( box.getWidth() );
        final double h = StrictGeomUtility.toExternalValue( box.getHeight() );
        boxArea.setFrame( x, y, w, h );
        g2.setColor( backgroundColor );
        g2.fill( boxArea );
      }
    }
}
}
//108
public class func{
	public void draw(final Graphics2D g2d,final Rectangle2D bounds){
    if ( backgroundColor != null ) {
      g2d.setColor( backgroundColor );
      g2d.fill( bounds );
    }
}
}
//109
public class func{
	public void draw(Graphics2D g,Figure f,Point2D.Double p1,Point2D.Double p2){
                color = f.get(STROKE_COLOR);
                color = f.get(FILL_COLOR);
            if (color != null) {
                g.setColor(color);
                g.fill(path);
            }
}
}
//110
public class func{
	public void draw(Graphics2D graphics2d){
                if(fillColor != null)
                {
                    graphics2d.setColor(fillColor);
                    graphics2d.fill(shape);
                }
}
}
//111
public class func{
	public void drawSelectionHandle(Graphics2D g,float x,float y,Color fillColor,int index){
        if (fillColor != null) {
            g.setColor(fillColor);
            g.fill(SelectionHandle);
        }
}
}
//112
public class func{
	public void paint(final Graphics2D g,final Rectangle clip){
      g.setColor(java.awt.Color.BLACK);
      g.fill(pathLabels);
    if(vectorTrans!=null)
      endRotation(g, vectorTrans);
}
}
//113
public class func{
	public void paint(Graphics2D graphics,limelight.ui.model.text.TextModel model){
    if(!model.isCaretOn() || model.hasSelection())
      return;
    Box caret = model.getCaretShape();
    graphics.setColor(model.getContainer().getStyle().getCompiledTextColor().getColor());
    graphics.fill(caret);
}
}
//114
public class func{
	public void paint(Graphics2D g2d,State state){
                    g2d.setComposite(((AlphaComposite) old).derive(1f));
                g2d.setColor(Color.LIGHT_GRAY);
                g2d.fill(circle);
                g2d.setComposite(old);
}
}
//115
public class func{
	public void fillTile(Graphics2D gfx,int tx,int ty,Color color){
        gfx.setColor(color);
        gfx.fill(poly);
        gfx.setComposite(ocomp);
}
}
//116
public class func{
	public void tintSquare(int[] coords,int square_width,AlphaComposite ac,Color color,BufferedImage bi,Graphics2D g2d){
    g2d.setComposite(ac);
    g2d.setColor(color);
    g2d.fill(rect);
    g2d.drawImage(bi, null, 0, 0);
}
}
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
//118
public class func{
	public void drawTrafficLight2(Graphics2D g,TrafficLight trafficLight,Rectangle2D trafficLightRect,double radius){
        g.setColor(Color.DARK_GRAY);
        g.fill(trafficLightRect);
        final Double width = trafficLightRect.getWidth();
        final Double height = trafficLightRect.getHeight();
}
}
//119
public class func{
	public void paintSortIndicator(Graphics2D graphics2d,TableUtils.SortDirection sortDirection){
        graphics2d.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2d.translate(x, y);
        graphics2d.setColor(SORT_ICON_COLOR);
        graphics2d.fill(sortShape);
}
}
//120
public class func{
	public void drawFillShape(final Graphics2D g2d){
        final Ellipse2D shape = new Ellipse2D.Float();
        setShapeFrame(shape, strokeWidth);
        g2d.setStroke(new BasicStroke(strokeWidth));
        g2d.setColor(counterColor);
        g2d.fill(shape);
}
}
//121
public class func{
	public void paint(Graphics g,Rectangle bounds){
      Graphics2D g2d = (Graphics2D) g;
      g2d.setColor(Color.black);
      g2d.fill(bounds);
}
}
//122
public class func{
	public void paintThumb(Graphics g,JComponent c,Rectangle thumbBounds){
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(foreground);
        g2.fill(thumbBounds);
}
}
//123
public class func{
	public void paintTrack(Graphics g,JComponent c,Rectangle trackBounds){
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(bgUIColor);
        g2.fill(trackBounds);
}
}
//124
public class func{
	public void paintComponent(Graphics graphics){
        Graphics2D g = (Graphics2D) graphics;
        Shape clip = g.getClip();
        g.setColor(LightZoneSkin.Colors.NeutralGray);
        g.fill(clip);
}
}
//125
public class func{
	public void paintComponent(Graphics graphics){
        Graphics2D g = (Graphics2D) graphics;
        Shape clip = g.getClip();
        g.setColor(LightZoneSkin.Colors.NeutralGray);
        g.fill(clip);
}
}
//126
public class func{
	public void paintTile(Graphics2D g,MapView mv,IVertexRenderer vertexRenderer){
    BlockingDeque<EleVertex> list = getVertices();
    for (EleVertex eleVertex : list) {
      Point p0 = mv.getPoint(eleVertex.get(0));
      Point p1 = mv.getPoint(eleVertex.get(1));
      Point p2 = mv.getPoint(eleVertex.get(2));
      Triangle shape = new Triangle(p0, p1, p2);

      // obtain vertex color
      g.setColor(vertexRenderer.getElevationColor(eleVertex));
      // TODO: Move to renderer
      g.fill(shape);
    }
}
}
//127
public class func{
	public void paintComponent(Graphics g){
            for (int i = 0; i < bars.length; i++) {
                g2.setColor(colors[i + colorOffset]);
                g2.fill(bars[i]);
            }
}
}
//128
public class func{
	public void paintObject(Graphics2D g2,State s,ObjectInstance ob,float cWidth,float cHeight){
      float ry = cHeight - height - ob.getIntValForAttribute(BlockDude.ATTY)*height;
      g2.fill(new Rectangle2D.Float(rx, ry, width, height));
      g2.setColor(Color.orange);
}
}
//129
public class func{
	public void drawNaoLoc(Graphics2D g2,boolean shouldFlip){
    g2.fill(new Ellipse2D.Float(screenX-naoRobotSize/2, screenY-naoRobotSize/2, naoRobotSize, naoRobotSize));
    g2.setColor(Color.black);
}
}
//130
public class func{
	public void draw(ColorMapper colorMapper,Graphics2D g2d){
    g2d.setColor(colorMapper.getMappedColor(getYellowNote()));
    g2d.fill(p);
}
}
//131
public class func{
	public void draw(ColorMapper colorMapper,Graphics2D g2d){
    g2d.setColor(colorMapper.getMappedColor(getYellow()));
    g2d.fill(ellipse);
}
}
//132
public class func{
	public void draw(ColorMapper colorMapper,Graphics2D g2d){
    g2d.setColor(colorMapper.getMappedColor(getYellow()));
    g2d.fill(p);
}
}
//133
public class func{
	public void paintBorder(Component c,Graphics g,int x,int y,int width,int height){
            Path2D path = new Path2D.Float(Path2D.WIND_EVEN_ODD);
            path.append(inner, false);
            g2d.fill(path);
            g2d.setColor(oldColor);
}
}
//134
public class func{
	public void draw(ColorMapper colorMapper,Graphics2D g2d){
    g2d.setColor(colorMapper.getMappedColor(getYellow()));
    g2d.fill(p);
}
}
//135
public class func{
	public void getMask(){
    BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);
    Graphics2D g2d = bi.createGraphics();
    g2d.setColor(Color.white);
    g2d.fill(shape);
}
}
//136
public class func{
	public void paintDotShape(final Graphics2D g,final boolean toFill,final Color fillCol){
      g.setColor(fillCol.toAWT());
      g.fill(path);
}
}
//137
public class func{
	public void paintArrow(final Graphics2D g,final Color lineColor){
    g.setColor(lineColor.toAWT());
    g.fill(path);
}
}
//138
public class func{
	public void paintCircle(final Graphics2D g,final Color fillColour,final Color lineColour){
    g.setColor(fillColour.toAWT());
    g.fill(path);
}
}
//139
public class func{
	public void fillTextBackground(int align,int flag,Graphics2D g2d,float x,float y,float width,TextLayout layout){
            g2d.fill(layout.getBounds());
            g2d.setColor(c);
            g2d.setTransform(tr);
}
}
//140
public class func{
	public void fillTextBackground(int align,int flag,Graphics2D g2d,float x,float y,float width,TextLayout layout){
            g2d.fill(layout.getBounds());
            g2d.setColor(c);
            g2d.setTransform(tr);
}
}
//141
public class func{
	public void paintComponent(Graphics graphics){
            complement.subtract(new Area(shape));
            g.fill(complement);
            g.setColor(GridColor);
            paintGrid(g);
}
}
//142
public class func{
	public void drawOuterDecoration(Graphics2D g){
    transform(g, AffineTransform.getTranslateInstance(26, 24));
    g.setColor(WHITE_ALPHA_7F);
    g.fill(shape);
    g.setStroke(THIN_STROKE);
    g.drawOval(16, 5, 490, 163);
}
}
//143
public class func{
	public void getBevelImage(int width,int height,Area s){
        g2.setColor(ShapeBevel.getFrontFaceOverlay(light));
        g2.fill(s);
        ShapeBevel.createShapeBevel(g2, s, 0.1, bevelSize, bevelSize, light);
        BevelCacheKey key2 = new BevelCacheKey(width, height, new Area(s));
        bevelCache.put(key2, img);
}
}
//144
public class func{
	public void renderAttributeBand(Graphics2D g2D,Rectangle bandRectangle,Rectangle visibleRectangle,List<String> attributeNames,List<String> sampleList,List<MouseableRegion> mouseRegions){
                        g2D.setColor(AttributeManager.getInstance().getColor(key, attributeValue));
                        g2D.fill(rect);
                        mouseRegions.add(new MouseableRegion(rect, key, attributeValue));
}
}
//145
public class func{
	public void renderAttributes(Graphics2D graphics,Rectangle trackRectangle,Rectangle visibleRect,List<String> names,List<MouseableRegion> mouseRegions){
                graphics.setColor(AttributeManager.getInstance().getColor(key, attributeValue));
                graphics.fill(rect);
                mouseRegions.add(new MouseableRegion(rect, key, attributeValue));
}
}
//146
public class func{
	public void doPaintBackground(Graphics2D g,Rectangle clip,boolean vertical,Rectangle rectangle){
    g.setColor(UIUtil.getPanelBackground());
    g.fill(clip);
}
}
//147
public class func{
	public void doPaintBackground(Graphics2D g,Rectangle clip,boolean vertical,Rectangle rectangle){
    g.setColor(UIUtil.getPanelBackground());
    g.fill(clip);
}
}
//148
public class func{
	public void paintImage(Graphics2D g2d,Color color){
        Dimension dimension = getDimension();
        g2d.scale(dimension.getHeight() / 128, dimension.getHeight() / 128);
        draw(path, g2d);
        g2d.setColor(color);
        g2d.fill(path);
}
}
//149
public class func{
	public void paintComponent(Graphics g){
            g2.fill(g.getClip());
            g2.setColor(java.awt.Color.BLACK);
}
}
//150
public class func{
	public void paintComponent(Graphics g){
      g2d.setColor(getBackground());
      g2d.fill(flagShape);
}
}
//151
public class func{
	public void paintComponent(Graphics g){
        g2d.setColor(getFillColor());
        g2d.fill(shape);
}
}
//152
public class func{
	public void create_HORIZON_FOREGROUND_Image(final int WIDTH){
        G2.setColor(getPointerColor().LIGHT);
        G2.fill(TRIANGLE);
}
}
//153
public class func{
	public void renderFill(Graphics2D g,GraphMetrics metrics){
    g.setColor(fillColor);
    g.fill(path);
}
}
//154
public class func{
	public void draw(Graphics2D g2,Rectangle2D area){
        ParamChecks.nullNotPermitted(area, "area");
        g2.setColor(this.color);
        g2.fill(area);
}
}
//155
public class func{
	public void paint(Graphics2D g2){
      g2.setColor(getHandleColor(valueHandleSelected()));
      g2.fill(valueHandle);
}
}
//156
public class func{
	public void paintFocus(Graphics g){
        g2d.setColor(Color.black);
        g2d.fill(r);
}
}
//157
public class func{
	public void drawDiamond(Graphics2D g,Color fill,Color stroke){
            g.setColor(stroke);
            g.fill(p);
}
}
//158
public class func{
	public void drawDiamond(Graphics2D g,Color fill,Color stroke){
            g.setColor(stroke);
            g.fill(p);
}
}
//159
public class func{
	public void drawDiamond(Graphics2D g,Color fill,Color stroke){
            g.setColor(fill);
            g.fill(p);
}
}
//160
public class func{
	public void draw(Graphics2D gc){
                gc.setColor(colour);
                gc.fill(arc2D);
}
}
//161
public class func{
	public void dragOver(DropTargetDragEvent event){
            g2d.setColor(Color.black);
            g2d.fill(cueLine);
}
}
//162
public class func{
	public void paint(Graphics2D g2d,State state){
                g2d.setColor(Color.BLUE);
                g2d.fill(circle);
}
}
//163
public class func{
	public void draw(Graphics2D g){
        g.setColor(Color.BLUE);
        g.fill(e);
}
}
//164
public class func{
	public void drawOnThis(Graphics2D g){
      g.setColor(Object3DViewer.shadeColor(color, centerPoint.z));
      g.fill(polygon);
}
}
//165
public class func{
	public void paint(Graphics g){
        g2.fill(this.getXBox(w, h));
        g2.setColor(Color.white);
}
}
//166
public class func{
	public void clearRegion(Graphics2D g,Rectangle2D r){
        g.setColor(getBackground());
        g.fill(r);
        firePrePaint(g);
}
}
//167
public class func{
	public void doPaintBackground(Graphics2D g,Rectangle clip,boolean vertical,Rectangle rectangle){
    g.setColor(getBackgroundColor());
    g.fill(clip);
}
}
//168
public class func{
	public void drawBackground(Graphics2D g2){
    g2.setColor(getBackground());
    g2.fill(rectangle);
}
}
//169
public class func{
	public void paintComponent(Graphics g){
        g2.setColor(getBackground());
        g2.fill(clip);
}
}
//170
public class func{
	public void paint(Graphics g){
                    g2d.setColor(selectionOverlayColor);
                    g2d.fill(s);
}
}
//171
public class func{
	public void paintBetween(Graphics2D gfx,Rectangle dirtyRect){
        gfx.setColor(Color.gray);
        gfx.fill(dirtyRect);
        _spritemgr.renderSpritePaths(gfx);
}
}
//172
public class func{
	public void paintComponent(Graphics g){
            Dimension size = getSize();
            g2.setColor(getBackground());
            g2.fill(roundBounds);
}
}
//173
public class func{
	public void executePaint(Component component,Graphics2D g){
      g.setColor(ColorUtil.toAlpha(myColor, 40));
      g.fill(myBoundingBox);
}
}
//174
public class func{
	public void paintIcon(Component c,Graphics g,int x,int y){
       g2d.setColor(color);
       g2d.fill(shape);
}
}
//175
public class func{
	public void drawBackground(Graphics2D g2d,Dimension d){
        g2d.setColor(Color.black);
        g2d.fill(p);
}
}
//176
public class func{
	public void drawCurveTrapezium(@NotNull Graphics2D g,int x1,int x2,int start1,int end1,int start2,int end2,@Nullable Color fillColor,@Nullable Color borderColor){
      g.setColor(fillColor);
      g.fill(path);
}
}
//177
public class func{
	public void drawLabel(@NotNull Graphics2D g2,@NotNull String label,int paddingX,@NotNull Color bgColor,@Nullable Color rootIndicatorColor){
    g2.setColor(bgColor);
    g2.fill(rectangle2D);
}
}
//178
public class func{
	public void paintHudControlBackground(Graphics2D graphics,Rectangle bounds,ShapeProvider shapeProvider,Paint paint){
        graphics.fill(shapeProvider.createShape(x, y + 1, width, height - 1));
        graphics.setColor(BORDER_COLOR);
}
}
//179
public class func{
	public void paintFocus(Graphics g){
        g2d.setColor(Color.black);
        g2d.fill(r);
}
}
//180
public class func{
	public void drawBGShape(Graphics2D g){
      g.setColor(bgcolor);
      g.fill(bgShape);
}
}
//181
public class func{
	public void drawBlurs(Graphics2D g2d,Shape shape,float contourWidth){
        g2d.setColor(Color.white);
        g2d.fill(shape);
}
}
//182
public class func{
	public void paint(final Graphics2D g){
    g.setColor(colour.toAWT());
    g.fill(shape);
}
}
//183
public class func{
	public void exportImage(BufferedImage bufferedImage,Rectangle rectangle,RenderingHints hints,boolean transparent){
            graphics.setColor(Color.white); // set the background color
            graphics.fill(rectangle);
        _drawPlot(graphics, false, rectangle);
}
}
//184
public class func{
	public void paint(Graphics2D g2){
            g2.setColor(selected == lb ? Color.WHITE : Color.GRAY);
            g2.fill(r);
            Image img = images.get(lb);
            int x = getIconX(lb), y = getIconY(lb);
}
}
//185
public class func{
	public void paint(Graphics2D g2d,State state){
            g2d.setColor(Color.DARK_GRAY);
            g2d.fill(background);
}
}
//186
public class func{
	public void drawPartialProgress(Graphics2D g,float progress,float width,float height){
        r.setRect(0,0, split, height);
        g.fill(r);
        g.setColor(Color.gray);
}
}
//187
public class func{
	public void drawLabel(@NotNull Graphics2D g2,@NotNull String label,int paddingX,@NotNull Color bgColor,@Nullable Color rootIndicatorColor){
    g2.setColor(bgColor);
    g2.fill(rectangle2D);
}
}
//188
public class func{
	public void drawCanvas(Graphics2D g){
                g.setColor(canvasColor);
                g.fill(r);
}
}
//189
public class func{
	public void drawRadioMark(Graphics2D graphics,Color color,Shape markOval){
    graphics.setColor(color);
    graphics.fill(markOval);
}
}
//190
public class func{
	public void paint(Graphics2D g2,double scale){
    g2.setColor(getColor());
    g2.fill(caret);
}
}
//191
public class func{
	public void doPaintBackground(Graphics2D g2d,Rectangle clip){
    g2d.setColor(getBackground());
    g2d.fill(clip);
}
}
//192
public class func{
	public void paint(Graphics2D g,int width){
      g.setColor(myColor);
      g.fill(path);
}
}
//193
public class func{
	public void drawOnThis(Graphics2D g){
    g.setColor(shade ? shadedColor : color);
    g.fill(polygon);
}
}
//194
public class func{
	public void drawPoint(Graphics2D g2,double x,double y,double r,Color color,boolean hasBorder){
      c.setFrame(x - r2, y - r2, w2, w2);
      g2.fill(c);
    g2.setColor(color);
}
}
//195
public class func{
	public void drawRectangle(Graphics2D g,Color fill,Color stroke){
            g.setColor(fill);
            g.fill(r);
}
}
//196
public class func{
	public void drawTrafficLight1(Graphics2D g,TrafficLight trafficLight,Rectangle2D trafficLightRect,double radius){
        g.setColor(Color.DARK_GRAY);
        g.fill(trafficLightRect);
}
}
//197
public class func{
	public void paintComponent(Graphics g){
      Color bgColor = getBackground();
      g2d.setColor(bgColor);
      g2d.fill(shape);
}
}
//198
public class func{
	public void paintIcon(Component c,Graphics g,int x,int y){
            g2.setColor(rollover ? COLOR_COLLAPSED_FILL_ROLLOVER : COLOR_COLLAPSED_FILL);
            g2.fill(path);
}
}
