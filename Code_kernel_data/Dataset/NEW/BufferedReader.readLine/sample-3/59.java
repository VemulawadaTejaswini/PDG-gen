//59
public class func{
public void readStderr(InputStream err){
      while((line = errReader.readLine())!=null){
        errMsg.append(line);
      }
}
}
