//31
public class func{
public void determineEncoding(String filename){
            int c = br.read();
            if (c == -1) {
                throw new IllegalStateException("No XML declaration found in file " + filename);
            }
            sb.append((char) c);
            if (c == '>') {
                break;
            }
        br.close();
}
}
