//282
public class func{
	public void replaceItem(final BibItem replacement){
        new Thread(new Runnable() {
            public void run(){
                replacement.writeToDB(cr);
                mHandler.sendMessage(Message.obtain(mHandler,
                       BibItemListAdapter.REPLACED_ITEM, replacement));
            }
        }).start();
}
}
