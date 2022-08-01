//112
public class func{
	public void loadTextAssetAsString(Context context,String path){
      reader = new BufferedReader(new InputStreamReader(assetManager.open(path)));
      while ((count = reader.read(buf, 0, READ_BUF_LEN)) != -1) {
        builder.append(buf, 0, count);
      }
      return builder.toString();
}
}
