//60
public class func{
	public void processInMemoryPathsFile(byte[] inMemoryFileData){
    CharBuffer charBuf = Charset.forName("UTF8").decode(ByteBuffer.wrap(inMemoryFileData));
    BufferedReader reader = new BufferedReader(new CharArrayReader(charBuf.array(),0,charBuf.limit()));
    while ((nextLine = reader.readLine()) != null) {
      LOG.info("Compiling in memory path pattern:" + nextLine);
      memoryOnlyPaths.add(Pattern.compile(nextLine));
    }
}
}
