public class func{
public void basedir_configURLonly(){
        createLoader(null, //
                     new File(srcdir, "aaa/config.xml").toURI().toURL(), // basedir=srcdir/aaa
                     new SearchPath("../WEB-INF", true), // srcdir/aaa/../WEB-INF
                     new SearchPath(new File(srcdir, "aaa/bbb").getAbsolutePath(), false)); // srcdir/aaa/bbb
}
}
