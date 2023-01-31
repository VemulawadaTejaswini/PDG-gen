//58
public class func{
	public void parsePackageList(String packageList){
    StringReader reader = new StringReader(packageList);
    BufferedReader breader = new BufferedReader(reader);
    while ((line = breader.readLine()) != null) {
      packages.add(line);
    }
}
}
