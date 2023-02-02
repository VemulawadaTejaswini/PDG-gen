//7
public class func{
public void readAllFromConnection(HttpURLConnection connection){
        while ((line = buf.readLine()) != null)
            text.append(line);
        return text.toString();
}
}
