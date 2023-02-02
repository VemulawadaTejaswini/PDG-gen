//3
public class func{
public void getUrl(){
    assertThat(url.toString(), equalTo("jar:" + this.rootJarFile.toURI() + "!/"));
    JarURLConnection jarURLConnection = (JarURLConnection) url.openConnection();
    assertThat(jarURLConnection.getJarFile(), sameInstance(this.jarFile));
}
}
