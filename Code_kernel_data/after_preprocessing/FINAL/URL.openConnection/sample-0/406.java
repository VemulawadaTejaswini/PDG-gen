public class func{
public void doGet(URL url){
      HttpURLConnection urlc = (HttpURLConnection) url.openConnection();
      if (HttpURLConnection.HTTP_OK != urlc.getResponseCode()) {
        fatal("Solr returned an error #" + urlc.getResponseCode() + 
            " " + urlc.getResponseMessage());
      }
      fatal("An error occured posting data to "+url+". Please check that Solr is running.");
}
}
