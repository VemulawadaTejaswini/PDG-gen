//56
public class func{
	public void read(InputStream in){
    BufferedReader r = new BufferedReader(new InputStreamReader(in), 1000);
    for (String line = r.readLine(); line != null; line = r.readLine()) {
      sb.append(line);
    }
    in.close();
}
}
