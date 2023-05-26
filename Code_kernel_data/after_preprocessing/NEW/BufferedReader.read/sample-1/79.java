//79
public class func{
public void readResource(URL resourceUrl){
      while ((iRead = resourceBr.read(buffer)) != -1) {
        sw.write(buffer, 0, iRead);
      }
      result = sw.toString();
}
}
