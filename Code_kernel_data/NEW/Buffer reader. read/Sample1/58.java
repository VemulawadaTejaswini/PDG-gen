//57
public class func{
	public void readXMLFile(String filePath){
    while ((n = bufferReader.read(buf)) > 0) {
      w.write(buf, 0, n);
    }
    bufferReader.close();
}
}
