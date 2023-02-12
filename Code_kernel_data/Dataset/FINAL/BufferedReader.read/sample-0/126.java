public class func{
public void run(){
    InputStreamReader isr = new InputStreamReader(is);
    BufferedReader br = new BufferedReader(isr);
      while ((read = br.read(cbuf)) != -1) {
        
        if (count < MAX_BYTES) {
          count += read; // might slightly exceed MAX_BYTES
          sb.append(cbuf, 0, read);
        }
      }
}
}
