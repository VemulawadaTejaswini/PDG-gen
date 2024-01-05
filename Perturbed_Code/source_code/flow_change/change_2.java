public class func{
public void getSource(IFile file, String encoding){
      in= file.getContents();
      if (encoding == null) {
        br= new BufferedReader(new InputStreamReader(in));
      } else {
        br= new BufferedReader(new InputStreamReader(in, encoding));
      }
      while ((read= br.read()) != -1) {
        sb.append((char) read);
      }
      br.close();
}
}
