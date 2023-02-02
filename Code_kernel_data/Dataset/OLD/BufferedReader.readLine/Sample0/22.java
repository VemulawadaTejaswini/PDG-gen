//21
public class func{
	public void loadIndex(){
    InputStream stream = GNU30Plugin.class.getResourceAsStream("/resources/gnu30/images.txt");
    BufferedReader br = new BufferedReader(new InputStreamReader(stream));
    while ( (line = br.readLine()) != null ) {
      String path = "/images/gnu30/" + line.trim();
      ArrayList<BufferedImage> bi = this.loadGifObject(GNU30Plugin.class.getResourceAsStream(path));
      this.images.add(bi);
    }
}
}
