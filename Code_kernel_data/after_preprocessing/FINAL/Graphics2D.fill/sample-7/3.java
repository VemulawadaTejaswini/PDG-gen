public class func{
public void paint(Component c,Graphics2D g2){
            for (Iterator<Node> it = nodes.iterator(); it.hasNext(); ) {
                if (it.next().paint(localhost, width, height, radius, g2)) {
                    it.remove();
                }
            }
        g2.setColor(Color.orange);
        g2.setStroke(DEFAULT_STROKE);
        g2.fill(dot);
}
}
