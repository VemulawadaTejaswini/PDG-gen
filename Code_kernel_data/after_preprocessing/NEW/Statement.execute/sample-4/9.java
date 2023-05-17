//9
public class func{
public void exportTableWithNullGeom(){
        Statement stat = connection.createStatement();
        stat.execute("CALL SHPWrite('target/area_export3.shp', 'AREA')");
}
}
