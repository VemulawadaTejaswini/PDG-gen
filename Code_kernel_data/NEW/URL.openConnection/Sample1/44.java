//43
public class func{
	public void get(String baseurl,String verb,String params){
        URL oracle = new URL(baseurl + "/" + verb + "?" + params);
        URLConnection yc = oracle.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                yc.getInputStream()));
        while ((inputLine = in.readLine()) != null) {
            response += inputLine;
        }
        in.close();
}
}
