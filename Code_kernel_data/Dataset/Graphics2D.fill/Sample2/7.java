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
