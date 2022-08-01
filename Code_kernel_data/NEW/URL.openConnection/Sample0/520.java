//519
public class func{
	public void connectForMultipart(){
    con = (HttpURLConnection) ( new URL(url)).openConnection();
    con.setRequestMethod("POST");
    con.setDoInput(true);
    con.setDoOutput(true);
    con.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);
    con.connect();
    os = con.getOutputStream();
}
}
