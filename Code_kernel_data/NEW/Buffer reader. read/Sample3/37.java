//36
public class func{
	public void readFully(Reader reader){
        BufferedReader bufferedReader = (BufferedReader) ((reader instanceof BufferedReader) ?
                                                          reader : new BufferedReader(reader));
            while ((charsRead = bufferedReader.read(chars)) >= 0) {
                sb.append(chars, 0, charsRead);
            }
            safeClose(bufferedReader);
}
}
