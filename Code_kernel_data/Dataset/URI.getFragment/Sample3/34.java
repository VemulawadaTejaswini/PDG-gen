//33
public class func{
	public void normalizeSchemaName(URI schemaURI){
        if (schemaURI.getFragment() != null) {
            return schemaURI.getFragment();
        }
        return schemaURI.getPath();
}
}
