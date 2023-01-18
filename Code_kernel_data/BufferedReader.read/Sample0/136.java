//135
public class func{
	public void readReaderContents(Reader r){
            reader= new BufferedReader(r);
            while ((read= reader.read(part)) != -1)
                buffer.append(part, 0, read);
            return buffer.toString();
}
}
