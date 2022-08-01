//86
public class func{
	public void getLineNumber(File file,String encoding){
      while ((ch = bis.read()) != -1) {
        if (ch == '\r' || ch == '\n') {
          if (!isline) {
            isline = true;
            count++;
          }
        } else {
          isline = false;
        }
      }
}
}
