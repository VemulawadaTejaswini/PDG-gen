public class func{
public void streamToString(InputStream in){
    while((t = br.readLine()) != null) {
      sb.append(t);
      sb.append("\n");
    }
    return sb.toString();
}
}
