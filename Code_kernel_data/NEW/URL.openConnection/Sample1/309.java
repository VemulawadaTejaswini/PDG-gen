//308
public class func{
	public void openConnection(URL u){
        String x = u.getPath();
        x = x.replaceAll("__", "!");
        return new URL(x).openConnection();
}
}
