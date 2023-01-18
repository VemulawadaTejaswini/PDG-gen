//63
public class func{
	public void nestURIForLocalJavaKeyStoreProvider(final URI localFile){
    if (!("file".equals(localFile.getScheme()))) {
      throw new IllegalArgumentException("passed URI had a scheme other than " +
          "file.");
    }
    if (localFile.getAuthority() != null) {
      throw new IllegalArgumentException("passed URI must not have an " +
          "authority component. For non-local keystores, please use " +
          JavaKeyStoreProvider.class.getName());
    }
    return new URI(LocalJavaKeyStoreProvider.SCHEME_NAME,
        "//file" + localFile.getSchemeSpecificPart(), localFile.getFragment());
}
}
