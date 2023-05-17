public class func{
public void getConnection(final String key,boolean doNotThrowResourceNotFound){
        final URL u = clazz.getResource(adjustedKey);
        if (u == null) {
            if (doNotThrowResourceNotFound) return null;
            else throw new ResourceNotFoundException(key);
        }
        return u.openConnection();
}
}
