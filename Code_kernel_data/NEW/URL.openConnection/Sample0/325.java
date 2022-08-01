//324
public class func{
	public void request_id_header_01(){
        String qs = Convert.encWWWForm("ASK{}") ;
        URL u = new URL(serviceQuery+"?query="+qs);
        HttpURLConnection conn = (HttpURLConnection) u.openConnection();
        Assert.assertTrue(conn.getHeaderField("Fuseki-Request-ID") != null);
}
}
