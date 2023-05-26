//124
public class func{
public void InMessage(HttpServletRequest request){
      requestBodyReader = new BufferedReader(new InputStreamReader(
          request.getInputStream()));
      while (requestBodyReader.read(buffer) >= 0) {
        requestBody.append(buffer.flip());
        buffer.clear();
      }
}
}
