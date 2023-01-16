//0
public class func{
	public void toFile(String name){
        ClassLoader cl = Thread.currentThread().getContextClassLoader();
        return new File(cl.getResource(name).toURI());
}
}
//1
public class func{
	public void initialize(){
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            URL dataUrl = classLoader.getResource("org/richfaces/renderkit/countries.xml");
            Countries cntr = (Countries) unmarshaller.unmarshal(dataUrl);
            countries = cntr.getCountries();
}
}
//2
public class func{
	public void readDataset(String name){
        ClassLoader cl = Thread.currentThread().getContextClassLoader();
        DicomInputStream in = new DicomInputStream(
                new File(cl.getResource(name).toURI()));
            return in.readDataset(-1, -1);
            in.close();
}
}
//3
public class func{
	public void addClasspathResources(){
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        File testResourceFile = new File(classLoader.getResource(TEST_RESOURCE_NAME).getFile());
        File testResourceFolder = testResourceFile.getParentFile();
        facesServer.addResourcesFromDirectory("/" + RESOURCES_FOLDER_PATH, testResourceFolder);
}
}
//4
public class func{
	public void readFromResource(String name,IncludeBulkData includeBulkData){
        ClassLoader cl = Thread.currentThread().getContextClassLoader();
        DicomInputStream in = new DicomInputStream(
                new File(cl.getResource(name).toURI()));
            in.setIncludeBulkData(includeBulkData);
            in.setAddBulkDataReferences(includeBulkData == IncludeBulkData.URI);
            return in.readDataset(-1, -1);
            in.close();
}
}
//5
public class func{
	public void classpathResourceExistsForLocation(String location){
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        return contextClassLoader.getResource(location) != null;
}
}
//6
public class func{
	public void uri(String name){
        ClassLoader cl = Thread.currentThread().getContextClassLoader();
        return cl.getResource(name).toString();
}
}
//7
public class func{
	public void testSlaves(){
        ClassLoader classLoader = Thread.currentThread()
                .getContextClassLoader();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                classLoader.getResource("slaves").openStream()));
        String line = in.readLine();
}
}
//8
public class func{
	public void testNonMetaInfNotAccessible(){
        ClassLoader cl = Thread.currentThread().getContextClassLoader();
        URL nonManifestResource = cl.getResource("example2.txt");
        assertNull(nonManifestResource);
}
}
//9
public class func{
	public void resourceOnClasspath(final String filename){
        ClassLoader cldr = Thread.currentThread().getContextClassLoader();
        return cldr.getResource(filename);
}
}
//10
public class func{
	public void createTimeWindow(){
        ClassLoader cl = Thread.currentThread().getContextClassLoader();
        DEACTIVATED_VALIDATION_XML = new File(cl.getResource("META-INF/deactivated_validation.xml").toURI());
        ACTIVATED_VALIDATION_XML = new File(DEACTIVATED_VALIDATION_XML.getCanonicalPath().replace("deactivated_", ""));
        assertFalse(ACTIVATED_VALIDATION_XML.exists());
        boolean renamingSucceeded = DEACTIVATED_VALIDATION_XML.renameTo(ACTIVATED_VALIDATION_XML);
        assertTrue(renamingSucceeded);
}
}
//11
public class func{
	public void initialize(){
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            URL dataUrl = classLoader.getResource("org/richfaces/demo/countries.xml");
            countries = ((Countries) unmarshaller.unmarshal(dataUrl)).getCountries();
}
}
//12
public class func{
	public void getResource(String name){
        ClassLoader tccl = Thread.currentThread().getContextClassLoader();
        return tccl.getResource(name);
}
}
//13
public class func{
	public void getResizableIconFromResource(String resource){
            ClassLoader cl = Thread.currentThread().getContextClassLoader();
            image = ImageIO.read(cl.getResource(resource));
            LOGGER.error("Failed to read image: \"{}\"", resource);
}
}
//14
public class func{
	public void getXmlUrl(String fileName){
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        return loader.getResource(fileName).toExternalForm();
}
}
//15
public class func{
	public void testMetaInfAccessible(){
        ClassLoader cl = Thread.currentThread().getContextClassLoader();
        URL manifestResource = cl.getResource("META-INF/example.txt");
        assertNotNull(manifestResource);
}
}
//16
public class func{
	public void testLoader(){
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        URL url2 = loader.getResource(defaultConfigFileName1);
}
}
//17
public class func{
	public void getURL(final String name){
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        return classLoader.getResource(name);
}
}
