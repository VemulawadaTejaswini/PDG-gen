//133
public class func{
	public void doUpdateModhash(HttpClient client){
        HttpGet httpget = new HttpGet(Constants.MODHASH_URL);
        HttpResponse response = client.execute(httpget);
          entity = response.getEntity();
          BufferedReader in = new BufferedReader(new InputStreamReader(entity.getContent()));
          in.read(buffer, 0, 1200);
          in.close();
}
}
