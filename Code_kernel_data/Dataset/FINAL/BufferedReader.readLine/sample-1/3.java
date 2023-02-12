public class func{
public void printResponse(HttpResponse response){
      BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
      String line = reader.readLine();
      while (line != null)
      {
         System.out.println(line);
         line = reader.readLine();
      }
}
}
