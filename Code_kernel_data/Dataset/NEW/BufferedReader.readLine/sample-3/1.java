//1
public class func{
public void readFully(BufferedReader br){
        while ((line = br.readLine()) != null) {
            buf.append(line);
            buf.append('\n');
        }
        return buf.toString();
}
}
