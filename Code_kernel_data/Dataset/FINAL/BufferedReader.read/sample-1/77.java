public class func{
public void loadContents(@Nonnull File file,@Nonnull Charset charset){
      while ((c = reader.read()) != -1) {
        writer.write(c);
      }
      return checkNotNull(writer.toString());
      closeQuietly(reader);
}
}
