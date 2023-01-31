//32
public class func{
	public void testFileChannel(){
    while (!done.await(5, TimeUnit.MILLISECONDS)) {
      int rd = in.read(buf);
      read += (rd < 0 ? 0 : rd); // rd == -1 if at end of stream.
      buf.flip();
      byte[] arr = new byte[buf.remaining()];
      buf.get(arr);
      String s = new String(arr);
      System.out.print(s);
      buf.clear();
      loops++;
    }
    LOG.info("read " + read + " bytes in " + loops + " iterations");
    in.close();
    assertEquals(790, read);
}
}
