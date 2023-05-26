public class func{
public void startTransmission(Socket socket2){
        Thread t = new Thread(reader, "pydevd.reader");
        t.start();
        t = new Thread(writer, "pydevd.writer");
        t.start();
}
}
