//13
public class func{
	public void readwoBS(BufferedReader reader){
  if( (line = reader.readLine())!=null){
      while( line.endsWith("\\") &&
       ((line2 = reader.readLine()) != null) ){
    line = line.substring(0,line.length()-1);
    line += line2;
      }
  }
}
}
