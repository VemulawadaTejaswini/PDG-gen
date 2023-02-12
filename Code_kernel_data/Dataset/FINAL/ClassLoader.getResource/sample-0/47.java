public class func{
public void getResource(String name){
        ClassLoader parent = getParent( );
        if ( parent != null )
          resource = parent.getResource( name );
}
}
