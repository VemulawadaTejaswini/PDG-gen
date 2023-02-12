public class func{
public void readBody(final BufferedReader r){
    while (r.ready()) 
    {
      int charsRead = r.read(buffer);
      if (charsRead == -1) 
      {
        break;
      }
      b.append(buffer, 0, charsRead);
    }
    return b.toString();    
}
}
