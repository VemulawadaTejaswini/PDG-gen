public class func{
public void select(SSPHandler sspHandler){
        Iterator<Element> iter = getElements().get().iterator();
        while (iter.hasNext()){
            el = iter.next();
            try {
                URI uri = new URI(el.absUrl(HREF_ATTR));
                if (isLinkWithProperExtension(uri)) {
                    if (StringUtils.isNotBlank(uri.getFragment())) {
                        iter.remove();
                    } else {
                        linkWithSimpleExtension.add(el);
                    }
                }
            } catch (Exception ex){}
        }
}
}
