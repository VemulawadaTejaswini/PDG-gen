//144
public class func{
	public void loadOvfContents(String ovfPath){
         File ovfFile = new File(ovfPath);
         reader = new BufferedReader(new FileReader(ovfFile));
         AuAssert.check(ovfFile.length() < MAX_OVF_SIZE);
         int totalLen = (int)(ovfFile.length() < MAX_OVF_SIZE ?
                              ovfFile.length() : MAX_OVF_SIZE);
         while (offset < totalLen &&
                (len = reader.read(ovfBuf, offset, totalLen - offset)) != -1) {
            offset += len;
         }
         if (reader != null) {
            reader.close();
         }
      return new String(ovfBuf);
}
}
