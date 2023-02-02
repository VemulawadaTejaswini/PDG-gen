//80
public class func{
	public void readTextFile(File file){
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while(-1 != (bytes = reader.read(buf)))
                fileData.append(buf, 0, bytes);
            reader.close();
}
}
