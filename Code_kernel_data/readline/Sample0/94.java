//93
public class func{
	public void signedRequest(){
        BufferedReader br = new BufferedReader(new InputStreamReader(baseUrl.openStream()));
        Assert.assertEquals("OK", br.readLine());
}
}
