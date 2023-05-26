public class func{
public void inputStreamToAnyURI(InputStream inputStream,int scope,Logger logger){
        final FileItem fileItem = prepareFileItemFromInputStream(inputStream, scope, logger);
        final File storeLocation = ((DiskFileItem) fileItem).getStoreLocation();
        return storeLocation.toURI().toString().replace("+", "%2B");
}
}
