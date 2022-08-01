//51
public class func{
	public void addResources(List<URL> urls){
      for (Resource resource : this.project.getResources()) {
        File directory = new File(resource.getDirectory());
        urls.add(directory.toURI().toURL());
        FileUtils.removeDuplicatesFromOutputDirectory(this.classesDirectory,
            directory);
      }
}
}
