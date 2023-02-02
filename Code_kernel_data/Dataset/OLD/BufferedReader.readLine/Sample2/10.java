//9
public class func{
	public void readFile(){
        BufferedReader br = new BufferedReader(new FileReader("src/test/resources/script1"));
        String line = br.readLine();
        while (line != null) {
            if (line.trim().length() > 0 && !line.trim().startsWith("#"))
                lines.add(line);
            line = br.readLine();
        }
}
}
