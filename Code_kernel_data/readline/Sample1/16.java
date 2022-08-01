//15
public class func{
	public void countLines(File file){
    BufferedReader reader = new BufferedReader(new FileReader(file));
    while (reader.readLine() != null) {
      lines++;
    }
    reader.close();
}
}
