//113
public class func{
public void fromJSON(final InputStream stream){
        final BufferedReader in = new BufferedReader(new InputStreamReader(stream));
        for (String s = in.readLine(); s != null; s = in.readLine()) {
            buf.append(s).append("\n");
        }
}
}
