//108
public class func{
	public void asyncDelete(final Uri uri,final String selection,final String[] selectionArgs){
        new Thread(new Runnable() {
            public void run() {
                SqliteWrapper.delete(mContext, mContentResolver, uri, selection, selectionArgs);
            }
        }).start();
}
}
