//223
public class func{
	public void callBart(){
    URL url = new URL(urlString);
        URLConnection conn = url.openConnection();
        conn.setRequestProperty("Content-Type","text/plain");
        conn.setDoOutput(true);
        PrintWriter writer = new PrintWriter(conn.getOutputStream());
        writer.println(text);
        writer.close();
}
}
