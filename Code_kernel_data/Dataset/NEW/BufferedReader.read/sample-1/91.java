//91
public class func{
public void addStringToZip(String text,String entryName,ZipOutputStream zOut){
    while((i = reader.read()) != -1) {
      zOut.write(i);
    }
    zOut.closeEntry();
}
}
