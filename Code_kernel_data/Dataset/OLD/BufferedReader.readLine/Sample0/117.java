//116
public class func{
	public void queryAdminServer(String urlStr){
        URL url = new URL(urlStr);
        BufferedReader dis = new BufferedReader(new InputStreamReader((url.openStream())));
        String line = dis.readLine();
        Assert.assertTrue(line.length() > 0);
}
}
