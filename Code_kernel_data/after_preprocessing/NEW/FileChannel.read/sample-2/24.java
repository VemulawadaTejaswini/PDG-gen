//24
public class func{
public void testUTF16BOMMultipleFieldSeperators(){
        FileChannel fc = new RandomAccessFile(testFile,"r").getChannel();
        fc.read(bb);
        assertEquals('T',bb.get(10) & 0xFF);
        assertEquals('P',bb.get(11) & 0xFF);
        assertEquals('E',bb.get(12) & 0xFF);
        assertEquals('2',bb.get(13) & 0xFF);
        assertEquals(0xFF,bb.get(21) & 0xFF);
        assertEquals(0xFE,bb.get(22) & 0xFF);
        assertEquals(0xDE,bb.get(23) & 0xFF);
        assertEquals(0x03,bb.get(24) & 0xFF);
        assertEquals(0x00,bb.get(25) & 0xFF);
        assertEquals(0x00,bb.get(26) & 0xFF);
        assertEquals(0xFF,bb.get(27) & 0xFF);
        assertEquals(0xFE,bb.get(28) & 0xFF);
        assertEquals(0xDE,bb.get(29) & 0xFF);
        assertEquals(0x03,bb.get(30) & 0xFF);
        assertEquals(0x54,bb.get(31) & 0xFF);
        assertEquals(0x58,bb.get(32) & 0xFF);
        assertEquals(0x58,bb.get(33) & 0xFF);
        assertEquals(0x58,bb.get(34) & 0xFF);
}
}
