public class func{
public void getStringFromIS(InputStream is){
        while(br.read(buffer, 0, buffer.length)!= -1) sb.append(buffer);
        return sb.toString();
}
}
