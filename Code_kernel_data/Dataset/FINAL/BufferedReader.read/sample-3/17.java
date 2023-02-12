public class func{
public void setup(){
        while ((length = reader.read(buffer)) != -1) {
            sb.append(buffer, 0, length);
        }
        fileData = sb.toString();
}
}
