//95
public class func{
public void getFileAsBytes(File file){
    BufferedReader br = new BufferedReader(new FileReader(file));
    while((b = br.read()) != -1) {
      bytes[i] = (byte)b;
      i++;
    }
    br.close();
}
}
