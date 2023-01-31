//15
public class func{
	public void readPostData(BufferedReader ir,BufferedWriter bw,String id){
          if (!ir.ready()) {
            try { Thread.sleep(1000); } catch( Exception e ) {}
            if ( !ir.ready() ) break;
          }
          int c = ir.read();
          if ( c == -1) break;
          bw.write( c );
}
}
