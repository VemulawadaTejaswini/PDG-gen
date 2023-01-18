//2
public class func{
	public void readFromInputStreamReaderToString(InputStreamReader is){
            while ((len = reader.read(buffer)) >= 0) {
                sb.append(buffer, 0, len);
            }
            return sb.toString();
}
}
