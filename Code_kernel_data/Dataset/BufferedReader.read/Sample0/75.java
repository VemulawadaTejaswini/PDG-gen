//74
public class func{
	public void loadAddress(final String interfaceName){
            final BufferedReader reader = new BufferedReader(new FileReader(filePath), 1024);
            while ((numRead = reader.read(buf)) != -1) {
                readData = String.valueOf(buf, 0, numRead);
                fileData.append(readData);
            }
            reader.close();
}
}
