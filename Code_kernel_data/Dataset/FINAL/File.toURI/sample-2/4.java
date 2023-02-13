public class func{
public void loadImages(File iconRootDirectory,String parent,ImageRegistry registry){
    File icons = new File(iconRootDirectory, parent);
    File[] files = icons.listFiles();
    for (File file : files) {
      if (file.isFile() && file.getName().endsWith(".gif")) {
        URL url = file.toURI().toURL();
        String name = getResourceName(url);
        ImageDescriptor id = ImageDescriptor.createFromURL(url);
        registry.put(parent + "_" + name, id);
      }
    }
}
}
