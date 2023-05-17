//40
public class func{
public void dropTable(Connection c,String name){
            Statement s = c.createStatement();
            s.execute("drop table "+name);
            s.close();
}
}
