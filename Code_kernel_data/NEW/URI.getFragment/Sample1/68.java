//67
public class func{
	public void annotate(Document document,AnnotationInfo[] annotations){
      URI          context    = new URI(annotations[i].getContext());
      String       expression = URLDecoder.decode(context.getFragment());
      LocationList list       = XPointerAPI.evalFullptr(document, expression);
      int          length     = list.getLength();
      for (int j = 0; j < length; j++) {
        Location location = list.item(j);
        Range    range;

        if (location.getType() == Location.RANGE)
          range = (Range) location.getLocation();
        else {
          range = ((DocumentRange) document).createRange();
          range.selectNode((Node) location.getLocation());
        }

        // Ignore it if this range is collapsed (ie. start == end)
        if (!range.getCollapsed())
          srl.insert(new SelectionRange(range, annotations[i]));
      }
    srl.surroundContents(NS, "aml:annotated", "aml:id", "aml:first");
    Element index = document.createElementNS(NS, "aml:regions");
    document.getDocumentElement().appendChild(index);
}
}
