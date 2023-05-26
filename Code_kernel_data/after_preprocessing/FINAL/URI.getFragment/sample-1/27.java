public class func{
public void getElement(URI path,boolean loadIfAbsent){
            URI xmlBase = new URI(path.getScheme(), path.getSchemeSpecificPart(), null);
            SVGDiagram dia = (SVGDiagram) loadedDocs.get(xmlBase);
            if (dia == null && loadIfAbsent)
            {
                URL url = xmlBase.toURL();
                loadSVG(url, false);
                dia = (SVGDiagram) loadedDocs.get(xmlBase);
                if (dia == null)
                {
                    return null;
                }
            }
            String fragment = path.getFragment();
            return fragment == null ? dia.getRoot() : dia.getElement(fragment);
}
}
