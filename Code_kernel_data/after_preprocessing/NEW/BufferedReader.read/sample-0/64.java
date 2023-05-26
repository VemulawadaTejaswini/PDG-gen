//64
public class func{
public void readFileAsString(File filePath){
    BufferedReader reader = new BufferedReader(new FileReader(filePath));
    while ((numRead = reader.read(buf)) != -1) {
      fileData.append(buf, 0, numRead);
    }
    reader.close();
}
}
