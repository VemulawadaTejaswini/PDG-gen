public class func{
public void createTable(Connection conn,ByteString topic){
            String tableName = getTableNameForTopic(topic);
            stmt.execute("CREATE TABLE " + tableName + " (" + ID_FIELD_NAME + " BIGINT NOT NULL CONSTRAINT ID_PK_"
                         + tableName + " PRIMARY KEY," + MSG_FIELD_NAME + " BLOB(2M) NOT NULL)");
}
}
