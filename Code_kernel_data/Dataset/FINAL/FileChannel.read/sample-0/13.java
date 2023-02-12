public class func{
public void testFileChannelByLine(){
    do {
      int rd = in.read(buf);
      read += (rd < 0 ? 0 : rd); // rd == -1 if at end of stream.
      buf.flip();

      int start = buf.position();
      buf.mark();
      while (buf.hasRemaining()) {
        byte b = buf.get();
        if (b == '\n') {
          int end = buf.position();
          int sz = end - start;
          byte[] body = new byte[sz];
          buf.reset(); // go back to mark
          buf.get(body, 0, sz - 1); // read data
          buf.get(); // read '\n'
          buf.mark(); // new mark.
          start = buf.position();
          String s = new String(body);
          LOG.info("=> " + s);
        }
      }

      buf.clear();
      loops++;
    } while (!done.await(5, TimeUnit.MILLISECONDS));
    LOG.info("read " + read + " bytes in " + loops + " iterations");
    in.close();
    assertEquals(790, read);
}
}
