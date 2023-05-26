public class func{
public void processError(BufferedReader reader){
        while ((line = reader.readLine()) != null) {
            buff.append(line);
        }
        return buff.toString();
}
}
