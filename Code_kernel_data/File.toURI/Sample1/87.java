//86
public class func{
	public void createJarUri(File jarFile,String entryName){
        URI jarURI = jarFile.toURI().normalize();
            throw new CannotCreateUriError(jarURI + separator + entryName, e);
}
}
