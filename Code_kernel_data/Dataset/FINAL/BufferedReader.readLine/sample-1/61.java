public class func{
public void append(Reader reader){
        BufferedReader buf = new BufferedReader(reader);
        while ((line = buf.readLine()) != null)
            _buf.append(line).append(SEP);
}
}
