//219
public class func{
public void testIDURI(){
        File file = new File("foo.txt");
        URI uri = file.toURI();
        ID idURI = new ID(uri);
        assertEquals(uri, idURI.toURI());
}
}
