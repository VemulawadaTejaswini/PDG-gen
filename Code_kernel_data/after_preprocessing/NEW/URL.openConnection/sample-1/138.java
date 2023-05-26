//138
public class func{
public void deleteWorksheet(Spreadsheet spreadsheet,Worksheet worksheet,String authToken){
        String requestUrl= "https://spreadsheets.google.com/feeds/worksheets/" + spreadsheet.getId() + "/private/full/" + worksheet.getId() + "/0" + "?access_token=" + authToken;
        URL url = new URL(requestUrl);
        HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();
        conn.setRequestMethod("DELETE");
        conn.addRequestProperty("If-Match", "*");
        if (conn.getResponseCode() / 100 >= 3) {
            String s = new String(IOUtils.toByteArray(conn.getErrorStream()));
            throw new Exception(s);
        }
}
}
