//67
public class func{
	public void getContentString(InputStream inStream){
        BufferedReader bufferedReader2 = new BufferedReader( 
                new InputStreamReader(inStream, NetEncoding));
        for (String s = bufferedReader2.readLine(); s != null; s = bufferedReader2 
                .readLine()) { 
            builder.append(s); 
        }
        return builder.toString();
}
}
