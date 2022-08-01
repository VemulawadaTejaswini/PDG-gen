//121
public class func{
	public void doInBackground(String... params){
                                BufferedReader in = new BufferedReader(new InputStreamReader(conn
                                        .getInputStream()));
                                while ((len = in.read(buf)) != -1) {
                                    obj.append(buf, 0, len);
                                }
                                res.putExtra(DB.ACCOUNT.AUTH_CONFIG, obj.toString());
}
}
