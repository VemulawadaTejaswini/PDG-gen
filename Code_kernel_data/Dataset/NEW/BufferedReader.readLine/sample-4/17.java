//17
public class func{
public void readData(Reader rdr){
        if (rdr != null) {
            BufferedReader br = new BufferedReader(rdr);
            buf.append(br.readLine());
        }
        return buf.toString();
}
}
