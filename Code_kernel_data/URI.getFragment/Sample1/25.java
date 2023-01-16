//24
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
        URI absoluteUri = getAbsoluteUri(uri);
        if (absoluteUri == null) {
          final MapModel map = Controller.getCurrentController().getMap();
          if (map.getURL() == null)
            UITools.errorMessage(TextUtils.getText("map_not_saved"));
          else
            UITools.errorMessage(TextUtils.format("link_not_found", String.valueOf(uri)));
          return;
        }
        uri = absoluteUri;
      }
      if(! asList(FILE_SCHEME, SMB_SCHEME, FREEPLANE_SCHEME).contains(uri.getScheme())) {
}
}
