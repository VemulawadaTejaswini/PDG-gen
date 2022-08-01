//16
public class func{
	public void getLegacyRepoUri(URI datasetUri,String namespace){
    if (Sets.newHashSet("hdfs", "file", "hive").contains(repoScheme)) {
      try {
        specificUri = new URI(specificUri.getScheme(), specificUri.getUserInfo(),
            specificUri.getHost(), specificUri.getPort(),
            specificUri.getPath() + "/" + namespace,
            specificUri.getQuery(), specificUri.getFragment());
        repoUri = URI.create("repo:" + specificUri.toString());
      } catch (URISyntaxException ex) {
        throw new DatasetException("Error generating legacy URI", ex);
      }
    }
}
}
