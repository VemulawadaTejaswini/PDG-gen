//1
public class func{
public void testDataInputStream(){
        DataInputStream d = new DataInputStream(da);
            assertEquals("AbCdEfGhIjKlM", d.readLine());
            assertEquals("OpQ", d.readLine());
            assertEquals("StUvWxYz", d.readLine());
            d.close();
}
}
