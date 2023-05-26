//25
public class func{
public void readName(final BufferedReader buffered_reader){
    while ((current_char = buffered_reader.read ()) != -1 &&
           0 != current_char    // Kaffe 1.00 returns 0 at end of string
           ) {
      if (' ' == current_char ||
          '\n' == current_char ||
          '\r' == current_char ||
          '\t' == current_char) {
        // read a whitespace character so go back to the top of the loop
        continue;
      } else {
        if ('/' == current_char) {
          // we have found the start of the qualifier name
          break;
        } else {
          // if the character isn't a / or space then something is wrong
          throw new QualifierParseException ("failed to read a qualifier " +
                                             "name from this string: " +
                                             (char)current_char +
                                             buffered_reader.readLine ());
        }
      }
    }
    if (-1 == current_char ||
        0 == current_char       // Kaffe 1.00 returns 0 at end of string
        ) {
      // end of file
      return null;
    }
    buffered_reader.mark (1);
}
}
