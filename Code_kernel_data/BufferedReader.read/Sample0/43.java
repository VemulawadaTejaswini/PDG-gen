//42
public class func{
	public void changeEncoding(String sourceFilename,String targetFilename){
      if ( Const.isEmpty( data.sourceEncoding ) ) {
        buffReader = new BufferedReader( new InputStreamReader( new FileInputStream( sourceFilename ) ) );
      } else {
        buffReader =
          new BufferedReader( new InputStreamReader( new FileInputStream( sourceFilename ), data.sourceEncoding ) );
      }
      while ( ( readSize = buffReader.read( cBuf ) ) != -1 ) {
        buffWriter.write( cBuf, 0, readSize );
      }
}
}
