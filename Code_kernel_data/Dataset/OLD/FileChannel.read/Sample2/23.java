//22
public class func{
	public void transferTo(){
            assertEquals (8, sourceChannel.transferTo(0, 8, fileChannel));
            assertEquals (10, sourceChannel.transferTo(8, 11, fileChannel));
            fileChannel.position(0);
            assertEquals(6, fileChannel.read(transferedMessage1));
            assertEquals(12, fileChannel.read(transferedMessage2));
}
}
