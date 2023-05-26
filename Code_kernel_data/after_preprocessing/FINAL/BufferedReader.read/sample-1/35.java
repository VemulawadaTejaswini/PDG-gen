public class func{
public void readPackageList(InputStream input,String path,boolean relative){
            while ((c = in.read()) >= 0) {
                char ch = (char)c;
                if (ch == '\n' || ch == '\r') {
                    if (strbuf.length() > 0) {
                        String packname = strbuf.toString();
                        String packpath = path +
                                      packname.replace('.', '/') + '/';
                        new Item(packname, packpath, relative);
                        strbuf.setLength(0);
                    }
                } else {
                    strbuf.append(ch);
                }
            }
            input.close();
}
}
