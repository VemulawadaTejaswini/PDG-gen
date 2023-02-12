public class func{
public void main(String[] args){
    URL u = new URL(url);
    HttpsURLConnection  conn =  (HttpsURLConnection) u.openConnection(); 
    conn.setRequestMethod("POST"); 
    OutputStream os = conn.getOutputStream();
    OutputStreamWriter osw = new OutputStreamWriter(os, "utf-8");
    PrintWriter pw = new PrintWriter(osw);
    pw.write(json);
    pw.flush();
    pw.close();
}
}
