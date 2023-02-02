//65
public class func{
	public void initROCF(){
    File file = new File(SCAN1_FILE_AS_STR);
    ConfigurationWatchListUtil.setMainWatchURL(loggerContext, file.toURI().toURL());
}
}
