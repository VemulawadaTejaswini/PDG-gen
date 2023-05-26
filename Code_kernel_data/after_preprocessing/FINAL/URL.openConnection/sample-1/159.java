public class func{
public void update(){
        String str = this.headers.get(Constants.BUNDLE_UPDATELOCATION);
            if (str == null) {
        str = this.location;
      }
      update(new URL(str).openConnection().getInputStream());
            throw new BundleException("Could not update " + toString()
                    + " from " + str, e);
}
}
