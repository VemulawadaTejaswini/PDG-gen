public class func{
public void leavesMark(){
        for (int i = 0; i < 1000; ++i) {
            sb.append((char)i);
        }
        BufferedReader reader = new BufferedReader(new StringReader(sb.toString()), 100);
        reader.skip(50);
        reader.mark(70);
        reader.skip(60);
        reader.reset();
        int charsRead = reader.read(buffer);
        assertEquals(199, buffer[149]);
}
}
