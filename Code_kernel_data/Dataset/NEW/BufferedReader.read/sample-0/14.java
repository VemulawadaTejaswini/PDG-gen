//14
public class func{
public void toString(Reader reader){
                BufferedReader br = (reader instanceof BufferedReader) ? (BufferedReader) reader
                        : new BufferedReader(reader, BUFFER_SIZE);
                int charsRead = br.read(buffer);
                while (charsRead != -1) {
                    sb.append(buffer, 0, charsRead);
                    charsRead = br.read(buffer);
                }
                br.close();
}
}
