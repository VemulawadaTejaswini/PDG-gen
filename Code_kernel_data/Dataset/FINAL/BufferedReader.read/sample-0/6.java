public class func{
public void getStreamText(InputStream stream){
        InputStreamReader isr = new InputStreamReader(stream);
        BufferedReader reader = new BufferedReader(isr);
        int numRead = reader.read(buf);
        while (numRead != -1)
        {
          sw.write(buf, 0, numRead);
          numRead = reader.read(buf);
        }
        if (stream != null)
        {
          stream.close();
        }
}
}
