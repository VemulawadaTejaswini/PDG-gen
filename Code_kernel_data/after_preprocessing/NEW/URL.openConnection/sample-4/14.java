//14
public class func{
public void execute(){
        for (Resource r : resources) {
            URLProvider up = r.as(URLProvider.class);
            if (up != null) {
                URL u = up.getURL();
                try {
                    FileUtils.close(u.openConnection());
                } catch (IOException ex) {
                    // ignore
                }
            }
        }
}
}
