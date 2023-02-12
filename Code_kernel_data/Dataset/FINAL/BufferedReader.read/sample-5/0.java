public class func{
public void readsCharactersOneByOne(){
        BufferedReader reader = new BufferedReader(new StringReader(str));
        assertEquals('f', reader.read());
        assertEquals('o', reader.read());
        assertEquals('o', reader.read());
        assertEquals(-1, reader.read());
        assertEquals(-1, reader.read());
}
}
