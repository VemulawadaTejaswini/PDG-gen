//47
public class func{
public void Shell(BundleContext context,CommandProcessor processor){
        String baseDir = context.getProperty("gosh.home");
        baseDir = (baseDir == null) ? context.getProperty("user.dir") : baseDir;
        baseURI = new File(baseDir).toURI();
}
}
