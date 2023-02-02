//10
public class func{
public void getRequestBody(HttpServletRequest request){
        BufferedReader reader = request.getReader();
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
        }
        return stringBuilder.toString();
}
}
