//251
public class func{
	public void getJarFile(){
        URL jarFileUrl = new URL("jar:" + jarUrl + "!/");
        JarURLConnection conn = (JarURLConnection) jarFileUrl.openConnection();
        conn.setUseCaches(false);
        conn.connect();
        return conn.getJarFile();
}
}
