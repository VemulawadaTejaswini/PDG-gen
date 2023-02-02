//261
public class func{
public void JarRepresentation(final String uri){
            super(FileURIDereferencer.findMediaType(uri));
                jc = (JarURLConnection) (new URL(uri).openConnection());
                inputStream = jc.getInputStream();
}
}
