//21
public class func{
	public void doFileUpload(String file_path){
      inStream = new DataInputStream(conn.getInputStream());
      while ((str = inStream.readLine()) != null) {
        Log.e("doFileUpload", "Server Response" + str);
      }
      inStream.close();
}
}
