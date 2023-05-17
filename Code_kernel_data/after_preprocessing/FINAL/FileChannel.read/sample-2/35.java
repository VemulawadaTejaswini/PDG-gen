public class func{
public void findAndValidateKeystone(){
                _readBuffer.limit(JH.MAX_LENGTH);
                readChannel.read(_readBuffer, 0);
                _readBuffer.flip();
                final int recordSize = JH.getLength(_readBuffer);
                final long version = JH.getVersion(_readBuffer);
                _blockSize = JH.getBlockSize(_readBuffer);
                _baseAddress = JH.getBaseJournalAddress(_readBuffer);
                _journalCreatedTime = JH.getJournalCreatedTime(_readBuffer);
                _keystoneAddress = JH.getCurrentJournalAddress(_readBuffer);
                validate(_baseAddress, candidate, 0, 0, _keystoneAddress,
                        "Base address %3$,d after current address %4$,d:  at %1$s:%2$,d");
}
}
