//51
public class func{
public void readWebsiteContentsSoWeCanUseTheText(String link){
            URL url = new URL(link);
            URLConnection con = url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
}
}
