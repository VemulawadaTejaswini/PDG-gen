//22
public class func{
public void readFile(InputStream in){
    final BufferedReader br = new BufferedReader(new InputStreamReader(in));
    while ((cnt = br.read(buffer, 0, buffer.length)) > -1) {
      sBuffer.append(buffer, 0, cnt);
    }
    br.close();
}
}
