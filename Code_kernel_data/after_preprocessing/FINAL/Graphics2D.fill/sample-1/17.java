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
