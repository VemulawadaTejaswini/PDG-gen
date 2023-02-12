public class func{
public void dumpStream(InputStream stream){
            new BufferedReader(new InputStreamReader(stream));
            while ((i = in.read()) != -1) {
                   MessageOutput.printDirect((char)i);// Special case: use
            }
}
}
