//86
public class func{
	public void runCommand(String command){
        while ((line = br.readLine()) != null) {
            stringBuffer.append(line);
            stringBuffer.append('\n');
        }
        return stringBuffer.toString();
}
}
