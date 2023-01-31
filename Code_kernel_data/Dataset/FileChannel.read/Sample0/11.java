//10
public class func{
	public void fold_keys_hintfile(KeyIter<T> iter,T acc){
                ByteBuffer h = ByteBuffer.wrap(header);
                long read = ch.read(h);
                if (read != HINT_HEADER_SIZE)
                {
                    return acc;
                }
                h.rewind();
                int tstamp = h.getInt();
                int key_len = h.getChar();
                int entry_len = h.getInt();
                long entry_off = h.getLong();
                ByteBuffer key = ByteBuffer.wrap(k);
                read = ch.read(key);
                if (read != key_len)
                {
                    return acc;
                }
                acc = iter.each(ByteString.copyFrom(k), tstamp, entry_off, entry_len, acc);
}
}
