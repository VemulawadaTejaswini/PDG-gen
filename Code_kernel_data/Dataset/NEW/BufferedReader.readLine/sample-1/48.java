//48
public class func{
public void testUnfolding(){
        BufferedReader b = new BufferedReader(reader, BUFFER_SIZE);
        while ((line = b.readLine()) != null) {
            assertFalse(line.matches("^\\s.*"));
        }
}
}
