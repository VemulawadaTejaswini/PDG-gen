public class func{
public void relativize(File from,File to){
    URI toURI = to.toURI();
    String relative = getRelativePath(fromURI.toString(), toURI.toString(), URIUtils.URI_FILE_SEPARATOR);
    relative = convertUriToPlatformSeparator(relative);
}
}
