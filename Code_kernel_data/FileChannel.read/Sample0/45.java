//44
public class func{
	public void storeFilesUpgradeable(File neoStoreFile){
        for ( String fileName : fileNamesToExpectedVersions.keySet() )
        {
            String expectedVersion = fileNamesToExpectedVersions.get( fileName );
            FileChannel fileChannel = null;
            byte[] expectedVersionBytes = UTF8.encode( expectedVersion );
            try
            {
                File storeFile = new File( storeDirectory, fileName );
                if (!storeFile.exists()) {
                    return false;
                }
                fileChannel = new RandomAccessFile( storeFile, "r" ).getChannel();
                fileChannel.position( fileChannel.size() - expectedVersionBytes.length );
                byte[] foundVersionBytes = new byte[expectedVersionBytes.length];
                fileChannel.read( ByteBuffer.wrap( foundVersionBytes ) );
                if ( !expectedVersion.equals( UTF8.decode( foundVersionBytes ) ) )
                {
                    return false;
                }
            } catch ( IOException e )
            {
                throw new RuntimeException( e );
            } finally
            {
                if ( fileChannel != null )
                {
                    try
                    {
                        fileChannel.close();
                    } catch ( IOException e )
                    {
                        // Ignore exception on close
                    }
                }
            }
        }
}
}
