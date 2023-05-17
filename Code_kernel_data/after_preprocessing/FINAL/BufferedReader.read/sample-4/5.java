public class func{
public void checkResponseCode(HttpURLConnection urlc){
          while ((ch = br.read()) != -1) {
            response.append((char) ch);
          }
          warn(response.toString().trim());
}
}
