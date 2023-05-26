public class func{
public void findCodeSourceConnectionFor(final String name){
        final URL resource = findResource(name);
        if (resource != null) {
            try {
                return resource.openConnection();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
}
}
