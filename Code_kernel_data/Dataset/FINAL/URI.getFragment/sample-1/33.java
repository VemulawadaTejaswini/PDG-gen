public class func{
public void getPath(URI uri){
        FileSystem fs = getFileSystem(uri);
        String path = uri.getFragment();
        if (path == null) {
            String uristr = uri.toString();
            int off = uristr.indexOf("!/");
            if (off != -1)
                path = uristr.substring(off + 2);
        }
        if (path != null)
            return fs.getPath(path);
        throw new IllegalArgumentException("URI: "
            + uri
            + " does not contain path fragment ex. jar:
}
}
