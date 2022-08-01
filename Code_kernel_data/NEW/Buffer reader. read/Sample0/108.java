//107
public class func{
	public void readIntoString(InputStream s){
        BufferedReader rdr = new BufferedReader(new InputStreamReader(s));
            while ((cnt = rdr.read(buffer, 0, buffer.length)) != -1) {
                bld.append(buffer, 0, cnt);
            }
            return bld.toString();
}
}
