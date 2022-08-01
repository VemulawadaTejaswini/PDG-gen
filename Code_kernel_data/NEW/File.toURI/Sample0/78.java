//77
public class func{
	public void generateIndepInstallDirPath(){
    String installDirPath = System.getProperty("osgi.install.area").replace(URI_FILE_PREFIX, "");
    File installDirFile = new File(installDirPath);
    URI platformIndependentFile = installDirFile.toURI();
    String platformIndepInstallDirPath = platformIndependentFile.toString();
}
}
