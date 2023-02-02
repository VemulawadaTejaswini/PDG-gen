//54
public class func{
public void fileToString(File file){
            BufferedReader reader = new BufferedReader(new InputStreamReader(new java.io.BufferedInputStream(fis)));
            while ((c = reader.read()) != -1) {
                sb.append((char) c);
            }
            fileText = sb.toString();
}
}
