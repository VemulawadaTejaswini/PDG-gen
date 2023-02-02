//117
public class func{
public void readProcessStdout(){
         new BufferedInputStream(p.getInputStream());
         new BufferedReader(new InputStreamReader(stdoutStream));
      while((nc = stdoutRead.read(c,0,100)) != -1)
      {
        chunk  = new String(c,0,nc);
        stdout = stdout.append(chunk);
      }
}
}
