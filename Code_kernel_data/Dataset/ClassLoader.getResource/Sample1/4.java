//3
public class func{
	public void addClasspathResources(){
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        File testResourceFile = new File(classLoader.getResource(TEST_RESOURCE_NAME).getFile());
        File testResourceFolder = testResourceFile.getParentFile();
        facesServer.addResourcesFromDirectory("/" + RESOURCES_FOLDER_PATH, testResourceFolder);
}
}
