//41
public class func{
	public void fromJSON(final InputStream in){
        final BufferedReader bfs = new BufferedReader(new InputStreamReader(in));
        while ((line = bfs.readLine()) != null) {
            vertices.add(fromJSON( line));
        }
        bfs.close();
}
}
