public class func{
public void readFile(ByteBuffer buffer){
            raf = (RandomAccessFile)
                java.security.AccessController.doPrivileged(
                    new java.security.PrivilegedAction() {
                        public Object run() {
                            try {
                                return new RandomAccessFile(platName, "r");
                            } catch (FileNotFoundException fnfe) {
                            }
                            return null;
                    }
            });
            fc = raf.getChannel();
            while (buffer.remaining() > 0 && fc.read(buffer) != -1) {}
                if (raf != null) {
                    raf.close();
                    raf = null;
                }
}
}
