//18
public class func{
	public void capture(){
        BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));
        String s = rdr.readLine();
        while (s != null) {
            sw.write(s);
            s = rdr.readLine();
        }
}
}
