public class func{
public void getIPBans(){
    if (!data.exists()) {
      return d;
    }
      fin = new FileInputStream(data.getPath());
      chan = fin.getChannel();
      long size = chan.size();
      buf = ByteBuffer.allocateDirect((int) size);
      chan.read(buf);
}
}
