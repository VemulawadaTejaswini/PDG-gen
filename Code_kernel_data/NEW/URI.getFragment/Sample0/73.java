//72
public class func{
	public void getJavaFileForOutput(Location location,String className,Kind kind,FileObject sibling){
        URI uri = sibling.toUri();
          String path = uri.getPath();
          index = path.lastIndexOf('/');
          if (index != -1) {
            path = path.substring(0, index + 1);
            path += normalizedFileName;
          }
          uri2 = new URI(uri.getScheme(), uri.getHost(), path, uri.getFragment());
        return new EclipseFileObject(className, uri2, kind, this.charset);
}
}
