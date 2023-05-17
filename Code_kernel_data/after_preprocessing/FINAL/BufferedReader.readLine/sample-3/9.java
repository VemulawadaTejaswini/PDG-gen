public class func{
public void read(InputStream in){
        while( ( line = reader.readLine() ) != null ) {
            text.append( line );
        }
        return JSONObject.fromObject(text.toString());
}
}
