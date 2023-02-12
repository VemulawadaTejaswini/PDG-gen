public class func{
public void setUp(){
        Connection connection = DriverManager.getConnection(Framework.getProperty(URL_PROPERTY),
                Framework.getProperty(USER_PROPERTY), Framework.getProperty(PASSWORD_PROPERTY));
            doOnAllTables(connection, null, "public", "DROP TABLE \"%s\" CASCADE");
            Statement st = connection.createStatement();
            executeSql(st, "DROP SEQUENCE IF EXISTS hierarchy_seq");
            st.close();
}
}
