//281
public class func{
	public void erasePermissions(){
        new Thread(new Runnable(){
            public void run(){
                getContentResolver().delete(Database.ACCESS_URI,
                        Access.COL_ACCT + "=?",
                        new String[] { String.valueOf(keyid) });
            }
        }).start();
}
}
