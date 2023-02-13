public class func{
public void readName(final BufferedReader buffered_reader){
    while ((current_char = buffered_reader.read ()) != -1 &&
           0 != current_char
           ) {
      if (' ' == current_char ||
          '\n' == current_char ||
          '\r' == current_char ||
          '\t' == current_char) {
        continue;
      } else {
        if ('/' == current_char) {
          break;
        } else {
          throw new QualifierParseException ("failed to read a qualifier " +
                                             "name from this string: " +
                                             (char)current_char +
                                             buffered_reader.readLine ());
        }
      }
    }
    if (-1 == current_char ||
        0 == current_char
        ) {
      return null;
    }
    buffered_reader.mark (1);
}
}
