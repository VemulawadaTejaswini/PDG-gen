//5
public class func{
	public void getGrammarFileLines(String filename){
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename), "UTF-8"));
            int c = reader.read();
            while (c != -1) {
                sb.append((char)c);
                c = reader.read();
            }
}
}
