//114
public class func{
	public void readStream(InputStream errStream){
    BufferedReader in = new BufferedReader(new InputStreamReader(errStream, "UTF-8"));
    for (String line = in.readLine(); line != null; line = in.readLine()) {
      builder.append(line);
      builder.append('\n');
    }
    return builder.toString();
}
}
