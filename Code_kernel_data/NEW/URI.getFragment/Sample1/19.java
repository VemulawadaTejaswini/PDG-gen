//18
public class func{
	public void loadURL(URI uri){
    final String uriString = uri.toString();
    if (uriString.startsWith("#")) {
      final String target = uri.getFragment();
      try {
        final ModeController modeController = Controller.getCurrentModeController();
        final MapController mapController = modeController.getMapController();
        final NodeModel node = mapController.getNodeFromID(target);
        if (node != null) {
          mapController.select(node);
        }
      }
      catch (final Exception e) {
        LogUtils.warn("link " + target + " not found", e);
        UITools.errorMessage(TextUtils.format("link_not_found", target));
      }
      return;
    }
      final String extension = FileUtils.getExtension(uri.getRawPath());
      if(! uri.isAbsolute()){
        uri = getAbsoluteUri(uri);
        if(uri == null){
          UITools.errorMessage(TextUtils.getText("map_not_saved"));
          return;
        }
      }
      if(!"file".equals(uri.getScheme())) {
        try {
          uri = uri.toURL().openConnection().getURL().toURI().normalize();
        }
        catch (Exception e) {
          LogUtils.warn("link " + uri + " not found", e);
          UITools.errorMessage(TextUtils.format("link_not_found", uri.toString()));
        }
      }
}
}
