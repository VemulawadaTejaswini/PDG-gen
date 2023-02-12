public class func{
public void execute(String sql){
        MyBatisComponent component = camelContext.getComponent("mybatis", MyBatisComponent.class);
        Connection con = component.getSqlSessionFactory().getConfiguration().getEnvironment().getDataSource().getConnection();
        Statement stm = con.createStatement();
        stm.execute(sql);
}
}
