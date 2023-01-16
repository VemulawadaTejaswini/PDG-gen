//97
public class func{
	public void loadURL(URI uri){
          final ModeController modeController = Controller.getCurrentModeController();
          modeController.getMapController().newMap(url);
          final String ref = uri.getFragment();
          if (ref != null) {
            final ModeController newModeController = Controller.getCurrentModeController();
            final MapController newMapController = newModeController.getMapController();
            newMapController.select(newMapController.getNodeFromID(ref));
          }
}
}
