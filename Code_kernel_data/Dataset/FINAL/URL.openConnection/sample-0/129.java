public class func{
public void ga(final Map<String,Object> prop){
        final String ua="User-Agent: Java/"+prop.get("java.version")
                + " (" +prop.get("os.name")
                + " )" + "batoo/"+prop.get("batoojpa.build");
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestProperty("User-Agent", ua);
        return con.getResponseCode();
}
}
