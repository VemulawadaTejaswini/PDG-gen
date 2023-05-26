public class func{
public void writeCharacterStream(java.io.Reader x){
         BufferedReader bufReader = new BufferedReader(x);
             while( (i = bufReader.read()) != -1 ) {
                char ch = (char)i;
                StringBuffer strBuf = new StringBuffer();
                strBuf.append(ch);
                String str = new String(strBuf);
                String strLine = bufReader.readLine();
                writeString(str.concat(strLine));
             }
}
}
