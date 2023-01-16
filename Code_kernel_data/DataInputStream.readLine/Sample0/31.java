//30
public class func{
	public void read(String filename){
        File file = new File(filename);
        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fis);
        DataInputStream dis = new DataInputStream(bis);
        while(dis.available() != 0){
            output.add(dis.readLine());
        }
        fis.close();
}
}
