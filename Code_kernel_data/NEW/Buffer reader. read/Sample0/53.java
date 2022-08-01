//52
public class func{
	public void run(){
                reader = new BufferedReader(
                        new FileReader(jobFilePath));
                while((numRead=reader.read(buf)) > 0){
                    fileData.append(buf, 0, numRead);
                }
                reader.close();
}
}
