//123
public class func{
	public void lineCount(String textFileOrUrl){
    BufferedReader r = readerFromString(textFileOrUrl);
    while (r.readLine() != null) {
      numLines++;
    }
}
}
