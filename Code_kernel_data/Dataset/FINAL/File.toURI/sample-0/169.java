public class func{
public void name(String name){
      database.setName(name);
      File databaseFolder = new File(warehouseFolder, name + ".db");
      String databaseLocation = "raw://" + databaseFolder.toURI().getPath();
      database.setLocationUri(databaseLocation);
}
}
