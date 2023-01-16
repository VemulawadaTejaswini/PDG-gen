//8
public class func{
	public void hashFiles(List<File> files,int pieceLenght){
      logger.info("Hashing data from {} with {} threads ({} pieces)...",
        new Object[] {
          file.getName(),
          threads,
          (int) (Math.ceil(
            (double)file.length() / pieceLenght))
        });
      length += file.length();
      FileInputStream fis = new FileInputStream(file);
      FileChannel channel = fis.getChannel();
        while (channel.read(buffer) > 0) {
          if (buffer.remaining() == 0) {
            buffer.clear();
            results.add(executor.submit(new CallableChunkHasher(buffer)));
          }

          if (results.size() >= threads) {
            pieces += accumulateHashes(hashes, results);
          }

          if (channel.position() / (double)channel.size() * 100f > step) {
            logger.info("  ... {}% complete", step);
            step += 10;
          }
        }
        channel.close();
}
}
