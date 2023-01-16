//37
public class func{
	public void consumeHeader(final BufferedReader reader){
            reader.mark(READ_AHEAD_LIMIT);
            int character = reader.read();
            if (character >= 0) {
                if (character == '<') {
                    reader.reset();
                    logger.info("readHeader() Complete");
                    break;
                }
            } else {
                break;
            }
}
}
