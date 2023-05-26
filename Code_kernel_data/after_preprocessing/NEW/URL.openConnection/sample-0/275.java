//275
public class func{
public void testApp(){
    HttpURLConnection conn = (HttpURLConnection) new URL(url)
        .openConnection();
    InputStream in = conn.getInputStream();
    BufferedImage src = ImageIO.read(in);
    in.close();
}
}
