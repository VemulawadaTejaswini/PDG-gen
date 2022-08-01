//0
public class func{
	public void paintNodes(Graphics2D g,int height){
            g.setPaint(SwingTools.makeYellowPaint(NODE_RADIUS, NODE_RADIUS));
            g.setPaint(new Color(233, 233, 233));
            g.setPaint(SwingTools.makeBluePaint(NODE_RADIUS, NODE_RADIUS));
            g.setPaint(new Color(233, 233, 233));
        g.fill(node);
}
}
//1
public class func{
	public void paintOnCanvas(Graphics g){
                    g2.setPaint(GUIConstants.RESIZE_POINT_DOWN_COLOUR);
                    g2.setPaint(GUIConstants.ELEMENT_FILL_COLOUR);
                g2.fill(shape);
                g2.setPaint(GUIConstants.ELEMENT_LINE_COLOUR);
                g2.draw(shape);
                g2.setTransform(prova);
}
}
//2
public class func{
	public void fillTabShape(Graphics2D g2d,Shape shape,boolean isSelected,Rectangle bounds){
        g2d.setPaint(UIUtil.getGradientPaint(bounds.x, bounds.y, TAB_BG_ACTIVE_WND_SELECTED_FROM, bounds.x, (float)bounds.getMaxY(),
                                             TAB_BG_ACTIVE_WND_SELECTED_TO));
        g2d.setPaint(UIUtil.getGradientPaint(bounds.x, bounds.y, TAB_BG_ACTIVE_WND_UNSELECTED_FROM, bounds.x, (float)bounds.getMaxY(), TAB_BG_ACTIVE_WND_UNSELECTED_TO));
      g2d.setPaint(
        UIUtil.getGradientPaint(bounds.x, bounds.y, TAB_BG_PASSIVE_WND_FROM, bounds.x, (float)bounds.getMaxY(), TAB_BG_PASSIVE_WND_TO));
    g2d.fill(shape);
}
}
//3
public class func{
	public void drawLabel(Rendering rendering,String label){
            for (int i = 0; i < labelOutlineAlphas.length; i++) {
                graphics.setStroke(labelOutlineStrokes[i]);
                graphics.setPaint(labelOutlineColors[i]);
                graphics.draw(labelOutline);
            }
            graphics.setPaint(labelFontColor);
            graphics.fill(labelOutline);
            graphics.setPaint(oldPaint);
            graphics.setStroke(oldStroke);
            graphics.setFont(oldFont);
}
}
//4
public class func{
	public void paintProgressBarBorder(final JComponent c,final Graphics2D g2d){
            g2d.setPaint ( new GradientPaint ( 0, shadeWidth, bgTop, 0, c.getHeight () - shadeWidth, bgBottom ) );
            g2d.setPaint ( new GradientPaint ( shadeWidth, 0, bgTop, c.getWidth () - shadeWidth, 0, bgBottom ) );
        g2d.fill ( bs );
        g2d.setPaint ( c.isEnabled () ? this.progressEnabledBorderColor : this.progressDisabledBorderColor );
}
}
//5
public class func{
	public void paintIcon(Component c,Graphics g,int x,int y){
        g2.setPaint(new GradientPaint(0, 0, FROM, ellipse.width, ellipse.height, TO));
        g2.fill(ellipse);
        g2.setPaint(Color.black);
        g2.draw(ellipse);
        g2.setPaint(Color.white);
}
}
//6
public class func{
	public void buildIcon(Set<TrelloLabel.LabelColor> colorSet){
    if (colorSet.isEmpty()) {
      return TasksIcons.Trello;
    }
    Image image = CACHE.get(colorSet);
    if (image == null) {
      BufferedImage bufferedImage = UIUtil.createImage(size, size, BufferedImage.TYPE_INT_ARGB);
      int adjustedSize = size - 1;
      int nStripes = colorSet.size();
      Graphics2D g2d = bufferedImage.createGraphics();
      double diag = adjustedSize * SQRT_2;
      double stripeWidth = diag / nStripes;
      RoundRectangle2D baseRectangle = new RoundRectangle2D.Double(0, 0, adjustedSize, adjustedSize, 2, 2);
      ArrayList<TrelloLabel.LabelColor> colorsList = new ArrayList<TrelloLabel.LabelColor>(colorSet);
      for (int i = 0; i < nStripes; i++) {
        Color color = colorsList.get(i).getColor();
        Area stripe = new Area(new Rectangle2D.Double(-diag / 2, (i * stripeWidth), diag, stripeWidth));
        stripe.transform(AffineTransform.getRotateInstance(-Math.PI / 4, 0, 0));
        stripe.intersect(new Area(baseRectangle));
        g2d.setPaint(color);
        g2d.fill(stripe);
      }
      g2d.setPaint(Color.BLACK);
      g2d.draw(baseRectangle);
      image = bufferedImage;
      CACHE.put(colorSet, image);
    }
    return new ImageIcon(image);
}
}
//7
public class func{
	public void doPaint(Graphics2D g,JComponent c,int width,int height,Object[] extendedCacheKeys){
            if (testValid(0, 0, w, h)) {
                Shape s = shapeGenerator.createRectangle(0, 0, w, h);
                Paint background = createVerticalGradient(s, BACKGROUND);
                g.setPaint(background);
                g.fill(s);
                g.setPaint(STROKE);
                g.draw(s);
            }
}
}
//8
public class func{
	public void draw(final Graphics2D graphics,final Rectangle2D bounds){
      graphics.setPaint( new Color( 225, 225, 225 ) );
      graphics.fill( imageableArea );
      graphics.setPaint( Color.gray );
      graphics.draw( imageableArea );
}
}
//9
public class func{
	public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(SELECTION_COLOR);
        g2d.fill(selectionRectangle);
        g2d.setPaint(SELECTION_COLOR_OUTLINE);
        g2d.draw(selectionRectangle);
}
}
//10
public class func{
	public void paintComponent(final Graphics g){
                final Shape border = createBorderShape ();
                GraphicsUtils.drawShade ( g2d, border, WebCustomTooltipStyle.shadeColor, shadeWidth );
                g2d.setPaint ( bg );
                g2d.fill ( border );
                g2d.setPaint ( Color.WHITE );
                g2d.draw ( border );
                GraphicsUtils.restoreAntialias ( g2d, aa );
}
}
//11
public class func{
	public void paintComponent(Graphics g){
                g2.setPaint(GUIConstants.SELECTION_FILL_COLOUR);
                g2.fill(shape);
                g2.setPaint(GUIConstants.SELECTION_LINE_COLOUR);
                g2.draw(shape);
}
}
//12
public class func{
	public void paintComponent(final Graphics g){
        g2.setPaint(this.paint);
        g2.fill(area);
        g2.setPaint(Color.BLACK);
        g2.draw(area);
}
}
//13
public class func{
	public void paintBackground(Graphics2D g,int width,int height){
            g.setPaint(SkinColors.LIGHT_BACKGROUND_COLOR);
            g.fill(s);
            g.setPaint(SkinColors.GENERAL_BORDER_COLOR);
            g.draw(s);
}
}
//14
public class func{
	public void paintComponent(Graphics g){
                g2.setPaint(GUIConstants.ELEMENT_FILL_COLOUR);
                g2.fill(shape);
                g2.setPaint(GUIConstants.ELEMENT_LINE_COLOUR);
                g2.draw(shape);
}
}
//15
public class func{
	public void paint(Graphics g){
    g2.setPaint(paint);
    g2.fill(s);
    g2.setPaint(Color.white);
    g2.draw(s);
}
}
//16
public class func{
	public void paintIcyBackGround(int width,int height,Graphics g){
        g2.setPaint(new GradientPaint(0, 0, Color.white.darker(), 0, height / 1.5f, Color.black));
        g2.fill(roundRect);
        g2.setPaint(Color.black);
        g2.setColor(Color.black);
        mixAlpha(g2, AlphaComposite.SRC_OVER, 1f / 3f);
        g2.fillOval(-width + (width / 2), height / 2, width * 2, height);
        mixAlpha(g2, AlphaComposite.SRC_OVER, 3f / 1f);
}
}
//17
public class func{
	public void doPaint(Graphics2D g,X object,int width,int height){
            g.setClip(0,0,width,height-1);
        g.setPaint(this.topBevelBackground);
        g.fillRoundRect(10, 0, width-2-20, 20, 20, 20);
        g.setPaint(this.topBevelBorder);
        g.drawRoundRect(10, 0, width-2-20, 20, 20, 20);
        g.setPaint(background);
        g.fill(this.tabAreaCache);
}
}
//18
public class func{
	public void fillNormalGradient(Graphics2D g2d,Shape s,Color startColor,Color endColor,boolean isVertical){
        Paint old = g2d.getPaint();
        g2d.setPaint(paint);
        g2d.fill(s);
        g2d.setPaint(old);
}
}
//19
public class func{
	public void paintThumb(final Graphics g){
                g2d.setPaint ( new GradientPaint ( 0, thumbRect.y, thumbBgTop, 0, thumbRect.y + thumbRect.height, thumbBgBottom ) );
                g2d.setPaint ( new GradientPaint ( thumbRect.x, 0, thumbBgTop, thumbRect.x + thumbRect.width, 0, thumbBgBottom ) );
            g2d.fill ( ts );
}
}
//20
public class func{
	public void paintNodes(Graphics2D g,int height){
          g.setPaint(SwingTools.makeYellowPaint(NODE_RADIUS, NODE_RADIUS));
          g.setPaint(SwingTools.makeBluePaint(NODE_RADIUS, NODE_RADIUS));
        g.fill(node);
}
}
//21
public class func{
	public void paintBackground(final Graphics2D g2d,final Rectangle bounds,final E c,final Shape backgroundShape){
            g2d.setPaint ( LafUtils.getWebGradientPaint ( 0, bgBounds.y, 0, bgBounds.y + bgBounds.height ) );
            g2d.setPaint ( c.getBackground () );
        g2d.fill ( backgroundShape );
}
}
//22
public class func{
	public void paintComponent(Graphics graphics){
        Paint oldPaint = g.getPaint();
        g.setPaint(COLOR_BACKGROUND);
        g.fill(clipBounds);
        g.setPaint(oldPaint);
}
}
//23
public class func{
	public void paintComponent(Graphics graphics){
        Paint oldPaint = g.getPaint();
        g.setPaint(Color.WHITE);
        g.fill(clipBounds);
        g.setPaint(oldPaint);
}
}
//24
public class func{
	public void draw(Graphics2D g2,Rectangle2D area){
        g2.setPaint(createTransformedGradient(area));
        g2.fill(area);
        g2.setPaint(saved);
}
}
//25
public class func{
	public void drawZoomRectangle(ChartPanel panel,Graphics2D g2,boolean xor){
            if (panel.getFillZoomRectangle()) {
                g2.setPaint(panel.getZoomFillPaint());
                g2.fill(this.zoomRectangle);
            }
            else {
                g2.setPaint(panel.getZoomOutlinePaint());
                g2.draw(this.zoomRectangle);
            }
}
}
//26
public class func{
	public void paintColorFontOutline(Graphics2D g2,String str,float x,float y,Color color){
        g2.setPaint(Color.BLACK);
        if (RenderingHints.VALUE_TEXT_ANTIALIAS_ON.equals(g2.getRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING))) {
            TextLayout layout = new TextLayout(str, g2.getFont(), g2.getFontRenderContext());
            Rectangle2D b = layout.getBounds();
            b.setRect(x + b.getX() - 0.75, y + b.getY() - 0.75, b.getWidth() + 1.5, b.getHeight() + 1.5);
            g2.fill(b);
        } else {
            g2.drawString(str, x - 1f, y - 1f);
            g2.drawString(str, x - 1f, y);
            g2.drawString(str, x - 1f, y + 1f);
            g2.drawString(str, x, y - 1f);
            g2.drawString(str, x, y + 1f);
            g2.drawString(str, x + 1f, y - 1f);
            g2.drawString(str, x + 1f, y);
            g2.drawString(str, x + 1f, y + 1f);
        }
        g2.setPaint(color);
        g2.drawString(str, x, y);
}
}
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
//28
public class func{
	public void drawEtchedShape(final Graphics2D g2d,final BufferedImage topBg,final BufferedImage bottomBg,final Shape fullShape,final Shape bevelShape){
        g2d.setPaint ( new TexturePaint ( bottomBg,
                new Rectangle ( bounds.getLocation (), new Dimension ( bottomBg.getWidth (), bottomBg.getHeight () ) ) ) );
        g2d.fill ( bevelShape );
        GraphicsUtils.drawShade ( g2d, bevelShape, Color.BLACK, 4 );
        g2d.setClip ( oldClip );
        g2d.setPaint ( Color.DARK_GRAY );
        g2d.draw ( bevelShape );
        GraphicsUtils.restoreAntialias ( g2d, aa );
}
}
//29
public class func{
	public void paintOverlay(Graphics2D g2,ChartPanel chartPanel){
                g2.setPaint(fillPaint);
                g2.fill(box);
                g2.setStroke(outlineStroke);
                g2.setPaint(outlinePaint);
                g2.draw(box);
                g2.drawString(String.format("x = %.3f", dataPoint.getX()), (int) (dataArea.getX() + 5 + 5), (int) (dataArea.getY() + 5 + 20));
}
}
//30
public class func{
	public void paintSafely(Graphics g){
            g2d.setStroke(new BasicStroke(shadeWidth * 2));
            g2d.setPaint(Color.LIGHT_GRAY);
            g2d.draw(border);
            g2d.setStroke(os);
            g2d.setPaint(Color.WHITE);
            g2d.fill(border);
}
}
//31
public class func{
	public void draw(Graphics2D g2,DialPlot plot,Rectangle2D frame,Rectangle2D view){
        g2.setPaint(Color.LIGHT_GRAY);
        g2.fill(area1);
        g2.setStroke(this.stroke);
        g2.setPaint(this.foregroundPaint);
        g2.draw(outerWindow);
}
}
//32
public class func{
	public void paintOverlay(Graphics2D g2,ChartPanel chartPanel){
                g2.setPaint(fillPaint);
                g2.fill(ellipse);
                g2.setStroke(outlineStroke);
                g2.setPaint(outlinePaint);
                g2.draw(ellipse);
}
}
//33
public class func{
	public void draw(Graphics2D g2,DialPlot plot,Rectangle2D frame,Rectangle2D view){
        g2.setPaint(this.backgroundPaint);
        g2.fill(area);
        g2.setStroke(this.stroke);
        g2.setPaint(this.foregroundPaint);
        g2.draw(e);
}
}
//34
public class func{
	public void doPaint(Graphics2D g,JComponent c,int width,int height,Object[] extendedCacheKeys){
        if (testValid(0, 0, width, height)) {
            Shape s = shapeGenerator.createRectangle(0, 0, width, height);
            g.setPaint(getScrollBarTrackPaint(s));
            g.fill(s);

            g.setColor(SkinColors.SCROLL_TRACK_BORDER_COLOR);
            g.draw(s);
        }
}
}
//35
public class func{
	public void createPrettyImage(final BufferedImage bufferedImage,final int shadeWidth,final int round){
        final Shape old = g2d.getClip ();
        g2d.setClip ( border );
        g2d.drawImage ( bufferedImage, shadeWidth, shadeWidth, null );
        g2d.setClip ( old );
        GraphicsUtils.drawShade ( g2d, border, StyleConstants.shadeColor, shadeWidth );
        g2d.setPaint ( new LinearGradientPaint ( 0, shadeWidth, 0, height - shadeWidth, new float[]{ 0f, 0.5f, 1f },
                new Color[]{ new Color ( 125, 125, 125, 48 ), new Color ( 125, 125, 125, 0 ), new Color ( 125, 125, 125, 48 ) } ) );
        g2d.fill ( border );
        g2d.setColor ( Color.GRAY );
        g2d.draw ( border );
        g2d.dispose ();
}
}
//36
public class func{
	public void drawHistogram(Graphics2D g2d){
                for (int i = 0; i < histoRect.width; i++) {
                    final int binIndex = (int) Math.floor(minViewBinIndex + i * binsPerPixel);
                    double binHeight = 0.0;
                    if (binIndex >= 0 && binIndex < histogramBins.length) {
                        final double counts = histogramBins[binIndex];
                        binHeight = countsScale * counts;
                    }
                    if (binHeight >= histoRect.height) {
                        // must crop here because on highly centered histograms this value is FAR beyond the rectangle
                        // and then triggers an exception when trying to draw it.
                        binHeight = histoRect.height - 1;
                    }
                    r.setRect(histoRect.x + i, histoRect.y + histoRect.height - 1 - binHeight, 1.0, binHeight);
                    g2d.fill(r);
                }
            g2d.setPaint(oldPaint);
}
}
//37
public class func{
	public void paint(final Graphics2D g2d,final Rectangle bounds,final E button){
        g2d.setPaint ( enabled ? ( pressed ? pressedBackgroundColor : ( rollover ? rolloverBackgroundColor : backgroundColor ) ) :
                disabledBackgroundColor );
        g2d.fill ( shape );
                enabled ? ( pressed ? pressedBorderColor : ( rollover ? rolloverBorderColor : borderColor ) ) : disabledBorderColor );
}
}
//38
public class func{
	public void paintBarShadow(Graphics2D g2,BarRenderer renderer,int row,int column,RectangularShape bar,RectangleEdge base,boolean pegShadow){
        Paint itemPaint = renderer.getItemPaint(row, column);
        if (itemPaint instanceof Color) {
            Color c = (Color) itemPaint;
            if (c.getAlpha() == 0) {
                return;
            }
        }
        RectangularShape shadow = createShadow(bar, renderer.getShadowXOffset(),
                renderer.getShadowYOffset(), base, pegShadow);
        g2.setPaint(renderer.getShadowPaint());
        g2.fill(shadow);
}
}
//39
public class func{
	public void paintContourBackground(Graphics g,Component comp,int width,int height,Shape contour,boolean isFocused,SubstanceColorScheme fillScheme,boolean hasShine){
    for (int i = 0; i < this.fractions.length; i++) {
      ColorSchemeSingleColorQuery colorQuery = this.colorQueries[i];
      fillColors[i] = colorQuery.query(fillScheme);
    }
    MultipleGradientPaint gradient = new LinearGradientPaint(0, 0, 0,
        height, this.fractions, fillColors, CycleMethod.REPEAT);
    graphics.setPaint(gradient);
    graphics.fill(contour);
    graphics.dispose();
}
}
//40
public class func{
	public void create3LightsHousingImage(final int WIDTH,final int HEIGHT){
        G2.setPaint(new Color(0.2f, 0.2f, 0.2f, 0.5f));
        G2.fill(FRAME);
        G2.dispose();
}
}
//41
public class func{
	public void draw(Graphics2D g2,DialPlot plot,Rectangle2D frame,Rectangle2D view){
        if (p instanceof GradientPaint) {
            p = this.gradientPaintTransformer.transform((GradientPaint) p,
                    view);
        }
        g2.setPaint(p);
        g2.fill(view);
}
}
//42
public class func{
	public void paintBar(Graphics2D g2,BarRenderer renderer,int row,int column,RectangularShape bar,RectangleEdge base){
        if (t != null && itemPaint instanceof GradientPaint) {
            itemPaint = t.transform((GradientPaint) itemPaint, bar);
        }
        g2.setPaint(itemPaint);
        g2.fill(bar);
}
}
//43
public class func{
	public void draw(Graphics2D g2,Rectangle2D area){
        if (this.fillPaint != null) {
            g2.setPaint(this.fillPaint);
            g2.fill(ellipse);
        }
}
}
//44
public class func{
	public void draw(Graphics2D g2,Rectangle2D area,Object params){
        if (this.backgroundPaint != null) {
            g2.setPaint(this.backgroundPaint);
            g2.fill(area);
        }
        area = trimPadding(area);
        return this.container.draw(g2, area, params);
}
}
//45
public class func{
	public void drawSelectionShape(Graphics2D g2,boolean xor){
               if (this.selectionFillPaint != null) {
                    g2.setPaint(this.selectionFillPaint);
                    g2.fill(this.selectionShape);
               }
}
}
//46
public class func{
	public void draw(Graphics2D graphics2D){
            if (tpi.fillPaint != null) {
                graphics2D.setPaint(tpi.fillPaint);
                graphics2D.fill(tShape);
            }
}
}
//47
public class func{
	public void draw(Graphics2D g2,float x,float y,RectangleAnchor anchor){
        if (this.backgroundPaint != null) {
            g2.setPaint(this.backgroundPaint);
            g2.fill(bounds);
        }
}
}
//48
public class func{
	public void paint(Graphics2D g2d){
        if (paint != null) {
            g2d.setPaint(paint);
            g2d.fill(shape);
        }
}
}
//49
public class func{
	public void defaultDisplay(Graphics2D g2,Shape shape){
        if (this.fillPaint != null) {
            g2.setPaint(this.fillPaint);
            g2.fill(shape);
        }
}
}
//50
public class func{
	public void paintIcon(Component c,Graphics g,int x,int y){
              if (fillPaint != null) {
                  g2.setPaint(fillPaint);
                  g2.fill(path);
              }
}
}
//51
public class func{
	public void create_POI_Image(final int WIDTH){
        final java.awt.RadialGradientPaint GRADIENT = new java.awt.RadialGradientPaint(CENTER, (int) (WIDTH / 2.0), FRACTIONS, COLORS);
        G2.setPaint(GRADIENT);
        G2.fill(BLIP);
        G2.dispose();
}
}
//52
public class func{
	public void draw(Graphics2D g2,DialPlot plot,Rectangle2D frame,Rectangle2D view){
        Rectangle2D f = DialPlot.rectangleByRadius(frame, this.radius,
                this.radius);
        Ellipse2D e = new Ellipse2D.Double(f.getX(), f.getY(), f.getWidth(),
                f.getHeight());
        g2.fill(e);
        g2.setPaint(this.outlinePaint);
        g2.setStroke(this.outlineStroke);
        g2.draw(e);
}
}
//53
public class func{
	public void paintBar(Graphics2D g,JComponent c,int width,int height){
        if (testValid(x, y, width, height)) {
            Shape s = shapeGenerator.createRectangle(x, y, width, height);
            g.setPaint(getProgressBarPaint(s));
            g.fill(s);
            
            g.setPaint(getProgressBarBorderPaint());
            g.draw(s);
        }
}
}
//54
public class func{
	public void doPaint(Graphics2D g,JComponent c,int width,int height,Object[] extendedCacheKeys){
        if (testValid(0, 0, width - 1, height - 1)) {
            Shape s = shapeGenerator.createRectangle(0, 0, width, height);
            g.setPaint(getTableHeaderPaint(s));
            g.fill(s);

            paintBorder(g, width, height);
        }
}
}
//55
public class func{
	public void paintBox(Graphics2D g,int width,int height){
        if (testValid(0, 0, width - 1, height)) {
            Shape s = shapeGenerator.createRectangle(0, 0, width - 1, height);

            g.setPaint(getScrollBarButtonBoxPaint(s));
            g.fill(s);

            g.setPaint(getScrollBarButtonBoxBorderColor());
            g.draw(s);
        }
}
}
//56
public class func{
	public void drawPaint(double x,double y){
    Graphics2D gg = (Graphics2D) imgg.create();
    gg.translate(x, y);
    gg.setPaint(paint);
    gg.fill(brush);
    gg.dispose();
}
}
//57
public class func{
	public void createRedOnImage(final int WIDTH,final int HEIGHT){
        G2.setPaint(new RadialGradientPaint(new Point2D.Double(0.5 * IMAGE_WIDTH, 0.1906474820143885 * IMAGE_HEIGHT), (0.5153061224489796f * IMAGE_WIDTH), new float[]{0.0f, 1.0f}, new Color[]{new Color(1f, 0f, 0f, 1f), new Color(0.4627450980f, 0.0196078431f, 0.0039215686f, 0f)}));
        G2.fill(GLOW);
        G2.dispose();
}
}
//58
public class func{
	public void create_BEAM_Image(final int WIDTH){
        final Ellipse2D BEAM_AREA = new Ellipse2D.Double(IMAGE_WIDTH * 0.08411215245723724, IMAGE_HEIGHT * 0.08411215245723724, IMAGE_WIDTH * 0.8317756652832031, IMAGE_HEIGHT * 0.8317756652832031);
        final ConicalGradientPaint BEAM_GRADIENT = new ConicalGradientPaint(true, BEAM_CENTER, 0, BEAMAREA_FRACTIONS, BEAMAREA_COLORS);
        G2.setPaint(BEAM_GRADIENT);
        G2.fill(BEAM_AREA);
        G2.dispose();
}
}
//59
public class func{
	public void paintIndeterminateBar(Graphics2D g,int width,int height){
        if (testValid(0, 0, width, height)) {
            Shape s = shapeGenerator.createProgressBarIndeterminatePattern(0, 0, width, height);
            g.setPaint(getProgressBarIndeterminatePaint(s));
            g.fill(s);
        }
}
}
//60
public class func{
	public void createImageShade(final int w,final int h,final Shape shape,final int shadeWidth,final float shadeOpacity,final Color clearColor){
        final BufferedImage bi = createCompatibleImage ( width, width, Transparency.TRANSLUCENT );
        final Graphics2D ig = bi.createGraphics ();
        GraphicsUtils.setupAntialias ( ig );
        ig.translate ( shadeWidth, shadeWidth );
        ig.setPaint ( Color.BLACK );
        ig.fill ( shape );
        ig.dispose ();
}
}
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
//62
public class func{
	public void createRedOffImage(final int WIDTH,final int HEIGHT){
        final TexturePaint HATCH_PAINT = new TexturePaint(HATCH_TEXTURE, new java.awt.Rectangle(0, 0, 2, 2));
        G2.setPaint(HATCH_PAINT);
        G2.fill(INNER_SHADOW);
        G2.dispose();
}
}
//63
public class func{
	public void createOffImage(final int WIDTH,final int HEIGHT){
        final LinearGradientPaint GLAS_PAINT = new LinearGradientPaint(new Point2D.Double(0.5 * IMAGE_WIDTH, 0.2894736842105263 * IMAGE_HEIGHT), new Point2D.Double(0.5 * IMAGE_WIDTH, 0.7017543859649122 * IMAGE_HEIGHT), new float[]{0.0f, 0.99f, 1.0f}, new Color[]{new Color(0.9333333333f, 0.9333333333f, 0.9333333333f, 1f), new Color(0.6f, 0.6f, 0.6f, 1f), new Color(0.6f, 0.6f, 0.6f, 1f)});
        G2.setPaint(GLAS_PAINT);
        G2.fill(GLAS);
}
}
//64
public class func{
	public void create_MAIN_POINTER_SHADOW_Image(final int WIDTH){
        G2.setPaint(SHADOW_COLOR);
        G2.fill(STOPWATCHPOINTER);
        G2.dispose();
}
}
//65
public class func{
	public void create_SMALL_POINTER_SHADOW_Image(final int WIDTH){
        G2.setPaint(SHADOW_COLOR);
        G2.fill(STOPWATCHPOINTERSMALL);
        G2.dispose();
}
}
//66
public class func{
	public void createImageShade(final int w,final int h,final Shape shape,final int shadeWidth,final float shadeOpacity,final Color clearColor){
            g2d.setComposite ( AlphaComposite.getInstance ( AlphaComposite.SRC_IN ) );
            g2d.setPaint ( clearColor );
            g2d.fill ( shape );
            g2d.dispose ();
}
}
//67
public class func{
	public void paintLayer(Graphics2D g2,JXLayer<? extends JComponent> layer){
  g2.setPaint(createPaint(drawGlass, false));
  g2.fill(drawGlass);
  g2.setColor(oldColor);
  g2.draw(drawGlass);
  AffineTransform oldTransform = g2.getTransform();
  Shape oldClip = g2.getClip();
  g2.scale(scale, scale);
  g2.clip(clipGlass);
}
}
//68
public class func{
	public void createRedOnImage(final int WIDTH,final int HEIGHT){
        final int IMAGE_WIDTH = IMAGE.getWidth();
        final int IMAGE_HEIGHT = IMAGE.getHeight();
        final Ellipse2D LIGHT_ON = new Ellipse2D.Double(0.17346938775510204 * IMAGE_WIDTH, 0.07553956834532374 * IMAGE_HEIGHT, 0.6530612244897959 * IMAGE_WIDTH, 0.2302158273381295 * IMAGE_HEIGHT);
        G2.setPaint(new RadialGradientPaint(new Point2D.Double(0.5 * IMAGE_WIDTH, 0.1906474820143885 * IMAGE_HEIGHT), (0.32653061224489793f * IMAGE_WIDTH), new float[]{0.0f, 1.0f}, new Color[]{new Color(1f, 0f, 0f, 1f), new Color(0.2549019608f, 0f, 0.0156862745f, 1f)}));
        G2.fill(LIGHT_ON);
}
}
//69
public class func{
	public void draw(Graphics2D graphics,IProgressMonitor monitor){
        graphics.setPaint(new Color(fillColor.getRed(), fillColor.getGreen(), fillColor.getBlue(),
                fillAlpha));
        graphics.fill(shape);
        BasicStroke stroke = new BasicStroke(lineWidth);
        graphics.setStroke(stroke);
}
}
//70
public class func{
	public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(PASTE_COLOR);
        g2d.fill(pasteRectangle);
        g2d.setXORMode(PASTE_COLOR_OUTLINE);
        g2d.draw(pasteRectangle);
}
}
//71
public class func{
	public void paintBodyOval(DisplayedGem displayedGem,Paint paint,Graphics2D g2d){
        Object oldAntiAliasRenderingHint = g2d.getRenderingHint(RenderingHints.KEY_ANTIALIASING);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setPaint(paint);
        g2d.fill(bodyShape);
        g2d.setColor(Color.black);
        g2d.draw(bodyShape);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, oldAntiAliasRenderingHint);
}
}
//72
public class func{
	public void create3LightsHousingImage(final int WIDTH,final int HEIGHT){
        G2.setPaint(new Color(0.8f, 0.8f, 0.8f, 0.5f));
        G2.fill(BACKGROUND);
}
}
//73
public class func{
	public void paintShapeNode_0_0_0_0_0(Graphics2D g){
    g.setPaint(new Color(255, 255, 255, 0));
    g.fill(shape0);
}
}
//74
public class func{
	public void draw(final Element element,final Graphics2D graphics2D){
      final Color overlapErrorColor = WorkspaceSettings.getInstance().getOverlapErrorColor();
        new Color( overlapErrorColor.getRed(), overlapErrorColor.getGreen(), overlapErrorColor.getBlue(), 64 );
      graphics2D.setPaint( highLight );
      graphics2D.fill( elementBounds );
}
}
//75
public class func{
	public void paintShapeNode_0_0_1_0_0(Graphics2D g){
    g.setPaint(new Color(0, 0, 0, 255));
    g.fill(shape1);
}
}
//76
public class func{
	public void paintShapeNode_0_0_0_0_0_0(Graphics2D g){
        g.setPaint(new LinearGradientPaint(new Point2D.Double(128.79100036621094, 96.28410339355469), new Point2D.Double(180.23699951171875, 96.28410339355469), new float[]{0.0f, 1.0f}, new Color[]{new Color(255, 255, 255, 255), new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f)));
        g.fill(shape0);
}
}
//77
public class func{
	public void paintShapeNode_0_0_0_1_0_0(Graphics2D g){
        g.setPaint(new LinearGradientPaint(new Point2D.Double(165.31300354003906, 114.6709976196289), new Point2D.Double(165.31300354003906, 76.6259994506836), new float[]{0.0f, 1.0f}, new Color[]{new Color(106, 163, 213, 255), new Color(80, 118, 177, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(3.884321928024292f, 0.0f, 0.0f, 3.8868143558502197f, -500.1821594238281f, 269.76171875f)));
        g.fill(shape1);
}
}
//78
public class func{
	public void paintHandles(Graphics2D g2d,AffineTransform transform){
            for (Point2D point : handlePtArray) {
                g2d.fill(new Rectangle2D.Double(point.getX() - halfSize, point.getY() - halfSize, size, size));
            }
            g2d.setPaint(Color.white);
}
}
//79
public class func{
	public void paintShapeNode_0_0_0_1_0_1(Graphics2D g){
        g.setPaint(new LinearGradientPaint(new Point2D.Double(143.79100036621094, 114.55899810791016), new Point2D.Double(143.79100036621094, 76.61710357666016), new float[]{0.0f, 1.0f}, new Color[]{new Color(99, 186, 112, 255), new Color(29, 168, 56, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(3.884321928024292f, 0.0f, 0.0f, 3.8868143558502197f, -500.1821594238281f, 269.76171875f)));
        g.fill(shape2);
}
}
//80
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
            // save the old transformation
            final AffineTransform oldTransform = g2d.getTransform();
            g2d.transform(AffineTransform.getRotateInstance(Math.PI / 2));
            g2d.drawString(text, 3 + 0.5f * SLIDER_HEIGHT, 0.35f * FONT_SIZE);
            // restore the old transformation
            g2d.setTransform(oldTransform);

            g2d.translate(-sliderPos, 0.0);
        }
        g2d.translate(-sliderBaseLineRect.x, -sliderBaseLineRect.y);
}
}
//81
public class func{
	public void draw(Graphics2D g2,float x,float y,RectangleAnchor anchor){
            Rectangle2D shadow = new Rectangle2D.Double(xx + this.shadowXOffset,
                    yy + this.shadowYOffset, bounds.getWidth(), 
                    bounds.getHeight());
            g2.setPaint(this.shadowPaint);
            g2.fill(shadow);
}
}
//82
public class func{
	public void draw(final Graphics2D graphics,final Rectangle2D area){
      g2.setPaint( Color.white );
      g2.fill( area );
    g2.translate( -area.getX(), -area.getY() );
        StrictGeomUtility.createBounds( area.getX(), area.getY(), area.getWidth(), area.getHeight() );
}
}
//83
public class func{
	public void paintComponent(Graphics g){
    g2d.setPaint(new RadialGradientPaint(this.getWidth() / 2 - RADIUS / 4,
        this.ballY - RADIUS / 5, RADIUS + RADIUS / 4, new float[] {
            0.0f, 1.0f }, new Color[] { Color.green,
            Color.green.darker().darker() }));
    g2d.fill(shape);
}
}
//84
public class func{
	public void paintIconBackground(final Graphics2D g2d,final int x,final int y){
        g2d.setPaint ( new RadialGradientPaint ( cx, cy, radius, fractions, getBgColors () ) );
        g2d.fill ( shape );
        final Stroke os = GraphicsUtils.setupStroke ( g2d, borderStroke );
}
}
//85
public class func{
	public void paintIcon(final Component c,final Graphics2D g2d,final int x,final int y,final int w,final int h){
                g2d.setPaint ( new RadialGradientPaint ( center, radius, fractions, cb.isEnabled () ? colors : disabledColors ) );
                g2d.fill ( shape );
}
}
//86
public class func{
	public void drawHighlight(Graphics2D g,float x,float y,Color highlightColor){
        g.fill(new Ellipse2D.Double(x - HIGHLIGHT_RADIUS / 2f, y - HIGHLIGHT_RADIUS / 2f, HIGHLIGHT_RADIUS, HIGHLIGHT_RADIUS));
        g.setPaint(oldPaint);
}
}
//87
public class func{
	public void paint(Graphics2D g2d,AffineTransform transform){
                        g2d.fill(drawingShape);
        g2d.setPaint(oldPaint);
        g2d.setStroke(oldStroke);
}
}
//88
public class func{
	public void drawEtchedShape(final Graphics2D g2d,final BufferedImage topBg,final BufferedImage bottomBg,final Shape fullShape,final Shape bevelShape){
        g2d.setPaint ( new TexturePaint ( topBg,
                new Rectangle ( bounds.getLocation (), new Dimension ( topBg.getWidth (), topBg.getHeight () ) ) ) );
        g2d.fill ( fullShape );
        final Shape oldClip = g2d.getClip ();
        final Area newClip = new Area ( oldClip );
}
}
//89
public class func{
	public void draw(Graphics2D graphics,MapContent map,MapViewport viewport){
            Graphics2D localGraphics = (Graphics2D) graphics.create();
            localGraphics.setPaint(Color.WHITE);
            localGraphics.fill(SCREEN);
}
}
//90
public class func{
	public void paint(Graphics g){
            Graphics2D g2d = (Graphics2D)g;
            g2d.setPaint(paint);
            g2d.fill(lensShape);
}
}
//91
public class func{
	public void paintBackgroundDefaultAndMouseOver(Graphics2D g){
    g.setPaint(lowerBorder);
    g.fill(roundRect);
    roundRect = innerBorderRect();
}
}
//92
public class func{
	public void paintBackgroundDefaultAndFocused(Graphics2D g){
    g.setPaint(focusBorder);
    g.fill(roundRect);
    roundRect = innerBorderRect();
}
}
//93
public class func{
	public void paintBackgroundDefaultAndPressed(Graphics2D g){
    g.setPaint(focusBorder);
    g.fill(roundRect);
    roundRect = innerBorderRect();
}
}
//94
public class func{
	public void paintBackgroundDefaultAndPressed(Graphics2D g){
    g.setPaint(innerBorderPressed);
    g.fill(roundRect);
    roundRect = innerFillRect();
}
}
//95
public class func{
	public void paintBackgroundDefaultAndMouseOver(Graphics2D g){
    g.setPaint(innerBorderMouseOver);
    g.fill(roundRect);
    roundRect = innerFillRect();
}
}
//96
public class func{
	public void paintBackgroundDefaultAndFocused(Graphics2D g){
    g.setPaint(innerBorder);
    g.fill(roundRect);
    roundRect = innerFillRect();
}
}
//97
public class func{
	public void drawWord(EngineWord word,Color color){
        Graphics2D g2 = ((PGraphicsJava2D)destination).g2;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setPaint(color);
        g2.fill(path2d);
}
}
//98
public class func{
	public void cutImage(final Shape shape,final Image image){
        final int w = image.getWidth ( null );
        final int h = image.getHeight ( null );
        final BufferedImage cutImage = createCompatibleImage ( w, h, Transparency.TRANSLUCENT );
        final Graphics2D g2d = cutImage.createGraphics ();
        GraphicsUtils.setupAntialias ( g2d );
        g2d.setPaint ( Color.WHITE );
        g2d.fill ( shape );
}
}
//99
public class func{
	public void paintLayer(Graphics2D g2,JXLayer<? extends JComponent> layer){
  g2.setPaint(createPaint(drawGlass, true));
  g2.fill(drawGlass);
}
}
//100
public class func{
	public void paintBackgroundEnabledAndPressed(Graphics2D g){
    rect = decodeRect2();
    g.setPaint(decodeGradient4(rect));
    g.fill(rect);
}
}
//101
public class func{
	public void paintBackgroundEnabledAndMouseOver(Graphics2D g){
    rect = decodeRect2();
    g.setPaint(decodeGradient3(rect));
    g.fill(rect);
}
}
//102
public class func{
	public void draw(Graphics2D g2,Rectangle2D chartArea,Point2D anchor,ChartRenderingInfo info){
                int row = entity.getDataset().getRowIndex(entity.getRowKey());
                int column = entity.getDataset().getColumnIndex(entity.getColumnKey());
                java.awt.Color baseColor = (java.awt.Color) renderer.getItemPaint(row, column);
                g2.setPaint(baseColor);
                g2.fill(area);
}
}
//103
public class func{
	public void fill(PDFRenderer state,Graphics2D g,GeneralPath s){
        g.setPaint(this.mainPaint);
        g.fill(s);
        return s.createTransformedShape(g.getTransform()).getBounds2D();
}
}
//104
public class func{
	public void paintBackground(Graphics2D g,int width,int height,Color color){
            g.setPaint(color);
            g.fill(s);
}
}
//105
public class func{
	public void paintComponent(Graphics g){
        g2d.fill ( getProgressShape ( usedMemory, true ) );
        g2d.setPaint ( usedBorderColor );
}
}
//106
public class func{
	public void paintBackgroundSelectedAndPressedAndFocused(Graphics2D g){
    g.setPaint(color37);
    g.fill(path);
}
}
//107
public class func{
	public void paintForegroundMouseOver(Graphics2D g){
    path = decodePath6();
    g.setPaint(decodeGradient9(path));
    g.fill(path);
}
}
//108
public class func{
	public void paintComponent(Graphics g){
            g2.setPaint(GUIConstants.SELECTION_FILL_COLOUR);
            g2.fill(noteRect);
}
}
//109
public class func{
	public void paintBackgroundDefaultAndPressed(Graphics2D g){
    g.setPaint(innerFillPressed);
    g.fill(roundRect);
}
}
//110
public class func{
	public void paintBackgroundDefaultAndMouseOver(Graphics2D g){
    g.setPaint(innerFillMouseOver);
    g.fill(roundRect);
}
}
//111
public class func{
	public void paintBackgroundDefaultAndFocused(Graphics2D g){
    g.setPaint(innerFillFocused);
    g.fill(roundRect);
}
}
//112
public class func{
	public void render(Graphics2D g,VisualItem item){
            g.setPaint(ColorLib.getColor(item.getFillColor()));
            g.fill(m_curArrow);
}
}
//113
public class func{
	public void paintSelectedTab(Graphics2D g,int width,int height){
            g.setPaint(SkinColors.LIGHT_BACKGROUND_COLOR);
            g.fill(s);
            paintBorder(g, width, height);
}
}
//114
public class func{
	public void drawVehicle(Graphics2D g,double simulationTime,RoadMapping roadMapping,Vehicle vehicle){
        g.setPaint(vehicleColor(vehicle, simulationTime));
        g.fill(vehiclePath);
}
}
//115
public class func{
	public void drawSelectionRectangle(Graphics2D g2){
        g2.setPaint(this.selectionFillPaint);
        g2.fill(selectionRectangle);
}
}
//116
public class func{
	public void draw(Graphics2D graphics,MapContent map,MapViewport viewport){
            localGraphics.setPaint(Color.BLACK);
            localGraphics.fill(inner);
}
}
//117
public class func{
	public void paintBackgroundSelectedAndFocused(Graphics2D g){
    g.setPaint(color37);
    g.fill(path);
}
}
//118
public class func{
	public void paintBackgroundDisabled(Graphics2D g){
    rect = decodeRect2();
    g.setPaint(decodeGradient2(rect));
    g.fill(rect);
}
}
//119
public class func{
	public void paintForegroundDisabledAndFinished(Graphics2D g){
    g.setPaint(color33);
    g.fill(path);
}
}
//120
public class func{
	public void paintForegroundDisabled(Graphics2D g){
    g.setPaint(color33);
    g.fill(path);
}
}
//121
public class func{
	public void paintForegroundEnabledAndFinished(Graphics2D g){
    g.setPaint(color17);
    g.fill(path);
}
}
//122
public class func{
	public void paintForegroundDisabled(Graphics2D g){
    g.setPaint(color30);
    g.fill(path);
}
}
//123
public class func{
	public void paintMultiselector(final Graphics2D g2d){
            g2d.fill ( getSelectionShape ( fsb, true ) );
            g2d.setPaint ( selectorBorderColor );
}
}
//124
public class func{
	public void paintBackgroundMouseOverAndEditable(Graphics2D g){
    g.setPaint(color53);
    g.fill(rect);
}
}
//125
public class func{
	public void paintBackgroundFocusedAndEditable(Graphics2D g){
    g.setPaint(color26);
    g.fill(path);
}
}
//126
public class func{
	public void paintForegroundEnabled(Graphics2D g){
    path = decodePath5();
    g.setPaint(decodeGradient9(path));
    g.fill(path);
}
}
//127
public class func{
	public void paintBackgroundDisabled(Graphics2D g){
    g.setPaint(outerBorderDisabled);
    g.fill(roundRect);
    roundRect = innerBorderRect();
}
}
//128
public class func{
	public void paintBackgroundDisabled(Graphics2D g){
    g.setPaint(innerFillDisabled);
    g.fill(roundRect);
}
}
//129
public class func{
	public void paintBackgroundDisabled(Graphics2D g){
    g.setPaint(innerBorderDisabled);
    g.fill(roundRect);
    roundRect = innerFillRect();
}
}
//130
public class func{
	public void drawCustomWebBorder(final Graphics2D g2d,final JComponent component,final Shape borderShape,final Color shadeColor,final int shadeWidth,final boolean fillBackground,final boolean webColored,final Color border,final Color disabledBorder,final Color backgroundColor){
                g2d.setPaint ( backgroundColor );
                g2d.fill ( borderShape );
}
}
//131
public class func{
	public void draw(Graphics2D g2d){
        g2d.setPaint(TemplateProperties.getFillColor());
        g2d.fill(polygon);
}
}
//132
public class func{
	public void drawZoomRectangle(Graphics2D g2,boolean xor){
                g2.setPaint((Paint) getChartFieldValueByName("zoomFillPaint"));
                g2.fill(zoomRectangle);
}
}
//133
public class func{
	public void draw(Graphics2D g2,Rectangle2D area){
        g2.setPaint(this.paint);
        g2.fill(area);
}
}
//134
public class func{
	public void paintArrowButton(Graphics2D g,double x,double y){
        g.setPaint(getScrollBarButtonArrowColor());
        g.fill(s);
}
}
//135
public class func{
	public void paintDefaultTab(Graphics2D g,int width,int height){
            g.setPaint(SkinColors.GENERAL_BORDER_COLOR);
            g.fill(s);
            paintBorder(g, width, height);
}
}
//136
public class func{
	public void paintBackground(Graphics2D g,int width,int height){
            g.setPaint(SkinColors.TABLE_SELECTED_BACKGROUND_ROW_COLOR);
            g.fill(s);
}
}
//137
public class func{
	public void paintBackgroundDisabled(Graphics2D g){
    g.setPaint(color6);
    g.fill(rect);
    rect = decodeRect5();
}
}
//138
public class func{
	public void paintBackgroundDisabled(Graphics2D g){
    g.setPaint(color7);
    g.fill(rect);
}
}
//139
public class func{
	public void paintBackgroundMouseOverAndFocused(Graphics2D g){
    g.setPaint(color26);
    g.fill(roundRect);
}
}
//140
public class func{
	public void paintBackgroundDisabledAndEditable(Graphics2D g){
    g.setPaint(color53);
    g.fill(rect);
}
}
//141
public class func{
	public void drawRangeArea(final Rectangle2D area,final Graphics2D g2){
    g2.setPaint( getRangePaint() );
    g2.fill( rangeArea );
}
}
//142
public class func{
	public void paintForegroundEnabled(Graphics2D g){
    g.setPaint(color17);
    g.fill(path);
}
}
//143
public class func{
	public void paintForegroundSelected(Graphics2D g){
    g.setPaint(color31);
    g.fill(path);
}
}
//144
public class func{
	public void paintForegroundPressed(Graphics2D g){
    g.setPaint(color31);
    g.fill(path);
}
}
//145
public class func{
	public void drawFill(Graphics2D g2,Rectangle2D area){
        g2.setPaint(this.fillPaint);
        g2.fill(filledArea);
        drawBorder(g2, filledArea);
}
}
//146
public class func{
	public void paintComponent(Graphics g){
                g2.setPaint(lineColor);
                g2.fill(lineRect);
}
}
//147
public class func{
	public void paintComponent(Graphics g){
                g2.setPaint(Color.RED);
                g2.fill(rForward);
}
}
//148
public class func{
	public void paintForegroundDisabledAndIndeterminate(Graphics2D g){
    rect = decodeRect5();
    g.setPaint(decodeGradient11(rect));
    g.fill(rect);
}
}
//149
public class func{
	public void paintForegroundDisabledAndIndeterminate(Graphics2D g){
    path = decodePath5();
    g.setPaint(decodeGradient12(path));
    g.fill(path);
}
}
