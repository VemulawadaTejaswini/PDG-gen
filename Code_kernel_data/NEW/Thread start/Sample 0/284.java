//283
public class func{
	public void addItem(final BibItem item){
        new Thread(new Runnable() {
            public void run(){
                item.writeToDB(mContext.getContentResolver());
                mHandler.sendMessage(Message.obtain(mHandler, 
                                       BibItemListAdapter.INSERTED_ITEM, item));
            }
        }).start();
}
}
