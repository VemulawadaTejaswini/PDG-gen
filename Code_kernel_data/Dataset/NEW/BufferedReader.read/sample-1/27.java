//27
public class func{
public void readIntoBuffer(BufferedReader br,StringBuffer buffer){
    while ((bytesRead = br.read(bytes)) > 0) {
      if (bytesRead == bufferSize) {
        buffer.append(bytes);
      }
      else {
        buffer.append(bytes, 0, bytesRead);
      }
    }
}
}
