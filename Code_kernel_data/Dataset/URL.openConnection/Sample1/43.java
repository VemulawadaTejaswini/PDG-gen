//42
public class func{
	public void sendRequest(AccountDetails ad){
    out.print("Processing user '"+ad.getUsername()+"': ");
      URL u = new URL(baseUrl+"&"+ad.getUrlParameters());
          URLConnection yc = u.openConnection();
          BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
          while ((inputLine = in.readLine()) != null) 
              out.println(inputLine);
          in.close();
}
}
