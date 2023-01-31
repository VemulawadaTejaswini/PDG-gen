//9
public class func{
public void readName(final BufferedReader buffered_reader){
    while ((current_char = buffered_reader.read ()) != -1) {
      if (Character.isLetter ((char) current_char) ||
          Character.isDigit ((char) current_char) ||
          '_' == current_char ||
          '+' == current_char) {

        read_name_string_buffer.append ((char) current_char);

        // save the new position and go around the loop again
        buffered_reader.mark (1);
        continue;
      } else {
        // we have read one character too many
        buffered_reader.reset ();
        break;
      }
    }
}
}
