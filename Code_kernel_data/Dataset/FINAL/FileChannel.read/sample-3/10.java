public class func{
public void decodeLargeFile(FileChannel channel,final int isize,String encoding){
    final Charset charset = Charset.forName(encoding);
    final CharsetDecoder decoder = charset.newDecoder().onMalformedInput(CodingErrorAction.REPLACE)
        .onUnmappableCharacter(CodingErrorAction.REPLACE);
    int n = (int) (isize * (double) decoder.averageCharsPerByte()); // avoid rounding errors.
    CharBuffer out = CharBuffer.allocate(n);
    while (offset < isize) {
      channel.read(in);
      in.flip();
      offset += in.limit();

      CoderResult cr = decoder.decode(in, out, offset >= isize);
      final int remainingBytes = in.remaining();
      if (cr.isOverflow()) {
        int totalRemainingBytes= isize-offset + remainingBytes;
        if (totalRemainingBytes > 0) {
          n+= (int) (totalRemainingBytes * (double) decoder.maxCharsPerByte()); // avoid rounding errors.
          CharBuffer o = CharBuffer.allocate(n);
          out.flip();
          o.put(out);
          out = o;
        }
      } else if (!cr.isUnderflow()) {
        cr.throwException();
      }

      if (remainingBytes == 0) {
        in.clear();
      } else {
        byte[] rest = new byte[remainingBytes];
        in.get(rest);
        in.clear();
        in.put(rest);
        offset -= remainingBytes;
      }
    }
}
}
