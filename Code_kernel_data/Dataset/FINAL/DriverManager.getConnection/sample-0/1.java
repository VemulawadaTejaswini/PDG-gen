public class func{
public void init(){
        DriverManager.registerDriver(new Driver());
        connCell = DriverManager.getConnection("jdbc:h2:~/" + NAMESPACE_CELL + ";DATABASE_TO_UPPER=FALSE", "sa", "");
        createTables(connCell, NAMESPACE_CELL, INPUT_TABLE, OUTPUT_CELLS_TABLE);
        deleteData(connCell, NAMESPACE_CELL, INPUT_TABLE, OUTPUT_CELLS_TABLE);
        connEntity = DriverManager.getConnection("jdbc:h2:~/" + NAMESPACE_ENTITY + ";DATABASE_TO_UPPER=FALSE", "sa", "");
        createTables(connEntity, NAMESPACE_ENTITY, INPUT_TABLE, OUTPUT_ENTITY_TABLE);
        deleteData(connEntity, NAMESPACE_ENTITY, INPUT_TABLE, OUTPUT_ENTITY_TABLE);
}
}
