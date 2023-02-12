public class func{
public void index(Map<String,Object> context){
        File file = LoggerFactory.getFile();
        if (file != null && file.exists()) {
            FileInputStream fis = new FileInputStream(file);
            FileChannel channel = fis.getChannel();
            size = channel.size();
            ByteBuffer bb;
            if (size <= SHOW_LOG_LENGTH) {
                bb = ByteBuffer.allocate((int) size);
                channel.read(bb, 0);
            } else {
                int pos = (int) (size - SHOW_LOG_LENGTH);
                bb = ByteBuffer.allocate(SHOW_LOG_LENGTH);
                channel.read(bb, pos);
            }
            bb.flip();
            content = new String(bb.array()).replace("<", "&lt;").replace(">", "&gt;");
            modified = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(file.lastModified()));
        } else {
            size = 0;
            content = "";
            modified = "Not exist";
        }
}
}
