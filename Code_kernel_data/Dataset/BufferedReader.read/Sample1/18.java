//17
public class func{
	public void executeCommand(String command){
        while ((read = reader.read(buffer)) > 0) {
          output.append(buffer, 0, read);
        }
        reader.close();
}
}
