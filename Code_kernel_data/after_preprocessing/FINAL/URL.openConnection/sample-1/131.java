public class func{
public void findDocuments(String title,String authToken){
        URL url = new URL("https:
        HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
        conn.setRequestProperty("Authorization", "Bearer " + authToken);
        if (conn.getResponseCode() >= 300) {
            String s = new String(IOUtils.toByteArray(conn.getErrorStream()));
            throw new RuntimeException(s);
        }
        List<Document> documentList = EntryFactory.getEntriesFromDriveApi(Document.class, conn.getInputStream());
}
}
