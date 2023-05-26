public class func{
public void loadResourceIntoString(String resourceName){
    while ((line = br.readLine()) != null) {
      buf.append(line);
      buf.append("\n");
    }
    return buf.toString();
}
}
