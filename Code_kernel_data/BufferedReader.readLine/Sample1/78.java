//77
public class func{
	public void loadMap(String file){
    while ((line = bInput.readLine()) != null) {
      parseMapLine(moduleTable, line);
    }
    bInput.close();
}
}
