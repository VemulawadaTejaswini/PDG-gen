public class func{
public void read(FileChannel ch,ByteBuffer bb,final long start_position){
        while (bb.hasRemaining())
        {

            int read = ch.read(bb, position);
            if (read >= 0)
            {
                position += read;

                if (read == 0)
                {
                    Thread.yield();
                }
            } else
            {
                return 0;
            }
        }
}
}
