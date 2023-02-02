//197
public class func{
	public void WelcomeDashboard(){
    File contentInstance = DashboardCopier.getCopy(file, new NullProgressMonitor());
    File welcomeHtml = new File(contentInstance, "index.html");
    setHomeUrl(welcomeHtml.toURI().toString());
}
}
