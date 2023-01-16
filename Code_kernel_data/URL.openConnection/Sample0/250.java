//249
public class func{
	public void doInBackground(View[] params){
        URL url = new URL(((EditText) params[0]).getText().toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        String header = conn.getHeaderField("Content-Disposition");
        if (header != null && header.indexOf("=") != -1) {
          return new Object[]{params[1], header.split("=")[1].replace("\"", "")};
        }
}
}
