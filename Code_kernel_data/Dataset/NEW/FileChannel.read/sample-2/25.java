//25
public class func{
public void test1(){
            long bytesRead = fc.read(dstBuffers);
            for (int i=0; i<NUM_BUFFERS; i++) {
                for (int j=0; j<BUFFER_CAP; j++) {
                    byte b = dstBuffers[i].get(j);
                    if (b != expectedResult++)
                        throw new RuntimeException("Test failed");
                }
                dstBuffers[i].flip();
            }
}
}
