//85
public class func{
	public void visitFile(AstNode astNode){
      BufferedReader reader = Files.newReader(getContext().getFile(), charset);
      while ((c = reader.read()) != -1) {

        if (c == '\r' || c == '\u2028' || c == '\u2029') {
          getContext().createFileViolation(this, "Replace all non line feed end of line characters in this file \"{0}\" by LF.",
            getContext().getFile().getName());
          break;
        }
      }
      LOG.error("Unable to process check S1779 on file: {}", getContext().getFile().getName(), e);
}
}
