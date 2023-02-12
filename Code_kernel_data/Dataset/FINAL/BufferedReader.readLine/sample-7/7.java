public class func{
public void testParseSplitString(){
    StringReader r = new StringReader ("\"one\ntwo\"");
    BufferedReader br = new BufferedReader(r);
    TestForwardMultilineParser bufferedReaderParser = new TestForwardMultilineParser(br, "test");
    s = br.readLine();
    LispObject lispObject = bufferedReaderParser.parse(s, 0);
}
}
