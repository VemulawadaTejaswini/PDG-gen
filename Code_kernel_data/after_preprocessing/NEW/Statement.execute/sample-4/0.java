//0
public class func{
public void exportTableGeometryCollection(){
        Statement stat = connection.createStatement();
        stat.execute("CALL SHPWrite('target/geomcoll_export.shp', 'GEOM_COLL')");
}
}
