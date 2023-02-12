public class func{
public void doGetReaderTest(String testString){
        br = wrapper.getReader();
        while ((c = br.read()) != -1) {
            buff.append((char) c);
        }
        assertEquals(buff.toString(), testString);
}
}
