//41
public class func{
public void getPermission(){
        URL jarFileUrl = new File(jarFile.getName()).toURI().toURL();
        return jarFileUrl.openConnection().getPermission();
}
}
