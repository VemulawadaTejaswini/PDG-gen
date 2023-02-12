public class func{
public void paint(Graphics2D g2,State s,float cWidth,float cHeight){
        for (int x=0; x < fWidth; x++) {
            for (int y = 0; y < fHeight; y++) {
                if (x == 0 || x == fWidth-1 || y == 0 || y == fHeight-1 || map[x-1][y-1] == 1) {
                    float rx = x * width;
                    float ry = cHeight - (y+1) * height;
                    g2.fill(new Rectangle2D.Float(rx, ry, width, height));
                }
            }
        }
}
}
