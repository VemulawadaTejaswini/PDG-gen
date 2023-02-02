//27
public class func{
public void readAsString(String filename,String newLineString){
        File file = new File(filename);
        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fis);
        DataInputStream dis = new DataInputStream(bis);
        while (dis.available() != 0) {
            sb.append((new StringBuilder()).append(dis.readLine()).append(newLineString));
        }
        fis.close();
}
}
