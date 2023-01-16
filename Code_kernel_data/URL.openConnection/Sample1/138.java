//137
public class func{
	public void deleteDocument(Document document,String authToken){
        URL url = new URL("https://www.googleapis.com/drive/v2/files/" + document.getId());
        HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
        conn.setRequestProperty("Authorization", "Bearer " + authToken);
        conn.setRequestMethod("DELETE");
        if (conn.getResponseCode() / 100 >= 3) {
            String s = new String(IOUtils.toByteArray(conn.getErrorStream()));
            throw new RuntimeException(s);
        }
}
}
