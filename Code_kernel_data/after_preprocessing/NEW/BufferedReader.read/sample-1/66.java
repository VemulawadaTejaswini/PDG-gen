//66
public class func{
public void unGZipBytes(byte[] bytes){
      while((c = br.read()) != -1) {
        baos.write(c);
      }
      br.close();
}
}
