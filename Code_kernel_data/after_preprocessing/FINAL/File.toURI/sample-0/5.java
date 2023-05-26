public class func{
public void basedir_rel(){
        createLoader("..",
                     new File(srcdir, "aaa/config.xml").toURI().toURL(),
                     new SearchPath("WEB-INF", true),
                     new SearchPath(new File(srcdir, "aaa").getAbsolutePath(), false));
}
}
