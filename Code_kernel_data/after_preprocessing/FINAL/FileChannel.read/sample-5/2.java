public class func{
public void getUploadData(){
        if (uploadResource_ == null)
            return null;
        File file = new File(uploadResource_.getStoreLocation());
        FileInputStream inputStream = new FileInputStream(file);
        FileChannel fchan = inputStream.getChannel();
        long fsize = fchan.size();
        ByteBuffer buff = ByteBuffer.allocate((int) fsize);
        fchan.read(buff);
        buff.rewind();
        byte[] data = buff.array();
        buff.clear();
}
}
