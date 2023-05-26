public class func{
public void openConnection(String location){
        do
        {
            URL skinURL = new URL(location);
            connection = skinURL.openConnection();
            location = connection.getHeaderField("Location");
        }
        while(location != null);
}
}
