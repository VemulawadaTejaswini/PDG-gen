//117
public class func{
	public void getIpv2(){
    URL whatismyip = new URL("http://checkip.amazonaws.com");
    BufferedReader in = new BufferedReader(new InputStreamReader(whatismyip.openStream()));
    String ip = in.readLine();
    Closeables.close(in, true);
}
}
