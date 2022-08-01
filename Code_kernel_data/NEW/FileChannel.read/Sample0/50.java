//49
public class func{
	public void main(String[] args){
        FileInputStream fis = new FileInputStream(blah);
        FileChannel fc = fis.getChannel();
        long bytesRead = fc.read(dstBuffers) ;
        if (bytesRead != 0)
            throw new RuntimeException("Nonzero return from read");
        fc.close();
}
}
