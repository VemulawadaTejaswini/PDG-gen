//5
public class func{
public void readLastIndex(FileChannel ch){
      ch.position(chSize > (Long.SIZE / 8) ? chSize - (Long.SIZE / 8) : 0);
      ch.read(buf);
      buf.flip();
      return buf.getLong();
}
}
