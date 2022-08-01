//50
public class func{
	public void getFileContents(File file){
        BufferedReader reader = new BufferedReader(new FileReader(file));
        while (reader.ready()) {
            contents += reader.readLine() + '\n';
        }
}
}
