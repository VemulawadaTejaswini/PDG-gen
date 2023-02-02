//32
public class func{
public void readText(InputStream stream){
        while ((inputLine = input.readLine()) != null) {
            response.append(inputLine);
        }
        return extractResponseContent(response.toString());
}
}
