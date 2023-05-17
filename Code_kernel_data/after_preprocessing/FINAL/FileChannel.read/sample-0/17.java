public class func{
public void read(final long address,final int size){
                final long remainingInBlock = addressUp(address) - address;
                if (remainingInBlock < maxSize) {
                    maxSize = (int) remainingInBlock;
                }
                _readBuffer.limit(maxSize);
                while (_readBuffer.remaining() > 0) {
                    final int readSize = fc.read(_readBuffer, offset + address % _blockSize);
                    if (readSize < 0) {
                        break;
                    }
                    offset += readSize;
                }
                _readBuffer.flip();
                if (_readBuffer.remaining() < size) {
                    throw new CorruptJournalException("End of file at " + addressToString(address));
                }
}
}
