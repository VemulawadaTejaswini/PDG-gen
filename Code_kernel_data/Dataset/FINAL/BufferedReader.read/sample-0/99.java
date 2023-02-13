public class func{
public void download_apk(Activity act){
      u = new URL("http:
      in = new BufferedReader(new InputStreamReader(u.openStream()));
      while ((buf = in.read()) >= 0) {
        out.write((char) buf);
      }
      out.flush();
      out.close();
}
}
