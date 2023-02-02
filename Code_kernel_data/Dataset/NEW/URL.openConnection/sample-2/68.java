//68
public class func{
public void createFromURL(URL location){
    return createFromStream(location.openConnection().getInputStream());
}
}
