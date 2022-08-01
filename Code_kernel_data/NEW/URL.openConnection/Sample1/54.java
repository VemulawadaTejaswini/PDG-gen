//53
public class func{
	public void getOrbitalElements(String urlString){
        URLConnection connection = new URL(urlString).openConnection();
        in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        return parseOrbitalElements(in);
}
}
