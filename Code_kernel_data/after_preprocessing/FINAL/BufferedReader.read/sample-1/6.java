public class func{
public void read(BufferedReader requestReader,HttpServletRequest req){
        while (-1 != (c = requestReader.read())) {
            output.append((char) c);
        }
        requestReader.close();
}
}
