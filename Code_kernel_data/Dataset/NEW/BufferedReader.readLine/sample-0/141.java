//141
public class func{
public void readFrom(Class<Date> arg0,Type arg1,Annotation[] arg2,MediaType arg3,MultivaluedMap<String,String> arg4,InputStream arg5){
         InputStreamReader reader = new InputStreamReader(arg5);
         BufferedReader br = new BufferedReader(reader);
         long date = Long.parseLong(br.readLine());
         return new Date(date);
}
}
