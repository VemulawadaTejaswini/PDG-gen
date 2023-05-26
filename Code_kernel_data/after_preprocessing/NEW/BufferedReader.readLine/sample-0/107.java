//107
public class func{
public void getFactoryClassName(){
    InputStream input = getClass().getClassLoader().getResourceAsStream(serviceId);
    if (input != null) {
      BufferedReader reader = new BufferedReader(new InputStreamReader(input, "UTF-8"));
      className = reader.readLine();
      reader.close();
    }
}
}
