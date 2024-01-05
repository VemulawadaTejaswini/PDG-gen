public class func{
public StringBuilder getSource(IFile file){
      StringBuilder sb;
      in= file.getContents();
      if (encoding != null) {
        br= new BufferedReader(new InputStreamReader(in, encoding));  
      } else {
        br= new BufferedReader(new InputStreamReader(in));
      }
      do {
        sb.append((char) read);
      } while ((read= br.read()) != -1);
      br.close();
      return sb;
}
}
