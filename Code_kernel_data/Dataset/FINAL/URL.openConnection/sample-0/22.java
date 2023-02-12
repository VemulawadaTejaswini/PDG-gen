public class func{
public void doInBackground(String... serverURL){
                URL u = new URL(serverURL[0]);
                HttpURLConnection huc = (HttpURLConnection) u.openConnection();
                huc.setRequestMethod("GET"); // OR huc.setRequestMethod
                huc.connect();
                int code = huc.getResponseCode();
                if (code == 200) {
                    return true;
                }
}
}
