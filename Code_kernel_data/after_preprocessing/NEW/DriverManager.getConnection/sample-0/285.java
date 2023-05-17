//285
public class func{
public void testExecute(){
        remover.setConnection(DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD));
        remover.setUpgradeDir(UPGRADE_DIR);
        remover.execute();
}
}
