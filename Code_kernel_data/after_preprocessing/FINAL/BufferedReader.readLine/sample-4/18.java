public class func{
public void readLine(Charset charset){
      BufferedReader reader = new BufferedReader(readerFromScanBufferList(
          _buffers, charset));
      return reader.readLine();
}
}
