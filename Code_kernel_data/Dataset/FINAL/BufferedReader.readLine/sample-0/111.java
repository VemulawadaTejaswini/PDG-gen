public class func{
public void printResponse(InputStream in){
      in.close();
    BufferedReader reader = new BufferedReader(new InputStreamReader(in, "UTF-8"));
    for (String line; (line = reader.readLine()) != null; ) {
      System.out.println(line);
    }
}
}
