public class func{
public void decodeCRS(String srsName){
        if (srs != null) {
            if ("http".equals(srs.getScheme()) && "www.opengis.net".equals(srs.getAuthority())
                    && "/gml/srs/epsg.xml".equals(srs.getPath()) && (srs.getFragment() != null)) {
                try {
                    return CRS.decode("EPSG:" + srs.getFragment(), true);
                } catch (Exception e) {
                    try {
                        return CRS.decode(srs.toString(), true);
                    } catch (Exception e1) {
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
