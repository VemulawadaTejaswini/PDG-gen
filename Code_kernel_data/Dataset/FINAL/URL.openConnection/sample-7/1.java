public class func{
public void createEntryUrl(){
    assertThat(url.toString(), equalTo("jar:" + this.rootJarFile.toURI() + "!/1.dat"));
    JarURLConnection jarURLConnection = (JarURLConnection) url.openConnection();
    assertThat(jarURLConnection.getJarFile(), sameInstance(this.jarFile));
}
}
