public class func{
public void startHideToolbarsThread(){
      if (mHideToolbarsRunnable != null) {
        mHideToolbarsRunnable.disable();
      }
      mHideToolbarsRunnable = new HideToolbarsRunnable(this, mToolbarsDisplayDuration * 1000);      
      new Thread(mHideToolbarsRunnable).start();
}
}
