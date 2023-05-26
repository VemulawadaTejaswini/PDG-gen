//135
public class func{
public void shouldAllow404ReturnCodeOnAcceptHeaderRequests(){
        HttpURLConnection con = (HttpURLConnection)new URL(base, "app/MISSING_RESOURCES").openConnection();
        con.setRequestProperty("Accept", "application/vnd.ced+json");
        int response = con.getResponseCode();
        con.disconnect();
        Assert.assertEquals(404, response);
}
}
