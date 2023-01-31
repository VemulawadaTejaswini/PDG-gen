//49
public class func{
	public void readFileAsString(String filePath){
        BufferedReader reader = new BufferedReader(new FileReader(testResourceFile));
        while ((numRead = reader.read(buf)) != -1) {
            String readData = String.valueOf(buf, 0, numRead);
            fileData.append(readData);
            buf = new char[1024];
        }
        reader.close();
}
}
