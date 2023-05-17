//170
public class func{
public void onClick(View v){
        new Thread(new Runnable(){
          public void run() {
            Intent intent = new Intent(TetherService.INTENT_MANAGE);
            intent.putExtra("state", TetherService.MANAGE_START);
            Log.d(MSG_TAG, "SENDING MANAGE: " + intent);
            MainActivity.this.sendBroadcast(intent);  
          }
        }).start();
}
}
