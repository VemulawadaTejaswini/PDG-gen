public class func{
public void getMediaType(BufferedReader br){
                br.mark(READ_AHEAD_LIMIT);
                    for (int i = 0; c != -1 && i < READ_AHEAD_LIMIT; i++) {
                        c = (char) br.read();
                        if (c == '[' || c == '{') {
                            return Constants.APPLICATION_JSON;
                        }else if (c == '<'){
                    return Constants.APPLICATION_XML;
                        }
                    }
                        br.reset();
}
}
