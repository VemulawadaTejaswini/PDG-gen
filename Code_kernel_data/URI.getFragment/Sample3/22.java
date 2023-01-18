//21
public class func{
	public void decodeCRS(String srsName){
        if (srs != null) {
            // TODO: JD, this is a hack until GEOT-1136 has been resolved
            if ("http".equals(srs.getScheme()) && "www.opengis.net".equals(srs.getAuthority())
                    && "/gml/srs/epsg.xml".equals(srs.getPath()) && (srs.getFragment() != null)) {
                try {
                    return CRS.decode("EPSG:" + srs.getFragment(), true);
                } catch (Exception e) {
                    // failed, try as straight up uri
                    try {
                        return CRS.decode(srs.toString(), true);
                    } catch (Exception e1) {
                        // failed again, do nothing ,should fail below as well
                    }
                }
            }
        }
            return CRS.decode(srsName, true);
            if (srsName.toUpperCase().startsWith("URN")) {
                String code = srsName.substring(srsName.lastIndexOf(":") + 1);
                try {
                    return CRS.decode("EPSG:" + code, true);
                } catch (Exception e1) {
                    throw new GeoXACMLException("Could not create crs: " + srs, e);
                }
            }
            throw new GeoXACMLException("Could not create crs: " + srs, e);
}
}
