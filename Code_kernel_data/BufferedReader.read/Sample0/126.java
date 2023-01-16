//125
public class func{
	public void computeLineNumber(){
    BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(txtFile), encoding));
      while ((ch = reader.read()) != -1) {
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
