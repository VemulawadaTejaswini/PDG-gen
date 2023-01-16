//2
public class func{
	public void testRead(String filename){
    DataInputStream in = new DataInputStream( new BufferedInputStream(new FileInputStream(filename)));
    while (null != (line = in.readLine())) {
      System.out.println("Line "+count++);
      System.out.println(line);
      System.out.println(showBytes(line.getBytes(CDM.utf8Charset)));
    }
    in.close();
}
}
