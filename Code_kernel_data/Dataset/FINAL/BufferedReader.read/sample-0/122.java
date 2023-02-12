public class func{
public void getContentFromInputStream(){
    BufferedReader reader = new BufferedReader(
        new InputStreamReader(inputStream, charSet));
    while ((charsRead = reader.read(chunk, 0, BUF_SIZE)) > 0) {
      sb.append(chunk, 0, charsRead);
    }
    return sb.toString();
}
}
