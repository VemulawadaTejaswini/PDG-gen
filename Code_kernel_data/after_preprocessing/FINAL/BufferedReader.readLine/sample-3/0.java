public class func{
public void getStringFromInputStream(InputStream is){
    while((line = br.readLine()) != null) {
      sb.append(line);
    }
    return sb.toString();
}
}
