//1
public class func{
public void resolveWebRoot(){
        File result = new File(webRoot);
        if (!result.exists()) {
            result = new File(project.getBasedir(), webRoot);
        }
        if (!result.exists()) {
            return null;
        }
        return result.toURI().toURL();
}
}
