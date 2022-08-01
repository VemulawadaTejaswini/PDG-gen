//84
public class func{
	public void main(String args[]){
        final BufferedReader reader = new BufferedReader( new FileReader(configFile));
        while ((numRead = reader.read(buf)) != -1) {
            String readData = String.valueOf(buf, 0, numRead);
            sb.append(readData);
        }
        reader.close();
}
}
