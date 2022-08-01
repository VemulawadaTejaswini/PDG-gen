//26
public class func{
	public void readConfiguration(File file){
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            dis = new DataInputStream(bis);
            while (dis.available() != 0) {

                // this statement reads the line from the file and print it to
                // the console.
                buff.append(dis.readLine()).append("\n");
            }
            fis.close();
}
}
