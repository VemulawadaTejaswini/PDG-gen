//3
public class func{
public void getFileContent(String filePath){
                in = new BufferedReader(new InputStreamReader(getClass().getClassLoader().getResourceAsStream(filePath)));
                int ch = in.read();
                while (ch > -1) {
                    sb.append((char)ch);
                    ch = in.read();
                }
}
}
