public class func{
public void basedir_configURLonly(){
        createLoader(null,
                     new File(srcdir, "aaa/config.xml").toURI().toURL(),
                     new SearchPath("../WEB-INF", true),
                     new SearchPath(new File(srcdir, "aaa/bbb").getAbsolutePath(), false));
}
}
