public class func{
public void getCon(){
    if(con==null){
      try {
        con=DriverManager.getConnection(url,user,password);
      } catch (SQLException e) {
        System.out.println("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Ý¿ï¿½ï¿½ï¿½ï¿½ï¿½Ê§ï¿½Ü£ï¿½");
        con=null;
        e.printStackTrace();
      }      
    }
}
}
