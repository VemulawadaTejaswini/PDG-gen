//113
public class func{
public void getBody(HttpServletRequest request){
          InputStream inputStream = request.getInputStream();
          if (inputStream != null) {
              bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
              char[] charBuffer = new char[128];
              int bytesRead = -1;
              while ((bytesRead = bufferedReader.read(charBuffer)) > 0) {
                  stringBuilder.append(charBuffer, 0, bytesRead);
              }
          } else {
              stringBuilder.append("");
          }
}
}
