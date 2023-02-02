//31
public class func{
public void getRelatedPart(PackageRelationship rel){
       if(! isRelationshipExists(rel)) {
          throw new IllegalArgumentException("Relationship " + rel + " doesn't start with this part " + _partName);
       }
       URI target = rel.getTargetURI();
       if(target.getFragment() != null) {
          String t = target.toString();
          try {
             target = new URI( t.substring(0, t.indexOf('#')) );
          } catch(URISyntaxException e) {
             throw new InvalidFormatException("Invalid target URI: " + target);
          }
       }
       PackagePartName relName = PackagingURIHelper.createPartName(target);
       PackagePart part = _container.getPart(relName);
       if (part == null) {
           throw new IllegalArgumentException("No part found for relationship " + rel);
       }
}
}
