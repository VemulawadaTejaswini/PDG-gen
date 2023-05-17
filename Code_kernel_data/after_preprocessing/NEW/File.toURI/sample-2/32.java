//32
public class func{
public void lex(File file){
    checkNotNull(file, "file cannot be null");
    checkArgument(file.isFile(), "file \"%s\" must be a file", file.getAbsolutePath());
      return lex(file.toURI().toURL());
      throw new LexerException("Unable to lex file: " + file.getAbsolutePath(), e);
}
}
