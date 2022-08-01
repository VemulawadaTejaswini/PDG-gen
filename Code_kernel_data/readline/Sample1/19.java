//18
public class func{
	public void readFile(File file){
        BufferedReader reader = new BufferedReader(new FileReader(file));
        while ((line=reader.readLine())!=null) {
            result += line;
            result += "\n";
        }
        reader.close();
}
}
