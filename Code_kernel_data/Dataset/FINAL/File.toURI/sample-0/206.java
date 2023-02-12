public class func{
public void getPatchFileURI(final String patchFilePath){
        return firstNonNull(uri, new File(patchFilePath).toURI());
}
}
