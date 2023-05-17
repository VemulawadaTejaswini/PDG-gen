public class func{
public void ReadProcessOutput(BufferedReader stdInput){
        while ((bytesRead = stdInput.read(readBuf)) > 0) {
            r.append(readBuf, 0, bytesRead);
        }
        return r.toString();
}
}
