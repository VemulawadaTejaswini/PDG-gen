//122
public class func{
	public void processQueue(){
    while (pending.size() < MAX_PENDING && queue.size() > 0) {
      Coordinate coord = (Coordinate)queue.remove(0);
      TileLoader tileLoader = new TileLoader(coord);
      pending.put(coord, tileLoader);
      new Thread(tileLoader).start();
    }  
}
}
