//76
public class func{
public void openBuffer(IProgressMonitor pm){
          BufferedReader stream = new BufferedReader(new InputStreamReader(bin.getContents()));
          while ((len = stream.read(buf, 0, buf.length)) != -1) {
            sb.append(buf, 0, len);
          }
}
}
