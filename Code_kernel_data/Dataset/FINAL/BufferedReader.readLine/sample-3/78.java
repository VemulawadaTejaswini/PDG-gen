public class func{
public void readFully(InputStream in){
    while (reader.ready()) {
      sb.append(reader.readLine());
    }
    return sb.toString();
}
}
