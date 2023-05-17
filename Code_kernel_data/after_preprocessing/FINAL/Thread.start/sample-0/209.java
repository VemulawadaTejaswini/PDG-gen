public class func{
public void uploadToGeoGebraTube(final JList toolList){
    Thread runner = new Thread() {
      @Override
      public void run() {
        model.uploadToGeoGebraTube(toolList.getSelectedValues());
      }
    };
    runner.start();
}
}
