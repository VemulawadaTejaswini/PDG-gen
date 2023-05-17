//8
public class func{
public void testParseList(){
    BufferedReader br = new BufferedReader(new StringReader("(defun test (\n) \"doc\ndoc\ndoc()\" (message\n\"test\")\n)"));
    TestForwardMultilineParser bufferedReaderParser = new TestForwardMultilineParser(br, "test");
    s = br.readLine();
    LispObject lispObject = bufferedReaderParser.parse(s, 0);
}
}
