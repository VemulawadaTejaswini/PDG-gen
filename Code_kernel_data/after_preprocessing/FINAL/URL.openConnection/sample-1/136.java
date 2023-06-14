public class func{
public void getWorksheets(Spreadsheet spreadsheet,String authToken){
        String worksheetAddress = "https://spreadsheets.google.com/feeds/worksheets/" + spreadsheet.getId() + "/private/full?access_token=" + authToken;
        URL url = new URL(worksheetAddress);
        HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
        if (conn.getResponseCode() / 100 >= 3) {
            String s = new String(IOUtils.toByteArray(conn.getErrorStream()));
            throw new RuntimeException(s);
        }
        List<Worksheet> worksheetList = EntryFactory.getEntries(Worksheet.class, conn.getInputStream());
}
}
