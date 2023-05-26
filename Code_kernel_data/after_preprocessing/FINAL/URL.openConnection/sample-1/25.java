public class func{
public void doSparqlRead(String query){
                connString += "?query=" + ParsingUtilities.encode(query) + "&format=json";
                URL url = new URL(connString);
                URLConnection connection = url.openConnection();
                connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                connection.setConnectTimeout(5000);
                connection.setDoOutput(true);
                connection.connect();
                return connection.getInputStream();
}
}
