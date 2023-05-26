//72
public class func{
public void readKeys(String keyFilename){
    BufferedReader reader = FileManager.getReader(keyFilename);
    while ((line = reader.readLine()) != null)
      kTable.put(line, 0.0);
    reader.close();
}
}
