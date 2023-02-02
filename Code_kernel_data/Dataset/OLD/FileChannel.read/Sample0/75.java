//74
public class func{
	public void setStatusFromFile(FileChannel channel){
                buffer = ByteBuffer.wrap(new byte[(int) channel.size()]);
                channel.read(buffer);
            buffer.position(0);
            long onDiskVersion = buffer.getLong();
            if (version != onDiskVersion)
            {
                CRC32 crc32 = new CRC32();
                crc32.update((int) (onDiskVersion >>> 32) & 0xFFFFFFFF);
                crc32.update((int) (onDiskVersion >>> 0) & 0xFFFFFFFF);
                int size = buffer.getInt();
                crc32.update(size);
                LinkedHashMap<String, IndexEntry> newIndexEntries = new LinkedHashMap<String, IndexEntry>();
                // Not all state is saved some is specific to this index so we
                // need to add the transient stuff.
                // Until things are committed they are not shared unless it is
                // prepared
                for (int i = 0; i < size; i++)
                {
                    String indexTypeString = readString(buffer, crc32);
                    IndexType indexType;
                    try
                    {
                        indexType = IndexType.valueOf(indexTypeString);
                    }
                    catch (IllegalArgumentException e)
                    {
                        throw new IOException("Invalid type " + indexTypeString);
                    }

                    String name = readString(buffer, crc32);

                    String parentName = readString(buffer, crc32);

                    String txStatus = readString(buffer, crc32);
                    TransactionStatus status;
                    try
                    {
                        status = TransactionStatus.valueOf(txStatus);
                    }
                    catch (IllegalArgumentException e)
                    {
                        throw new IOException("Invalid status " + txStatus);
                    }

                    String mergeId = readString(buffer, crc32);

                    long documentCount = buffer.getLong();
                    crc32.update((int) (documentCount >>> 32) & 0xFFFFFFFF);
                    crc32.update((int) (documentCount >>> 0) & 0xFFFFFFFF);

                    long deletions = buffer.getLong();
                    crc32.update((int) (deletions >>> 32) & 0xFFFFFFFF);
                    crc32.update((int) (deletions >>> 0) & 0xFFFFFFFF);

                    byte deleteOnlyNodesFlag = buffer.get();
                    crc32.update(deleteOnlyNodesFlag);
                    boolean isDeletOnlyNodes = deleteOnlyNodesFlag == 1;

                    if (!status.isTransient())
                    {
                        newIndexEntries.put(name, new IndexEntry(indexType, name, parentName, status, mergeId, documentCount, deletions, isDeletOnlyNodes));
                    }
                }
                long onDiskCRC32 = buffer.getLong();
                if (crc32.getValue() == onDiskCRC32)
                {
                    for (IndexEntry entry : indexEntries.values())
                    {
                        if (entry.getStatus().isTransient())
                        {
                            newIndexEntries.put(entry.getName(), entry);
                        }
                    }
                    version = onDiskVersion;
                    indexEntries = newIndexEntries;
                }
                else
                {
                    throw new IOException("Invalid file check sum");
                }
            }
}
}
