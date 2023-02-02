//75
public class func{
	public void getHtml(InputStream input){
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        while ((line = reader.readLine()) != null) {
            pw.write(line);
        }
}
}
