//88
public class func{
public void ConfigDao(){
        this.connection = getConnection();
            this.connection.prepareStatement("SELECT * FROM config;");
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString("member") + "\t" + rs.getString("config"));
        }
        rs.close();
}
}
