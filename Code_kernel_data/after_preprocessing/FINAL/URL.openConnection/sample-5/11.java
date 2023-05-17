public class func{
public void pushData(URL target,String data){
        HttpsURLConnection c = (HttpsURLConnection) target.openConnection();
        c.setDoOutput(true);
        c.setRequestMethod("PUT");
        c.addRequestProperty("Content-type", "application/json");
        OutputStreamWriter wr = new OutputStreamWriter(c.getOutputStream());
        wr.write(data);
        wr.flush();
}
}
