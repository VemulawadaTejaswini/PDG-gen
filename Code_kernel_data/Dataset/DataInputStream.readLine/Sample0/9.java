//8
public class func{
	public void getStreamLines(final InputStream is){
      final DataInputStream dis = new DataInputStream(is);
        if (dis.available() > 0) {
          buffer = new StringBuffer(dis.readLine());
          while (dis.available() > 0) {
            buffer.append("\n").append(dis.readLine());
          }
        }
        dis.close();
}
}
