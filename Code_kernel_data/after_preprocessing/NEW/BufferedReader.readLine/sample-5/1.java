//1
public class func{
public void isFileEmpty(File file){
    final BufferedReader reader = new BufferedReader(new FileReader(file));
    String firstLine = reader.readLine();  
    reader.close();
}
}
