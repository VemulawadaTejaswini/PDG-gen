//121
public class func{
	public void readData(String dest){
            HttpURLConnection con = (HttpURLConnection) new URL(dest).openConnection();
                BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
                return reader.readLine();
}
}
