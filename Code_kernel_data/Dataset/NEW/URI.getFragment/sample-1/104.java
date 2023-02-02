//104
public class func{
public void addCacheResources(Set<String> fileNames){
        for (String fileName : fileNames) {
            fileName = fileName.trim();
            if (fileName.length() > 0) {
                URI resourceURI = new URI(fileName);
                String fragment = resourceURI.getFragment();

                Path remoteFsPath = new Path(resourceURI.getPath());
                String resourceName = (fragment != null && fragment.length() > 0) ? fragment : remoteFsPath.getName();

                addExtraResource(resourceName, remoteFsPath);
            }
        }
}
}
