public class func{
public void appendSitemapIndex(String sitemap){
        while ((len = channel.read(byteBuf, tailIdx)) > 0) {
            byteBuf.rewind();
            byte[] dst = new byte[len];
            byteBuf.get(dst, 0, len);
            header.append(new String(dst, "UTF8"));
            headIdx = header.indexOf(SITEMAP_INDEX_TAIL_FLAG);
            if (headIdx != -1) {
                headPos = channel.size() - header.substring(headIdx).getBytes().length;
                break;
            }
        }
        FileLock lock = channel.tryLock(headPos, content.length, false);
            channel.write(ByteBuffer.wrap(content), headPos);
}
}
