//4
public class func{
public void loadFile(File f){
            while ((c = br.read()) != -1) {
                if (c == '\n') {
                    sb.append((char) c);
                    ls.add(sb);
                    sb = new StringBuilder();
                } else {
                    sb.append((char) c);
                }
            }
            if (sb.length() > 0)
                ls.add(sb);
}
}
