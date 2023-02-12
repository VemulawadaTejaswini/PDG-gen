public class func{
public void appendContentBody(Appendable buf){
    recordContentBody();
    final BufferedReader br = getReader();
    while((line=br.readLine())!=null) {
      buf.append(line);
    }
}
}
