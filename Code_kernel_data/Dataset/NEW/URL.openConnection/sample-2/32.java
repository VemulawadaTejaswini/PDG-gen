//32
public class func{
public void testSetIfModifiedSince(){
        server.enqueue(new MockResponse().setBody("A"));
        server.play();
        URL url = server.getUrl("/");
        URLConnection connection = url.openConnection();
}
}
