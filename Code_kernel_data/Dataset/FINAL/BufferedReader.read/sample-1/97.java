public class func{
public void GetPage(URL url,RequestSettings settings){
      while((r = in.read()) != -1){
        out.write(r);
      }
        out.close();
}
}
