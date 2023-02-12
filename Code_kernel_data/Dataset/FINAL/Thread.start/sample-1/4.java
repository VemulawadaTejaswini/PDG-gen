public class func{
public void start(){
        process = builder.start();
        shutdownHook = new Thread(new DestroyProcessRunner(process));
        InputStreamReader output = new InputStreamReader(new BufferedInputStream(process.getInputStream()));
        Thread t = new Thread(new ReaderToWriterCopier(output, outputMulticast));
        t.setDaemon(true);
        t.start();
}
}
