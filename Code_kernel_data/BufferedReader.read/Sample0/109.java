//108
public class func{
	public void loadRawTextResourceAsString(Context context,int resourceId){
      reader = new BufferedReader(new InputStreamReader(context.getResources().openRawResource(resourceId)));
      while ((count = reader.read(buf, 0, READ_BUF_LEN)) != -1) {
        builder.append(buf, 0, count);
      }
      return builder.toString();
}
}
