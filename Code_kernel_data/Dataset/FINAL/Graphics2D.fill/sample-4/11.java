public class func{
public void paintObject(Graphics2D g2,State s,ObjectInstance ob,float cWidth,float cHeight){
      for(int i = 0; i < map.length; i++){

        if(map[i] == 1) {

          int x = i % this.maxx;
          int y = i / this.maxx;

          float rx = x * width;
          float ry = cHeight - height - y * height;

          g2.fill(new Rectangle2D.Float(rx, ry, width, height));

        }

      }
}
}
