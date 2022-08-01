//34
public class func{
	public void getTextSync(String path){
      BufferedReader reader = new BufferedReader(new InputStreamReader(is));
      while ((numRead = reader.read(buf)) != -1) {
        String readData = String.valueOf(buf, 0, numRead);
        fileData.append(readData);
      }
      reader.close();
}
}
