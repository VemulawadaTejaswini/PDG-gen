//299
public class func{
	public void getEntryUrlStream(){
    URL url = new URL(this.jarFile.getUrl(), "1.dat");
    url.openConnection();
    InputStream stream = url.openStream();
}
}
