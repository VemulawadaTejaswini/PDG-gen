public class func{
public void readText(InputStream stream){
    while ((line = read.readLine()) != null) {
      str.append(line + "\n");
    }
    return str.toString();
}
}
