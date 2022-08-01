//7
public class func{
	public void getResourceText(String name){
        InputStreamReader isr = new InputStreamReader(stream);
        BufferedReader reader = new BufferedReader(isr);
        int numRead = reader.read(buf);
        while (numRead != -1)
        {
          // output temp buffer to output buffer
          sw.write(buf, 0, numRead);

          // fill buffer
          numRead = reader.read(buf);
        }
        if (stream != null)
        {
          stream.close();
        }
}
}
