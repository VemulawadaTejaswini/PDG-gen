//19
public class func{
	public void read(File file){
            while ((len = reader.read(buffer, 0, BUFFER_SIZE)) != -1) {
                builder.append(buffer, 0, len);
            }
            return builder.toString();
}
}
