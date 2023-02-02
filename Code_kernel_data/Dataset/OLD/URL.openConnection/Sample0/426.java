//425
public class func{
	public void pushData(URL target,String data){
    HttpURLConnection c = (HttpURLConnection) target.openConnection();
    c.setDoOutput(true);
    c.setRequestMethod("PUT");
    c.addRequestProperty("Content-type", "application/json");
    OutputStreamWriter wr = new OutputStreamWriter(c.getOutputStream());
    wr.write(data);
    wr.flush();
}
}
