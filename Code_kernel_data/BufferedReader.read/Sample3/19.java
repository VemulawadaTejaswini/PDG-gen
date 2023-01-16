//18
public class func{
	public void readerToString(BufferedReader r){
        while ((read = r.read(buf)) > 0) {
            data.append(buf, 0, read);
        }
        return data.toString();
}
}
