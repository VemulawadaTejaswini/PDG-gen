public class func{
public void generateFileID(){
            digest.update(PDFDocument.encode(df.format(new Date())));
}
}
