//6
public class func{
public void fileDigest(File file){
        FileChannel channel = new FileInputStream(file).getChannel();
        ByteBuffer buffer = ByteBuffer.allocate((int) channel.size());
        channel.read(buffer);
        return new BigInteger(1,digest.digest(buffer.array()));
}
}
