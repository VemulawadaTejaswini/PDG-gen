public class func{
public void getHTML(String strURL){
    while ((s = br.readLine()) != null) {
      sb.append(s + "\n");
    }
    return sb.toString();
}
}
