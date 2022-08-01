//56
public class func{
	public void transferData(Reader src,Writer dest,long charsToCopy){
        BufferedWriter out = new BufferedWriter(dest, BUFFER_SIZE);
        while ((read = in.read(bridge, 0, (int)Math.min(charsLeft, BUFFER_SIZE))) > 0) {
            out.write(bridge, 0, read);
            charsLeft -= read;
        }
        in.close();
}
}
