public class func{
public void getString(HttpResponse response){
      BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
      while ((line = rd.readLine()) != null) { 
          total.append(line); 
      }      
      return total.toString();
}
}
