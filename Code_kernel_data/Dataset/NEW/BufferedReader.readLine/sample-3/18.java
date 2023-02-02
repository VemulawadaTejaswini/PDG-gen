//18
public class func{
public void capture(InputStream is){
        while ((line = br.readLine()) != null) {
            buff.append(line);
        }
        return buff.toString();
}
}
