//36
public class func{
public void testAudioMuxer(File wav,File out){
        ByteBuffer buffer = ByteBuffer.allocate(3 * 24000);
        while (ch.read(buffer) != -1) {
            track.addSamples(buffer);
        }
}
}
