//119
public class func{
public void build(){
    final Runtime rt = Runtime.getRuntime();
    final long max = Math.min(1 << 22, rt.maxMemory() - rt.freeMemory() >> 2);
    int bs = (int) Math.min(meta.filesize, max);
    bs = Math.max(IO.BLOCKSIZE, bs - bs % IO.BLOCKSIZE);
}
}
