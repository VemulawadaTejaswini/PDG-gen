public class func{
public void getLastModified(K src){
    if (src instanceof URL) {
      try {
        final long v = ((URL)src).openConnection().getLastModified();
        return v != -1 ? v: 0; //not to reload if unknown (5.0.6 for better performance)
      } catch (Throwable ex) {
        return -1; //reload (might be removed)
      }
    } else if (src instanceof File) {
      final long v = ((File)src).lastModified();
      return v == -1 ? 0: //not to reload if unknown (5.0.6 for better performance)
        v == 0 ? -1: v; //0 means nonexistent so reload
    } else if (src == null) {
      throw new NullPointerException();
    } else {
      throw new IllegalArgumentException("Unknown soruce: "+src+"\nOnly File and URL are supported");
    }
}
}
