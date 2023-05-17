//12
public class func{
public void readQualifiers(final Reader in_stream,final EntryInformation entry_information){
      name = StreamQualifier.readName (buffered_reader);
      if (name == null) {
        // end of file/stream
        break;
      }
      buffered_reader.mark (1);
      final int next_char = buffered_reader.read ();
      if (next_char == -1) {
        value = null;
      } else {
        if (next_char == '=') {
          value = StreamQualifier.readValue (buffered_reader);
        } else {
          // this qualifier doesn't have a value
          value = null;
          buffered_reader.reset ();
        }
      }
      if (value == null) {
        new_qualifier = new Qualifier (name);
      } else {
        new_qualifier =
          StreamQualifier.makeStreamQualifier (name, value,
                                               entry_information);
      }
      return_vector.addQualifierValues (new_qualifier);
}
}
