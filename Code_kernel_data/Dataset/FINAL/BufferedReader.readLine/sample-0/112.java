public class func{
public void loadFileAsString(InputStream is){
    BufferedReader r = new BufferedReader(new InputStreamReader(is));
    for (String line = r.readLine(); line != null; line = r.readLine()) {
      sb.append(line);
      sb.append("\n");
    }
    return sb.toString();
}
}
