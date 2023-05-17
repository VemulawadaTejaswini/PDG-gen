//15
public class func{
public void assertFullyCached(MockResponse response){
        server.enqueue(response.setBody("A"));
        server.enqueue(response.setBody("B"));
        server.play();
        URL url = server.getUrl("/");
        assertEquals("A", readAscii(url.openConnection()));
        assertEquals("A", readAscii(url.openConnection()));
}
}
