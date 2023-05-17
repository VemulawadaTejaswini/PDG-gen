//65
public class func{
public void compressFileToGzip(String inFilename){
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            in.close();
}
}
