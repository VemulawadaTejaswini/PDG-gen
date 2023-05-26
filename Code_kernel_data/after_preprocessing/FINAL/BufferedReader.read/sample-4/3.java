public class func{
public void readMessages(){
                if (reader != null) {
                    int ch;
                    while((ch = reader.read()) != -1 && isStarted()) {
                        rawMessageBuilder.append((char)ch);
                        if((char)ch == ';') {
                            createAndQueueTl1Message(rawMessageBuilder);
                            rawMessageBuilder.setLength(0);
                        }
                    }
                    rawMessageBuilder = null;
                    LOG.warn("readMessages: resetting socket reader to c
}
}
