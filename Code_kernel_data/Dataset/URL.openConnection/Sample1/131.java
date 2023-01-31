//130
public class func{
	public void getFolders(String authToken){
        URL url = new URL("https://www.googleapis.com/drive/v2/files?q=" + URLEncoder.encode("mimeType = 'application/vnd.google-apps.folder'", "UTF-8"));
        HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
        conn.setRequestProperty("Authorization", "Bearer " + authToken);
        if (conn.getResponseCode() / 100 >= 3) {
            String s = new String(IOUtils.toByteArray(conn.getErrorStream()));
            throw new IOException(s);
        }
        List<Folder> folderList = EntryFactory.getEntriesFromDriveApi(Folder.class, conn.getInputStream());
}
}
