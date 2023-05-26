//15
public class func{
public void fillOvals(Graphics2D g){
        for (int i = 0; i < rpts.length; i++) {
            // use fill() instead of fillOval(), since the former is more
            // likely to be consistent with our software loops when the
            // OGL pipeline cannot be enabled
            g.fill(new Ellipse2D.Float(rpts[i][0], rpts[i][1],
                                       rpts[i][2], rpts[i][3]));
        }
}
}
