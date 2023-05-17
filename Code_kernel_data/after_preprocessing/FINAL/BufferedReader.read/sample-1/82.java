public class func{
public void convertFileFromUtf16ToUtf8(File inputFile,File outputFile){
        while ((c = reader.read()) != -1) {
          writer.write(c);
        }
        writer.close();
}
}
