public class func{
public void crs(Node node){
        if (node.getAttribute("srsName") != null) {
            URI srs = null;
            Object raw = node.getAttributeValue("srsName");

            if (raw instanceof URI) {
                srs = (URI) raw;
            } else if (raw instanceof String) {
                try {
                    srs = new URI((String) raw);
                } catch (URISyntaxException e) {
                }
            }

            if (srs != null) {
                if ("http".equals(srs.getScheme()) && "www.opengis.net".equals(srs.getAuthority())
                        && "/gml/srs/epsg.xml".equals(srs.getPath()) && (srs.getFragment() != null)) {
                    try {
                        return CRS.decode("EPSG:" + srs.getFragment());
                    } catch (Exception e) {
                        try {
                            return CRS.decode(srs.toString());
                        } catch (Exception e1) {
                        }
                    }
                }
            }

            try {
                return CRS.decode(raw.toString());
            } catch (NoSuchAuthorityCodeException e) {
                final String crs = raw.toString();
                if (crs.toUpperCase().startsWith("URN")) {
                    String code = crs.substring(crs.lastIndexOf(":") + 1);
                    try {
                        return CRS.decode("EPSG:" + code);
                    } catch (Exception e1) {
                        throw new RuntimeException("Could not create crs: " + srs, e);
                    }
                }
            } catch (FactoryException e) {
                throw new RuntimeException("Could not create crs: " + srs, e);
            }
        }
}
}
