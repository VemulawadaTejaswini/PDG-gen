//36
public class func{
public void testHappyPath(){
      while ((c = in.read()) != -1) {
        str.append((char) c);
      }
      String response = str.toString();
      assertEquals(sourceMessage, response);
}
}
