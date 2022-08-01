//215
public class func{
	public void testURL(String wicketId,String uri){
        if (uri!=null) 
            urlString+=uri;
        URL url = new URL(urlString);        
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.getInputStream().close();
}
}
