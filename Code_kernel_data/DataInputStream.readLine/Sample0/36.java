//35
public class func{
	public void addFile(File qf){
    while (dis.available() != 0) {
      qsb.append(dis.readLine() + "\n");
    }
    qMap.put(qf.getName(), qsb.toString());
}
}
