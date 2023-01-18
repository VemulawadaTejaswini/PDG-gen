//81
public class func{
	public void read(String fileName){
    FileReader reader = new FileReader(fileName);
    BufferedReader b = new BufferedReader(reader);
    while ((n = b.read(buffer, 0, buffer.length)) != -1) 
      builder.append(buffer, 0, n);
    b.close();
}
}
