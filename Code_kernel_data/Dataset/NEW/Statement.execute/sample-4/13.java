//13
public class func{
public void exportUnknownhSRIDPRJ(){
        Statement stat = connection.createStatement();
        stat.execute("CALL SHPWrite('target/area_export10.shp', 'AREA')");        
}
}
