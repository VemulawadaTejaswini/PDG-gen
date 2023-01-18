//103
public class func{
	public void getLineOffset(int lineNumber,IFile file){
      while ((lineCount < lineNumber - 1) && (ch != -1)) {
        try {
          ch = in.read();
        } catch (IOException e1) {
          OcamlPlugin.logError("Error in 2 OcamlBuilder:getLineOffset()", e1);
        }
        if (ch != -1) {
          charCount++;
          if (ch == '\n') {
            lineCount++;
          }
        }
      }
}
}
