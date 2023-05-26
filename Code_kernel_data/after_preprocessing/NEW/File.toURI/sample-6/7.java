//7
public class func{
public void checkThatFileResourceExists(){
        final FileResource nonExisting = new FileResource("devNullFile");
        assertFalse(nonExisting.exists());
        final File file = new File(getClass().getResource("/cache1.ini").toURI());
        assertTrue(file.exists());
        final FileResource existing = new FileResource(file.toURI().toString());
        assertTrue(existing.exists());
}
}
