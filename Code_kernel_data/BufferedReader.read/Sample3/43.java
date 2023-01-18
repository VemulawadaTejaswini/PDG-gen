//42
public class func{
	public void fileContents(String filename){
            final CharBuffer buf = CharBuffer.allocate(1024);
            while (bufferedReader.read(buf) != -1) {
                buf.flip();
                builder.append(buf);
                buf.clear();
            }
            input.close();
}
}
