public class func{
public void main(String... args){
        ByteBuffer buffer = ByteBuffer.allocateDirect(4096).order(ByteOrder.nativeOrder());
        while (fc.read(buffer) > 0) {
            for (int i = 0; i < buffer.capacity(); i += 4 * 16) {
                long indexStart = buffer.getLong(i);
                if (indexStart == 0 && zeros++ > 2) {
                    continue;
                }
                System.out.print(count + ": ");
                count += 14;
                System.out.print(HEX ? Long.toHexString(indexStart) : String.valueOf(indexStart));
                for (int j = i + 8; j < i + 64; j += 4) {
                    System.out.print(' ');
                    int offset = buffer.getInt(j);
                    System.out.print(HEX ? Integer.toHexString(offset) : String.valueOf(offset));
                }
                System.out.println();
            }
            buffer.clear();
        }
        fc.close();
}
}
