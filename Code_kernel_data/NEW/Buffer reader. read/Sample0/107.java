//106
public class func{
	public void getResourceAsString(Class c,String resource){
            in = c.getClassLoader().getResourceAsStream(resource);
            reader = new BufferedReader(new InputStreamReader(in));
            while ((numRead = reader.read(buf)) != -1) {
                String readData = String.valueOf(buf, 0, numRead);
                sb.append(readData);
                buf = new char[BUFFER_SIZE];
            }
            safeClose(in);
}
}
