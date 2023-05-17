//3
public class func{
public void readOutput(URL url){
    URLConnection connection = url.openConnection();
    BufferedReader in = new BufferedReader(
                            new InputStreamReader(
                            connection.getInputStream()));
    while ((inputLine = in.readLine()) != null) {
      out.append(inputLine);
    }
    in.close();
}
}
