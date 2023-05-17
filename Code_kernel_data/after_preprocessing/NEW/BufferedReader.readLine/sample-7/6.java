//6
public class func{
public void testParseDotOnNewLine(){
    StringReader r = new StringReader("(\n1\n\t.\n 2\n)");
    BufferedReader br = new BufferedReader(r);
    TestForwardMultilineParser p = new TestForwardMultilineParser(br, "test");
    s = br.readLine();
    LispObject lispObject = p.parse(s, 0);
}
}
