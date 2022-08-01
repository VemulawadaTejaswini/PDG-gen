//20
public class func{
	public void readFileAsString(){
      reader = new BufferedReader(new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream(this.scriptFilePath)));
      while ((numRead = reader.read(buf)) != -1) {
        String readData = String.valueOf(buf, 0, numRead);
        fileData.append(readData);
      }
      reader.close();
}
}
