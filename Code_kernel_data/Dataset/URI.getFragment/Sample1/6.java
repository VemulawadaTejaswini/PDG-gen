//5
public class func{
	public void crs(Node node){
        if (node.getAttribute("srsName") != null) {
            URI srs = null;
            Object raw = node.getAttributeValue("srsName");

            if (raw instanceof URI) {
                srs = (URI) raw;
            } else if (raw instanceof String) {
                //try to parse into a uri
                try {
                    srs = new URI((String) raw);
                } catch (URISyntaxException e) {
                    //failed, continue on
                }
            }

            if (srs != null) {
                //TODO: JD, this is a hack until GEOT-1136 has been resolved
                if ("http".equals(srs.getScheme()) && "www.opengis.net".equals(srs.getAuthority())
                        && "/gml/srs/epsg.xml".equals(srs.getPath()) && (srs.getFragment() != null)) {
                    try {
                        return CRS.decode("EPSG:" + srs.getFragment());
                    } catch (Exception e) {
                        //failed, try as straight up uri
                        try {
                            return CRS.decode(srs.toString());
                        } catch (Exception e1) {
                            //failed again, do nothing ,should fail below as well
                        }
                    }
                }
            }

            try {
                return CRS.decode(raw.toString());
            } catch (NoSuchAuthorityCodeException e) {
                // HACK HACK HACK!: remove when
                // http://jira.codehaus.org/browse/GEOT-1659 is fixed
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
