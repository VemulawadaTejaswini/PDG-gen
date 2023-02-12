public class func{
public void getStringFromStream(Reader reader){
    BufferedReader br = new  BufferedReader(  reader );
    while (  ( line = br.readLine() ) != null )
      sb.append( line  +"\n");
    return sb.toString();
}
}
