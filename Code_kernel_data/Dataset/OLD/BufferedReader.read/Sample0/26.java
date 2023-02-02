//25
public class func{
	public void slurp(File file){
                reader = new BufferedReader(
                        new InputStreamReader(new GZIPInputStream(new FileInputStream(file))), 1024);
            while ((c = reader.read()) != -1) {
                result.append((char)c);
            }
            reader.close();
}
}
