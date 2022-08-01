//315
public class func{
	public void init(){
    final String dataDirName = ApplicationSettings.instance().getApplicationDataDirectory().getAbsolutePath();
    connection = DriverManager.getConnection("jdbc:h2:" + dataDirName + "/baralga;DB_CLOSE_ON_EXIT=FALSE", "baralga-user", ""); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
}
}
