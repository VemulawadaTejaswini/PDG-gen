//14
public class func{
	public void getJarUrls(String jars){
        for (String token : tokens) {
            File file = new File(token);
            urls.add(file.toURI().toURL());
        }
}
}
