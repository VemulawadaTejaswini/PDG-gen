public class func{
public void readCoreStatus(){
        URL coreStatusURL = new URL("http://localhost:8983/solr/admin/cores?action=STATUS");
        HttpURLConnection coreStatusConn = (HttpURLConnection) coreStatusURL.openConnection();
        coreStatusConn.connect();
        if (coreStatusConn.getResponseCode() != 200) {
            throw new RuntimeException("Fetch Solr core status: expected status 200 but got: " +
                    coreStatusConn.getResponseCode());
        }
        InputStream is = coreStatusConn.getInputStream();
        Document doc = DocumentHelper.parse(is);
        is.close();
}
}
