//53
public class func{
	public void getText(String filename,Class source){
            while ((nb = reader.read(buffer, 0, 1024)) >= 0) {
                res.append(buffer, 0, nb);
            }
            return res.toString();
}
}
