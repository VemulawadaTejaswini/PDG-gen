public class func{
public void writeKeys(final Writer out,final List<ECKey> keys){
    for (final ECKey key : keys)
    {
      out.write(key.getPrivateKeyEncoded(Constants.NETWORK_PARAMETERS).toString());
      if (key.getCreationTimeSeconds() != 0)
      {
        out.write(' ');
        out.write(format.format(new Date(key.getCreationTimeSeconds() * DateUtils.SECOND_IN_MILLIS)));
      }
      out.write('\n');
    }
}
}
