public class func{
public void getSource(IFile file){
      in= file.getContents();
        if (encoding != null) {
            br= new BufferedReader(new InputStreamReader(in, encoding));  
        } else {
            br= new BufferedReader(new InputStreamReader(in));
        }
      while ((read= br.read()) != -1) {
        sb.append((char) read);
      }
      br.close();
}
}
