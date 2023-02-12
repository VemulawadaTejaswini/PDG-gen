public class func{
public void getOutput(int limitBytes){
      BufferedReader stdout = new BufferedReader(new InputStreamReader(
          objdump.getInputStream()));
      while ((len = stdout.read(buf, 0, buf.length)) != -1) {
        if (limitBytes > 0 && buffer.length() + len >= limitBytes) {
          buffer.append(buf, 0, Math.min(len, limitBytes - buffer.length()));
          break;
        }
        buffer.append(buf, 0, len);
      }
        stdout.close();
      return buffer.toString().getBytes();
}
}
