public class func{
public void readProcessStderr(){
         new BufferedInputStream(p.getErrorStream());
         new BufferedReader(new InputStreamReader(stderrStream));
      while((nc = stderrRead.read(c,0,100)) != -1)
        stderr = stderr.append(new String(c,0,nc));
}
}
