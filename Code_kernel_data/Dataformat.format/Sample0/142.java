//141
public class func{
	public void handleRequest(RestRequest req){
        String nowAsISO = df.format(new Date());
        resp.setTime(nowAsISO);
}
}
