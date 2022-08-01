//33
public class func{
	public void getText(String path){
    BufferedReader reader = new BufferedReader(new InputStreamReader(
        getStream(path), LSystem.encoding));
    while ((numRead = reader.read(buf)) != -1) {
      String readData = String.valueOf(buf, 0, numRead);
      sbr.append(readData.trim());
    }
    reader.close();
}
}
