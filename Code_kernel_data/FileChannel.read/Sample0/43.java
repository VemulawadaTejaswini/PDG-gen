//42
public class func{
	public void validate(String expected,String result){
      resultF.read(bResult);
      bResult.rewind();
      if (bExp.compareTo(bResult) != 0) {
        while (bExp.hasRemaining() || bResult.hasRemaining()) {
          char a = (char) bExp.get();
          char b = (char) bResult.get();
          if (a != b) {
            fail("Expected " + a + " but was " + b + " at position " + bExp.position());
          }
        }
      }
      fileInputStream.close();
}
}
