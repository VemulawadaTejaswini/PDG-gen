public class func{
public void get(String name){
        if(resurl.getProtocol().equals("https"))
      c = ssl.connect(resurl);
        else
      c = resurl.openConnection();
        c.addRequestProperty("User-Agent", "Haven/1.0");
        return(c.getInputStream());
}
}
