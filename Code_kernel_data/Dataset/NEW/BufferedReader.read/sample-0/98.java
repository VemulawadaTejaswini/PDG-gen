//98
public class func{
public void httpGet(String url,int timeout){
            reader = new BufferedReader(new InputStreamReader(inputStream));
            while ((c = reader.read()) != -1) {
                responseBuf.append((char) c);
            }
            return responseBuf.toString();
}
}
