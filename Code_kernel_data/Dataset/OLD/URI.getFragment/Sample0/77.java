//76
public class func{
	public void translateTransferable(Transferable contents,DataFlavor flavor,long format){
            final ProtectionDomain userProtectionDomain = getUserProtectionDomain(contents);
            final ArrayList<String> fileList = castToFiles(list, userProtectionDomain);
            final ArrayList<String> uriList = new ArrayList<String>(fileList.size());
            for (String fileObject : fileList) {
                final URI uri = new File(fileObject).toURI();
                // Some implementations are fussy about the number of slashes (file:///path/to/file is best)
                try {
                    uriList.add(new URI(uri.getScheme(), "", uri.getPath(), uri.getFragment()).toString());
                } catch (URISyntaxException uriSyntaxException) {
                    throw new IOException(uriSyntaxException);
                  }
              }
}
}
