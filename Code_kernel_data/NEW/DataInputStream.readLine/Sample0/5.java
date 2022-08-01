//4
public class func{
	public void run(){
                DataInputStream ds = new DataInputStream(serverInput);
                while ((s = ds.readLine()) != null) {
                    int len = s.length();
                    while (len > 0 && s.charAt(len - 1) <= ' ')
                        len--;
                    if (len <= 0)
                        continue;
                    int key = s.charAt(0);
                    int t1 = s.indexOf('\t');
                    int t2 = t1 > 0 ? s.indexOf('\t', t1 + 1) : -1;
                    int t3 = t2 > 0 ? s.indexOf('\t', t2 + 1) : -1;
                    if (t3 < 0) {
                        // ps.print("<br><i>"+s+"</i>\n");
                        continue;
                    }
                    String port = t3 + 1 < len ? ":" + s.substring(t3 + 1, len) : "";
                    String host = t2 + 1 < t3 ? s.substring(t2 + 1, t3) : u.getHost();
                    ps.print("<dt><a href=\"gopher://" + host + port + "/"
                             + s.substring(0, 1) + encodePercent(s.substring(t1 + 1, t2)) + "\">\n");
                    ps.print("<img align=middle border=0 width=25 height=32 src=");
                    switch (key) {
                      default:
                        ps.print(System.getProperty("java.net.ftp.imagepath.file"));
                        break;
                      case '0':
                        ps.print(System.getProperty("java.net.ftp.imagepath.text"));
                        break;
                      case '1':
                        ps.print(System.getProperty("java.net.ftp.imagepath.directory"));
                        break;
                      case 'g':
                        ps.print(System.getProperty("java.net.ftp.imagepath.gif"));
                        break;
                    }
                    ps.print(".gif align=middle><dd>\n");
                    ps.print(s.substring(1, t1) + "</a>\n");
                }
                ps.print("</dl></body>\n");
                ps.close();
}
}
