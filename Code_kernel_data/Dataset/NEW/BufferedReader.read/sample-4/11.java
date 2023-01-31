//11
public class func{
public void getContentsOfUrlAsString(URL requestUrl){
    while ((cp = br.read()) != -1) {
      output.append((char) cp);
    }
    br.close();
}
}
