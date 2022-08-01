//46
public class func{
	public void readFile(String file,PrintWriter errorWriter){
                BufferedReader reader = new BufferedReader(new FileReader(f));
                while ((numRead = reader.read(buf)) != -1) {
                    String readData = String.valueOf(buf, 0, numRead);
                    fileData.append(readData);
                }
                reader.close();
}
}
