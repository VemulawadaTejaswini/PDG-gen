//138
public class func{
public void copy_apk(Activity act,String _sourceDir,String packageName){
      in = new BufferedReader(new FileReader(_sourceDir));
      while ((buf = in.read()) >= 0) {
        out.write((char) buf);
      }
      out.flush();
      out.close();
}
}
