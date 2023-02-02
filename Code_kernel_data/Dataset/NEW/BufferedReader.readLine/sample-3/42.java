//42
public class func{
public void stringifyStream(InputStream is){
    while ((line = reader.readLine()) != null) {
      sb.append(line + "\n");
    }
    return sb.toString();
}
}
