//105
public class func{
public void downloadAndUpdate(List<String> downloadList){
        for (String filename : downloadList) {
            URL url = new URL(URL_PREFIX + filename);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.connect();

            if (urlConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                FileHelper.downloadFile(filename, urlConnection);
            } else {
                System.out.println(filename + " error status : " + urlConnection.getResponseMessage());
            }
        }
}
}
