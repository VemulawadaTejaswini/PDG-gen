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
                    entries.add(new TalkMessageEntry(MessageEntryKind.ME_EMPTY, null));
                } else if (ch == 'n' || ch == 'N') {
                    ch=reader.read();
                    ch=reader.read();
                    ch=reader.read();
                    entries.add(new TalkMessageEntry(MessageEntryKind.ME_EMPTY, null));
                } else {
                    long numValue = parseNumberValue(reader, (char) ch);
                    entries.add(new TalkMessageEntry(MessageEntryKind.ME_NUMBER, numValue));
                }
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
