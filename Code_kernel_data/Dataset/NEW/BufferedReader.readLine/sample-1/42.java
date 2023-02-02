//42
public class func{
public void readSource(File sourcefile){
      JavaSource js = new JavaSource(sourcefile);
      BufferedReader r = new BufferedReader(new FileReader(sourcefile));
      while((l = r.readLine()) != null) {
        js.addLine(i++,l);
      }
}
}
