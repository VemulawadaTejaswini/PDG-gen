//67
public class func{
	public void isFilePortionNull(int startByte,int endByte){
            fis = new FileInputStream(file);
            fc = fis.getChannel();
            fc.position(startByte);
            ByteBuffer bb = ByteBuffer.allocateDirect(endByte - startByte);
            fc.read(bb);
            while(bb.hasRemaining())
            {
                if(bb.get()!=0)
                {
                    return false;
                }
            }
}
}
