//61
public class func{
	public void getCharContent(boolean b){
                InputStream stream = getClass().getClassLoader().getResource(packagePrefix + fileName).openStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
                for (String line = null; (line = reader.readLine()) != null; str += line + "\n")
                    ;
}
}
