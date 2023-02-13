public class func{
public void detectLineSeparator(File f){
      fis = new FileInputStream(f);
      BufferedReader br = new BufferedReader(new InputStreamReader(fis));
      while((c = (char) br.read()) != null)
      {
        if(c == '\n')
          return LineSeparator.UNIX;
        if(c == '\r')
        {
          if(br.read() == '\n')
            return LineSeparator.WINDOWS;
          else
            return LineSeparator.OLDMAC;
        }
      }
}
}
