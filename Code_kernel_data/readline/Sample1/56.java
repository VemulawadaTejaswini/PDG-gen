//55
public class func{
	public void readFile(File cFile){
        while((line = fr.readLine()) != null){
            sb.append(line);
            System.err.print(line);
        }
        fr.close();
}
}
