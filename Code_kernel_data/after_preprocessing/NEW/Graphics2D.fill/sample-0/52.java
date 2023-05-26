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
