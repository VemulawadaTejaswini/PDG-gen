//51
public class func{
public void readFileAsString(File file){
    BufferedReader reader = new BufferedReader(new FileReader(file));
    while ((numRead = reader.read(buf)) != -1) {
      fileData.append(buf, 0, numRead);
    }
    reader.close();
}
}
