public class func{
public void readfile(String filename){
    BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(filename), "KOI8-R"));
    while ((i = in.read(buf, 0, buf.length)) > -1) {
      if (i > 0) {
        out.append(buf, 0, i);
      }
    }
    in.close();
}
}
