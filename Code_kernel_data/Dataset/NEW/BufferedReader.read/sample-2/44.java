//44
public class func{
public void getFromMetaData(Reader xml){
        BufferedReader in = new BufferedReader(xml);
        for (int ch = 0, last = 0, last2 = 0;
            ch == '<' || (ch = in.read()) != -1; last2 = last, last = ch) {
            // handle comments
            if (comment && last2 == '-' && last == '-' && ch == '>') {
                comment = false;
                continue;
            }
            if (comment) {
                if (ch == '<') {
                    ch = in.read();
                    if (ch == -1)
                        break read;
                }
                continue;
            }
            if (last2 == '<' && last == '!' && ch == '-') {
                comment = true;
                continue;
            }

            // if not an element start, skip it
            if (ch != '<')
                continue;
            token = TOKEN_NONE; // reset token
            last = ch; // update needed for comment detection
            ch = readThroughWhitespace(in);
            if (ch == '/' || ch == '!' || ch == '?')
                continue;

            // read element name; look for packages and classes
            token = readElementToken(ch, in);
            switch (token) {
                case TOKEN_EOF:
                    break read;
                case TOKEN_PACKAGE:
                    pkg = readAttribute(in, _packageAttr);
                    if (pkg == null)
                        break read;
                    break;
                case TOKEN_PACKAGE_NOATTR:
                    pkg = readElementText(in);
                    if (pkg == null)
                        break read;
                    ch = '<'; // reading element text reads to next '<'
                    break;
                case TOKEN_CLASS:
                    name = readAttribute(in, _classAttr);
                    if (name == null)
                        break read;
                    if (pkg.length() > 0 && name.indexOf('.') == -1)
                        names.add(pkg + "." + name);
                    else
                        names.add(name);
                    break;
                case TOKEN_CLASS_NOATTR:
                    name = readElementText(in);
                    if (name == null)
                        break read;
                    ch = '<'; // reading element text reads to next '<'
                    if (pkg.length() > 0 && name.indexOf('.') == -1)
                        names.add(pkg + "." + name);
                    else
                        names.add(name);
                    break;
            }
        }
}
}
