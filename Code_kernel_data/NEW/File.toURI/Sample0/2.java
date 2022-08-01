//1
public class func{
	public void toFileList(File parent,List<String> names){
        for (String name : names) {
            // don't call getCanonicalFile here because otherwise we'll be forced to call getCanonical* everywhere
            result.add(new File(new File(parent, name).toURI().normalize()));
        }
}
}
