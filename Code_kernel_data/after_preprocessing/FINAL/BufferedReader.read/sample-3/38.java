public class func{
public void readFile(final IFile file){
      while ((n = reader.read(readBuffer)) > 0) {
        text.append(readBuffer, 0, n);
      }
      final char[] chars = new char[text.length()];
      text.getChars(0, chars.length, chars, 0);
}
}
