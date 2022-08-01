//24
public class func{
	public void getExpectedDocument(Reader input){
        BufferedReader lineInput = new BufferedReader(input);
        while ((line = lineInput.readLine()) != null) {
            lines.add(line);
        }
        return lines.toArray(new String[lines.size()]);
}
}
