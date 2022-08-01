//31
public class func{
	public void main(String[] args){
            FileInputStream fis = new FileInputStream(args[0]);
            DataInputStream dis = new DataInputStream(fis);
            while ((line = dis.readLine()) != null) {
                if (isWindows) {
                    line = line.replace('/', File.separatorChar);
                }
                roots.add(line);
            }
}
}
