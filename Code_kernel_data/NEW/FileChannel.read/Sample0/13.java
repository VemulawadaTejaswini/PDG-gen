//12
public class func{
	public void drain(FileChannel channel,long position,long count){
                if (buffer == null) buffer = DRAIN_BUFFER.duplicate();
                if ((long) buffer.limit() > count) buffer.limit((int) count);
                ires = channel.read(buffer);
                buffer.clear();
                switch (ires) {
                    case -1: return total == 0L ? -1L : total;
                    case 0: return total;
                    default: total += (long) ires;
                }
}
}
