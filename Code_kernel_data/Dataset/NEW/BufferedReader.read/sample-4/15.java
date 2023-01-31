//15
public class func{
public void doEncodingTest(String rootElementName,String rootElementText,String encoding){
    int intValue = in.read();
    while ( intValue != -1 ) {
      stringBuffer.append( (char) intValue );
      intValue = in.read();
    }
}
}
