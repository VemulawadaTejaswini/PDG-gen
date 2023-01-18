//49
public class func{
	public void testGetProtoFile(){
     URL proto = new URL("http://localhost:8080/_soa_/services/blogs/BlogsInterOpModifiedV1/v1?proto");
          URLConnection yc = proto.openConnection();
            in = new BufferedReader(
                                    new InputStreamReader(
                                    yc.getInputStream()));
}
}
