//139
public class func{
	public void execute(final String cmd){
            reader = new BufferedReader(new FileReader(file));
            while ((numRead = reader.read(buf)) != -1) {
                String readData = String.valueOf(buf, 0, numRead);
                builder.append(readData);
                buf = new char[1024];
            }
}
}
