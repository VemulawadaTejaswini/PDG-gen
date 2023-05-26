public class func{
public void expandToTemplate(Properties props,InputStream is,OutputStream os,char marker,File file){
            while ((ch = r.read()) != -1) {
                if (ch == marker) {
                    StringBuffer sb = new StringBuffer(20);
                    while ((ch = r.read()) != marker) {
                        switch (ch) {
                            case -1:
                                throw new ConfigureException("Encountered EOF in a " + marker +
                                        "..." + marker + " sequence: at " + file +
                                        " line " + lineNo);
                            case '\r':
                            case '\n':
                                throw new ConfigureException("Encountered end-of-line in a " +
                                        marker + "..." + marker + " sequence: at " + file +
                                        " line " + lineNo);
                            default:
                                sb.append((char) ch);
                        }
                    }
                    if (sb.length() == 0) {
                        w.write(marker);
                    } else {
                        Matcher matcher = AT_AT_CONTENTS_PATTERN.matcher(sb);
                        if (!matcher.matches()) {
                            throw new ConfigureException("Malformed @...@ sequence: at " + file +
                                    " line " + lineNo);
                        }
                        String name = matcher.group(1);
                        String modifiers = matcher.group(2);
                        modifiers = (modifiers == null) ? "" : modifiers;
                        String propValue = props.getProperty(name);
                        w.write(codec.encodeProperty(name, propValue, modifiers));
                    }
                } else {
                    if (ch == '\n') {
                        lineNo++;
                    }
                    w.write((char) ch);
                }
            }
            w.flush();
}
}
