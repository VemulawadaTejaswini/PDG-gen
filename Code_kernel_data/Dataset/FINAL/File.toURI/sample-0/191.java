public class func{
public void setUp(){
        File file = new File("test/resources/fonts/ttf/DejaVuLGCSerif.ttf");
        FontUris fontUris = new FontUris(file.toURI(), null);
        font = FontLoader.loadFont(fontUris, "", true, EmbeddingMode.AUTO, EncodingMode.AUTO,
                false, false, resolver);
}
}
