public class func{
public void url(File fil){
        if( fil == null ) {
            return null;
        }
            return fil.toURI().toURL();
}
}
