//15
public class func{
	public void getOutput(){
    BufferedReader stdout = new BufferedReader(new InputStreamReader(objdump.getInputStream()));
    while ((len = stdout.read(buf, 0, buf.length)) != -1) {
      buffer.append(buf, 0, len);
    }
    stdout.close();
}
}
