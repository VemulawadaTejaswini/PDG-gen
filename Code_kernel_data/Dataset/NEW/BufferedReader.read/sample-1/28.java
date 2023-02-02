//28
public class func{
public void readJson(){
      while ((num = input.read(buffer)) > 0) {
        content.append(buffer, 0, num);
      }
      MyObject myobj = JsonHelper.parseGson(content.toString());
      if (myobj != null) {
        // Update ui
        if (jsonView != null)
          jsonView.setText(myobj.toString());
          Log.i(TAG,myobj.toString());
      }
}
}
