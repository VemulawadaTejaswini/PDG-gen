//159
public class func{
	public void getTotalSavedBlocks(ZoneVolume volume,String zoneName){
    File databaseFile = new File(War.war.getDataFolder(), String.format("/dat/warzone-%s/volume-%s.sl3", zoneName, volume.getName()));
    Connection databaseConnection = DriverManager.getConnection("jdbc:sqlite:" + databaseFile.getPath());
    Statement stmt = databaseConnection.createStatement();
    ResultSet sizeQuery = stmt.executeQuery("SELECT COUNT(*) AS total FROM blocks");
    int size = sizeQuery.getInt("total");
    sizeQuery.close();
}
}
