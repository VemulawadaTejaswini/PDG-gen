//32
public class func{
	public void lineCount(File textFile){
    BufferedReader r = new BufferedReader(new FileReader(textFile));
    while (r.readLine()!=null) {
      numLines++;
    }
}
}
