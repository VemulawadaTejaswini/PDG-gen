//5
public class func{
public void getNestedJarDirectory(){
    assertThat(url.toString(), equalTo("jar:" + this.rootJarFile.toURI() + "!/d!/"));
    assertThat(((JarURLConnection) url.openConnection()).getJarFile(),
        sameInstance(nestedJarFile));
}
}
