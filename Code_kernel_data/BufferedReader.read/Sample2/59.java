//58
public class func{
	public void readString(InputStream in){
      do
      {
         wasRead = reader.read(buffer, 0, 1024);
         if (wasRead > 0)
         {
            builder.append(buffer, 0, wasRead);
         }
      }
      while (wasRead > -1);
      return builder.toString();
}
}
