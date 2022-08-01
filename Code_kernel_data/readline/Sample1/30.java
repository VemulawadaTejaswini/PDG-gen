//29
public class func{
	public void readLinesFromFile(String fileName){
    BufferedReader br = new BufferedReader(new InputStreamReader(ClassLoader.getSystemResourceAsStream(fileName)));
    while (br.ready()) {
      lines.add(br.readLine());
    }
}
}
