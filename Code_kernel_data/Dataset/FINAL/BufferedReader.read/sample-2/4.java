public class func{
public void getFromMetaData(Reader xml){
                if (ch == '<') {
                    ch = in.read();
                    if (ch == -1)
                        break read;
                }
            if (last2 == '<' && last == '!' && ch == '-') {
                comment = true;
                continue;
            }
            if (ch != '<')
                continue;
            ch = readThroughWhitespace(in);
            if (ch == '/' || ch == '!' || ch == '?')
                continue;
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
                    ch = '<';
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
                    ch = '<';
                    if (pkg.length() > 0 && name.indexOf('.') == -1)
                        names.add(pkg + "." + name);
                    else
                        names.add(name);
                    break;
            }
}
}
