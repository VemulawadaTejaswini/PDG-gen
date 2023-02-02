//7
public class func{
public void hashFiles(List<File> files){
    for (File file : files) {

      length += file.length();

      FileInputStream fis = new FileInputStream(file);
      FileChannel channel = fis.getChannel();
      int step = 10;

      try {
        while (channel.read(buffer) > 0) {
          if (buffer.remaining() == 0) {
            buffer.clear();
            results.add(executor.submit(new CallableChunkHasher(buffer)));
          }

          if (results.size() >= threads) {
            pieces += accumulateHashes(hashes, results);
          }

          if (channel.position() / (double)channel.size() * 100f > step) {
            step += 10;
          }
        }
      } finally {
        channel.close();
        fis.close();
      }
    }
}
}
