public class func{
public void readName(final BufferedReader buffered_reader){
    while ((current_char = buffered_reader.read ()) != -1) {
      if (Character.isLetter ((char) current_char) ||
          Character.isDigit ((char) current_char) ||
          '_' == current_char ||
          '+' == current_char) {
        read_name_string_buffer.append ((char) current_char);
        buffered_reader.mark (1);
        continue;
      } else {
        buffered_reader.reset ();
        break;
      }
    }
}
}
