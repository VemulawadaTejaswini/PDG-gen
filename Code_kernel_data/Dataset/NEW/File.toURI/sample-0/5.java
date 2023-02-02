//5
public class func{
public void basedir_rel(){
        createLoader("..", // srcdir/aaa/..
                     new File(srcdir, "aaa/config.xml").toURI().toURL(), // srcdir/aaa
                     new SearchPath("WEB-INF", true), // srcdir/WEB-INF
                     new SearchPath(new File(srcdir, "aaa").getAbsolutePath(), false)); // srcdir/aaa
}
}
