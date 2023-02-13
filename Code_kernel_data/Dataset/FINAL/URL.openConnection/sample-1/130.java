public class func{
public void getFolders(String authToken){
        URL url = new URL("https:
        HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
        conn.setRequestProperty("Authorization", "Bearer " + authToken);
        if (conn.getResponseCode() / 100 >= 3) {
            String s = new String(IOUtils.toByteArray(conn.getErrorStream()));
            throw new IOException(s);
        }
        List<Folder> folderList = EntryFactory.getEntriesFromDriveApi(Folder.class, conn.getInputStream());
}
}
