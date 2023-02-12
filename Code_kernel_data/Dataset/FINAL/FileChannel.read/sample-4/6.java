public class func{
public void copyMuxing(){
                channel.position(be.dataOffset);
                int read = channel.read(bb);
                bb.flip();
                be.readFrames(bb);
}
}
