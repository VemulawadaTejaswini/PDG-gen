//248
public class func{
	public void getJarURLConnection(){
        File file = getLocalFile("hyts_att.jar");
        URL fUrl1 = new URL("jar:file:" + file.getPath() + "!/");
        con1 = (JarURLConnection) fUrl1.openConnection();
}
}
