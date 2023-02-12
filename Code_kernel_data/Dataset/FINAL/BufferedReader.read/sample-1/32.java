public class func{
public void getResource(String name){
        while ((i = br.read()) != -1) {
            sb.append((char) i);
        }
        return sb.toString();
}
}
