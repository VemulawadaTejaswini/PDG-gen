//45
public class func{
public void getRelativeBaseDirPath(String baseDir){
        String path = new File(".").toURI().relativize(new File(baseDir).toURI()).getPath();
        if (StringUtils.isEmpty(path)) {
            path = ".";
        }
}
}
