//19
public class func{
public void performTransfer(FileChannel source,IoCallback callback){
                long pos = source.position();
                long size = source.size();
                while (size - pos > 0) {
                    int ret = source.read(buffer);
                    if (ret <= 0) {
                        break;
                    }
                    pos += ret;
                    outputStream.write(buffer.array(), buffer.arrayOffset(), ret);
                    buffer.clear();
                }
                if (pos != size) {
                    throw new EOFException("Unexpected EOF reading file");
                }
}
}
