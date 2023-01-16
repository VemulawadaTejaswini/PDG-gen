//24
public class func{
	public void getSchemaAsString(BufferedReader reader,int available){
        StringBuffer sb = new StringBuffer(available);
            while( (numRead = reader.read(chars)) > -1){
                sb.append(String.valueOf(chars));
            }
            reader.close();
}
}
