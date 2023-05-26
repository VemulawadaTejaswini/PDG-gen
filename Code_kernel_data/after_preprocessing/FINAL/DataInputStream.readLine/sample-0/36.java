public class func{
public void ThemeMap(File file){
    while (dataStream.available() != 0) {
      lines.add(dataStream.readLine());
    }
    fileStream.close();
}
}
