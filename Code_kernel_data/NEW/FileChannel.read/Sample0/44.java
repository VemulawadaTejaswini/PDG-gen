//43
public class func{
	public void doTest(ApplicationContext ctx,String baseUrl,String contentUrl){
        HttpAlfrescoStore store = new HttpAlfrescoStore();
        store.setTransactionService(transactionService);
        store.setAuthenticationService(authenticationService);
        store.setBaseHttpUrl(baseUrl);
        ContentReader reader = store.getReader(contentUrl);
        boolean exists = reader.exists();
        if (!exists)
        {
            System.out.println(
                    "   Content doesn't exist: " + contentUrl);
            return;
        }
        else
        {
            System.out.println(
                    "   Content exists: " + contentUrl);
        }
        ContentData contentData = reader.getContentData();
        ByteBuffer buffer = ByteBuffer.allocate((int)reader.getSize());
        FileChannel channel = reader.getFileChannel();
            int count = channel.read(buffer);
            if (count != reader.getSize())
            {
                System.err.println("The number of bytes read was " + count + " but expected " + reader.getSize());
                return;
            }
            channel.close();
}
}
