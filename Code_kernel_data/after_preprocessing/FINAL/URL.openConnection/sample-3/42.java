public class func{
public void connect(){
            URL contextURL = resourceProvider.getResource(url.getPath());
            if (contextURL == null) {
                throw new IOException("Resource " + url.getPath()
                    + " does not exist");
            }
            delegatee = contextURL.openConnection();
}
}
