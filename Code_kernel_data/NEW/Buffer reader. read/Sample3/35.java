//34
public class func{
	public void getText(BufferedReader reader){
            while ((nbCharRead = reader.read(charBuffer)) != -1) {
                // appends buffer
                answer.append(charBuffer, 0, nbCharRead);
            }
}
}
