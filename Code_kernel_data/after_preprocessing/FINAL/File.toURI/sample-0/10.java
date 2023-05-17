public class func{
public void addShipResources(Set<String> fileNames){
        for (String fileName : fileNames) {
            fileName = fileName.trim();
            if (fileName.length() > 0) {
                URL url = new File(fileName).toURI().toURL();
                addExtraResource(url);
            }
        }
}
}
