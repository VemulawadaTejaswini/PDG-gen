//355
public class func{
public void checkValidMavenJarUrl(String url,String resource){
        URL realUrl = followRedirects(new URL(url));
        URLClassLoader classLoader = new URLClassLoader(new URL[] { realUrl });
        URL innerU = classLoader.findResource(resource);
        InputStream innerUin = innerU.openConnection().getInputStream();
        innerUin.close();
}
}
