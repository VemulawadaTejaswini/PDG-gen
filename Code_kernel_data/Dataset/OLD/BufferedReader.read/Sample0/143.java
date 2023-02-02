//142
public class func{
	public void getTestFileContent(String file){
            reader = new BufferedReader(new FileReader(testFile));
            while ((numRead = reader.read(buf)) != -1) {
                stringWriter.write(buf, 0, numRead);
            }
            result = stringWriter.toString();
}
}
