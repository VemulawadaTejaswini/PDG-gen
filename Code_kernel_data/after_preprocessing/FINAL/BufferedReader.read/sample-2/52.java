public class func{
public void readString(FSDataInputStream inputStream){
    BufferedReader reader = new BufferedReader(new InputStreamReader(
        inputStream));
    int count = reader.read(buffer, 0, BUFFER_SIZE);
    if (count > BUFFER_SIZE) {
      throw new IOException("Exceeded buffer size");
    }
    inputStream.close();
    return new String(buffer, 0, count);
}
}
