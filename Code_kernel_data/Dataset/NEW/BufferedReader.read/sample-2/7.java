//7
public class func{
public void parseMessage(BufferedReader reader){
            int ch = skipWhitespace(reader);
            while (ch != ']') {
                if (ch < 0) {
                    throw new InvalidMessageException("Unexpected end-of-message.");
                }

                if (ch == '[') {
                    ArrayList<TalkMessageEntry> childEntries = parseMessage(reader);
                    entries.add(new TalkMessageEntry(MessageEntryKind.ME_TALKMESSAGE,
                            new TalkMessage(childEntries)));
                } else if (ch == '\"' || ch == '\'') {
                    String stringValue = parseStringValue(reader, (char) ch);
                    entries.add(new TalkMessageEntry(MessageEntryKind.ME_STRING, stringValue));
                } else if (ch == ',') {
                    // blank entry
                    entries.add(new TalkMessageEntry(MessageEntryKind.ME_EMPTY, null));
                } else if (ch == 'n' || ch == 'N') { //'n' as in "null" or "Null":
                    // blank entry
                    ch=reader.read(); //'u'
                    ch=reader.read(); //'l'
                    ch=reader.read(); //'l'
                    entries.add(new TalkMessageEntry(MessageEntryKind.ME_EMPTY, null));
                } else {
                    // we assume it's a number
                    long numValue = parseNumberValue(reader, (char) ch);
                    entries.add(new TalkMessageEntry(MessageEntryKind.ME_NUMBER, numValue));
                }

                //We expect a comma next, or the end of the message
                if (ch != ',') {
                    ch = skipWhitespace(reader);
                }

                if (ch != ',' && ch != ']') {
                    throw new InvalidMessageException("Expected , or ], found "+((char) ch));
                } else if (ch == ',') {
                    ch = skipWhitespace(reader);
                }
            }
}
}
