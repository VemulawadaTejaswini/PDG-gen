public class func{
public void readObject(InputStream stream){
      BufferedReader reader = new BufferedReader(new InputStreamReader(stream, "UTF-8"));
      String prolog = reader.readLine();
      if ("Yes, this is MySerializationStrategy!".equals(prolog)) {
        String contents = reader.readLine();
        return new StringBuffer(contents);
      } else {
        throw new AssertionFailedError("got prolog=" + prolog);
      }
}
}
