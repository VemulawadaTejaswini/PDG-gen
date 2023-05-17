//96
public class func{
public void loadData(Cache<String,String> cache){
            CharBuffer cbuf = CharBuffer.allocate(1024 * chunkSize);
            while (bufferedReader.read(cbuf) >= 0) {
                Buffer buffer = cbuf.flip();
                String textChunk = buffer.toString();
                cache.put(textFileName + (chunkId++), textChunk);
                cbuf.clear();
                if (chunkId % 100 == 0)
                    System.out.printf("  Inserted %s chunks from %s into grid%n", chunkId, textFileName);
            }
}
}
