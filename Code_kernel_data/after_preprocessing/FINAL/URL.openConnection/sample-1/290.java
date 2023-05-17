public class func{
public void getImageConnection(final Integer id){
      rv = new URL(String.format(imageUrlFormat, "s", id)).openConnection();      
}
}
