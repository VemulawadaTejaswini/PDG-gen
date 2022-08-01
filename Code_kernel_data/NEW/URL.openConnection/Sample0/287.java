//286
public class func{
	public void ConnBuilder(Credentials credentials,String container,String object){
                    if (object != null) {
                        url = url + "/" + object;
                    }
                    con = (HttpURLConnection) new URL(url).openConnection();
                    con.addRequestProperty(ACCEPT_HEADER, "*/*");
}
}
