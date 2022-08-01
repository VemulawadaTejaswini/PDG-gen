//20
public class func{
	public void read(String name,ByteBuffer dst){
            checkAccess(file.getPathForPermissionCheck(), true, false);
        int fd = file.openForAttributeAccess(followLinks);
                int afd = openat(fd, nameAsBytes(file,name), (O_RDONLY|O_XATTR), 0);
                FileChannel fc = UnixChannelFactory.newFileChannel(afd, true, false);
                    if (fc.size() > dst.remaining())
                        throw new IOException("Extended attribute file too large");
                    while (dst.hasRemaining()) {
                        int n = fc.read(dst);
                        if (n < 0)
                            break;
                        total += n;
                    }
                    fc.close();
}
}
