//144
public class func{
public void lineCount(File file){
    BufferedReader reader = getReader(file);
    while (reader.readLine() != null) {
      count++;
    }
}
}
