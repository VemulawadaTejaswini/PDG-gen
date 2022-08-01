//9
public class func{
	public void runConsole(String sCmd){
        while ((read = reader.read(buffer)) > 0) {
            output.append(buffer, 0, read);
        }
        reader.close();
}
}
